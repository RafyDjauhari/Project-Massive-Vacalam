package com.example.project_massive_vacalam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class DetailedEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_event)

        val event = intent.getParcelableExtra<EventData>("event")
        if (event != null){
            val gambarEventIv : ImageView = findViewById(R.id.gambarEvent)
            val namaEventTv : TextView = findViewById(R.id.namaEvent)
            val alamatEventTv : TextView = findViewById(R.id.alamatEvent)
            val deskEventTv : TextView = findViewById(R.id.deskEvent)
            val galleryEventLv : GridView = findViewById(R.id.galleryEvent)

            gambarEventIv.setBackgroundResource(event.gambarEvent)
            namaEventTv.text = event.namaEvent
            alamatEventTv.text = event.alamatEvent
            deskEventTv.text = event.deskEvent

            // Retrieve gallery images from DataSourceWisata
            val galleryImages = event.galleryEvent


            // Create an adapter for the gallery images
            val galleryAdapter = GalleryAdapter(this, galleryImages)
            galleryEventLv.adapter = galleryAdapter

            val backButton = findViewById<ImageView>(R.id.backButton)
            backButton.setOnClickListener {
                onBackPressed()
            }
        }
    }
}