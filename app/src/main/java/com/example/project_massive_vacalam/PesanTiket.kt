package com.example.project_massive_vacalam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class PesanTiket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan_tiket)

        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            onBackPressed()
        }

    }
}