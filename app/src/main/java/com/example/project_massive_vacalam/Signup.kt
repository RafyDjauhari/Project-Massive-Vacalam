package com.example.project_massive_vacalam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project_massive_vacalam.databinding.ActivitySignupBinding

class Signup : AppCompatActivity() {

    private  lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.masukSekarang.setOnClickListener{
            startActivity(Intent(this,Login::class.java))
        }

    }
}