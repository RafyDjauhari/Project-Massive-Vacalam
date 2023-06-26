package com.example.project_massive_vacalam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class PembayaranSelesai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran_selesai)
        val buttonback = findViewById<ImageView>(R.id.btnBackStatusPemb)
        buttonback.setOnClickListener {
            onBackPressed()
        }
        val button = findViewById<LinearLayout>(R.id.btnPembayaranBerhasil)
        button.setOnClickListener{
            val intent = Intent(this, TiketDana::class.java)
            startActivity(intent)
        }
    }
}