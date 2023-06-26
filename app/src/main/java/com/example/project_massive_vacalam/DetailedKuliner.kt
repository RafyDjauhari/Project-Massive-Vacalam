package com.example.project_massive_vacalam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class DetailedKuliner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_kuliner)

        val kuliner = intent.getParcelableExtra<Wisata>("wisata")
        if (kuliner != null){
            val gambarKulinerIv : ImageView = findViewById(R.id.gambarKuliner)
            val namaKulinerTv : TextView = findViewById(R.id.namaKuliner)
            val deskKulinerTv : TextView = findViewById(R.id.deskKuliner)

            gambarKulinerIv.setBackgroundResource(kuliner.gambarWisata)
            namaKulinerTv.text = kuliner.namaWisata
            deskKulinerTv.text = kuliner.deskWisata

            val backButton = findViewById<ImageView>(R.id.backButton)
            backButton.setOnClickListener {
                onBackPressed()
            }
        }
    }
}