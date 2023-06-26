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

    private lateinit var backBantuan: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bantuan)

        backBantuan = findViewById(R.id.btn_back_bantuan)
        backBantuan.setOnClickListener {
            onBackPressed()
        }

    }
}
