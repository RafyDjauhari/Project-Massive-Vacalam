package com.example.project_massive_vacalam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.project_massive_vacalam.databinding.ActivityLoginBinding
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.Callback
import java.io.IOException


class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.masukButton.setOnClickListener {
            val email = binding.emailET.text.toString()
            val password = binding.passwordET.text.toString()
            loginUsingApi(email, password)
        }


        binding.daftarSekarang.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }
        binding.lewati.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun loginUsingApi(email: String, password: String) {
        val client = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
            .build()

        val requestBody = MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("email", email)
            .addFormDataPart("password", password)
            .build()

        val request = Request.Builder()
            .url("https://vacalamp-api.000webhostapp.com/auth/login")
            .header("Content-Type", "multipart/form-data")
            .post(requestBody)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: okhttp3.Call, response: okhttp3.Response) {
                if (response.isSuccessful){
                    val responseBody = response.body?.string()
                    Log.d("Login", "Response: $responseBody")
                    // Handle the response here
                    runOnUiThread {
                        Toast.makeText(applicationContext, "Login success", Toast.LENGTH_SHORT).show()
                    }
                    startActivity(Intent(this@Login, MainActivity::class.java))
                    finish()
                } else {
                    runOnUiThread {
                        Toast.makeText(applicationContext, "Login failed", Toast.LENGTH_SHORT).show()
                    }

                }
            }

            override fun onFailure(call: okhttp3.Call, e: IOException) {
                e.printStackTrace()
                // Handle the failure here
            }
        })



    }

}
