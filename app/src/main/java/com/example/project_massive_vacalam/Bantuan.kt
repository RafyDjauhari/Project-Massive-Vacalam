package com.example.project_massive_vacalam

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Bantuan : AppCompatActivity() {

    private lateinit var backBantuan: ImageButton
    private lateinit var bantuanKuliner: FrameLayout
    private lateinit var bantuanCariWisata: FrameLayout
    private lateinit var pesanTiket: FrameLayout
    private lateinit var pembayaran: FrameLayout
    private lateinit var ubahKataSandi: TextView
    private lateinit var Logout: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bantuan)

        bantuanKuliner = findViewById<FrameLayout>(R.id.bantuan_kuliner)
        bantuanCariWisata = findViewById(R.id.bantuan_cari_wisata)
        pesanTiket = findViewById(R.id.bantuan_pesan_tiket)
        pembayaran = findViewById(R.id.bantuan_pembayaran)
        ubahKataSandi = findViewById(R.id.bantuan_kata_sandi)
        Logout = findViewById(R.id.bantuan_logout)

        val backBantuan = findViewById<ImageButton>(R.id.btn_back_bantuan)
        backBantuan.setOnClickListener {
            onBackPressed()
        }

        bantuanKuliner.setOnClickListener {
            val intent = Intent(this, Jelajahi::class.java)
            startActivity(intent)
        }

        bantuanCariWisata.setOnClickListener {
            val intent = Intent(this, Search::class.java)
            startActivity(intent)
        }

        ubahKataSandi.setOnClickListener {
            val intent = Intent(this, EditProfil::class.java)
            startActivity(intent)
        }

        Logout.setOnClickListener {
            val intent = Intent(this, Profil::class.java)
            startActivity(intent)
        }
    }
}