package com.example.project_massive_vacalam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class PesanTiket : AppCompatActivity() {

    private var jumlahAnak = 0
    private var jumlahDewasa = 0

    private var textAnak: TextView? = null
    private var textDewasa: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan_tiket)

        val hari = listOf("Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu")
        val autoComplete : AutoCompleteTextView = findViewById(R.id.auto_complete_txt)
        val adapter = ArrayAdapter(this, R.layout.list_hari_kunjungan, hari)

        autoComplete.setAdapter(adapter)

        autoComplete.onItemClickListener = AdapterView.OnItemClickListener{
                adapterView, view, i, l ->

            val hariSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "Item: $hariSelected", Toast.LENGTH_SHORT).show()
        }

        val backButton = findViewById<ImageView>(R.id.backButton)
        val btnPembayaran = findViewById<LinearLayout>(R.id.btnPembayaran)
        btnPembayaran.setOnClickListener{
            val intent = Intent(this, PilihMetodePembayaran::class.java)
            startActivity(intent)
        }
        backButton.setOnClickListener {
            onBackPressed()
        }

        textAnak = findViewById(R.id.text_anak)
        textDewasa = findViewById(R.id.text_dewasa)

        updateJumlahTiket()

    }
    fun tambahAnak(view: View) {
        jumlahAnak++
        updateJumlahTiket()
    }

    fun kurangAnak(view: View) {
        if (jumlahAnak > 0) {
            jumlahAnak--
            updateJumlahTiket()
        }
    }

    fun tambahDewasa(view: View) {
        jumlahDewasa++
        updateJumlahTiket()
    }

    fun kurangDewasa(view: View) {
        if (jumlahDewasa > 0) {
            jumlahDewasa--
            updateJumlahTiket()
        }
    }

    private fun updateJumlahTiket() {
        textAnak!!.text = "$jumlahAnak"
        textDewasa!!.text = "$jumlahDewasa"
    }
}