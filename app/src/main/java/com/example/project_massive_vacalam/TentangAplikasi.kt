package com.example.project_massive_vacalam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TentangAplikasi : AppCompatActivity() {

    private lateinit var backTentangAplikasi: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang_aplikasi)

        val backTentangAplikasi = findViewById<ImageButton>(R.id.back_tentang_aplikasi)
        backTentangAplikasi.setOnClickListener {
            onBackPressed()
        }
    }
}