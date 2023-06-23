package com.example.project_massive_vacalam

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import java.nio.channels.Channel

class Profil : Fragment() {
    private lateinit var buttonEdit: ImageButton
    private lateinit var btnTentang: LinearLayout
    private lateinit var btnBantuan: LinearLayout
    private lateinit var btnKeluar : LinearLayout
    private lateinit var btnBahasa : LinearLayout

    private lateinit var notificationToggle: ToggleButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profil, container, false)

        buttonEdit = view.findViewById(R.id.buttonedit)
        btnTentang = view.findViewById(R.id.btn_tentang)
        btnBantuan = view.findViewById(R.id.btn_bantuan)
        btnKeluar = view.findViewById(R.id.btn_keluar)
        btnBahasa = view.findViewById(R.id.btn_bahasa)


        // Set click listeners for the ImageButtons
        buttonEdit.setOnClickListener {
            val intent = Intent(activity, EditProfil::class.java)
            startActivity(intent)
        }

        btnTentang.setOnClickListener {
            val intent = Intent(activity, TentangAplikasi::class.java)
            startActivity(intent)
        }

        btnBantuan.setOnClickListener {
            val intent = Intent(activity, Bantuan::class.java)
            startActivity(intent)
        }
        btnKeluar.setOnClickListener {
            val intent = Intent(activity, Login::class.java)
            startActivity(intent)
        }
        btnBahasa.setOnClickListener {
            val intent = Intent(activity, Bahasa::class.java)
            startActivity(intent)
        }

        return view
    }

}







