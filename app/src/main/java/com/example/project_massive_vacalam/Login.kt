package com.example.project_massive_vacalam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.project_massive_vacalam.SharedPreferencesUtils.saveTokenToPreferences
import com.example.project_massive_vacalam.SharedPreferencesUtils.saveUserIdToPreferences
import com.example.project_massive_vacalam.databinding.ActivityLoginBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.masukButton.setOnClickListener {
            val email = binding.emailET.text.toString()
            val password = binding.passwordET.text.toString()

            val loginRequest = LoginRequest(email, password)

            ServiceGenerator.instanceRetrofit.login(email, password).enqueue(object : Callback<LoginResponse> {
                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                    if (response.isSuccessful) {
                        val loginResponse = response.body()
                        // Login successful, handle the response here

                        val token = loginResponse?.token
                        val userId = loginResponse?.id_user

                        // Save the token and userId to shared preferences
                        saveTokenToPreferences(this@Login, token)
                        saveUserIdToPreferences(this@Login, userId.toString())

                        // Redirect to the main activity or perform other desired actions
                        startActivity(Intent(this@Login, MainActivity::class.java))
                        finish()

                        // Show a success message to the user
                        Toast.makeText(this@Login, "Login Successful", Toast.LENGTH_SHORT).show()
                    } else {
                        // Login failed, handle the error response here

                        val errorMessage = response.errorBody()?.string()

                        // Show an error message to the user
                        Log.e("LoginActivity", "Login Failed: $errorMessage")
                        Toast.makeText(this@Login, "Login Failed: $errorMessage", Toast.LENGTH_SHORT).show()
                    }
                }



                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    // Handle network or API call failures here
                    Toast.makeText(this@Login, "Login Failed: ${t.message}", Toast.LENGTH_SHORT).show()
                    t.printStackTrace()
                }

            })
        }


        binding.daftarSekarang.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }
        binding.lewati.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
