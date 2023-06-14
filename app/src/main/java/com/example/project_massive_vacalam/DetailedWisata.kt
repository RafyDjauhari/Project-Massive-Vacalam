package com.example.project_massive_vacalam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailedWisata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_wisata)

        val wisata = intent.getParcelableExtra<Wisata>("wisata")
        if (wisata != null){
            val gambarWisataIv : ImageView = findViewById(R.id.gambarWisata)
            val namaWisataTv : TextView = findViewById(R.id.namaWisata)
            val jamBukaTv : TextView = findViewById(R.id.jamBuka)
            val deskWisataTv : TextView = findViewById(R.id.deskWisata)
            val hargaTiketTv : TextView = findViewById(R.id.hargaTiket)

            gambarWisataIv.setBackgroundResource(wisata.gambarWisata)
            namaWisataTv.text = wisata.namaWisata
            jamBukaTv.text = wisata.jamBuka
            deskWisataTv.text = wisata.deskWisata
            hargaTiketTv.text = wisata.hargaTiket.toString()
        }

    }
}