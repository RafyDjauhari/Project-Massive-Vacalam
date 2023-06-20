package com.example.project_massive_vacalam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class Bahasa : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var radioButton1: RadioButton
    private lateinit var radioButton2: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bahasa)

        radioGroup = findViewById(R.id.radioGroup)
        radioButton1 = findViewById(R.id.radioButton1)
        radioButton2 = findViewById(R.id.radioButton2)

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioButton1 -> {
                    // Aksi ketika Option 1 dipilih
                    Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show()
                }
                R.id.radioButton2 -> {
                    // Aksi ketika Option 2 dipilih
                    Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}