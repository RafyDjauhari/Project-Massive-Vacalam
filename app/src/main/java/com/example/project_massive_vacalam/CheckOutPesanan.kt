package com.example.project_massive_vacalam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class CheckOutPesanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)
        val backButton = findViewById<ImageView>(R.id.backButton)
        val buttonCheckOutPesanan = findViewById<LinearLayout>(R.id.btn_checkout)
        buttonCheckOutPesanan.setOnClickListener{
            val intent = Intent(this, TiketCash::class.java)
            startActivity(intent)
        }
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}