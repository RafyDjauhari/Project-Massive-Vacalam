package com.example.project_massive_vacalam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class CheckoutDana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout_dana)
        val button = findViewById<LinearLayout>(R.id.btnPembayaranDana)
        button.setOnClickListener{
            val intent = Intent(this, PembayaranSelesai::class.java)
            startActivity(intent)
        }
        val backButton = findViewById<ImageView>(R.id.btnBackDana)
        backButton.setOnClickListener {
            onBackPressed()
        }

    }
}