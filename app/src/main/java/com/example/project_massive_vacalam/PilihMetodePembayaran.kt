package com.example.project_massive_vacalam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class PilihMetodePembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_metode_pembayaran)
        val backButton = findViewById<ImageView>(R.id.backButton)
        val tunai = findViewById<LinearLayout>(R.id.tunai)
        val dana = findViewById<LinearLayout>(R.id.dana)
        dana.setOnClickListener{
            val intent = Intent( this, CheckoutDana::class.java)
            startActivity(intent)
        }
        tunai.setOnClickListener{
            val intent = Intent(this, CheckOutPesanan::class.java)
            startActivity(intent)
        }
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}