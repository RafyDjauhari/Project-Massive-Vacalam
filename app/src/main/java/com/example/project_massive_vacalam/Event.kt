package com.example.project_massive_vacalam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Event : AppCompatActivity() {

    private lateinit var recyclerViewEvent: FrameLayout
    private lateinit var eventList: ArrayList<Wisata>
    private lateinit var eventAdapter: DetailedWisataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        init()
    }

    private fun init() {
        recyclerViewEvent = findViewById(R.id.recyclerViewEvent)

        val layoutManager = LinearLayoutManager(this)
        val recyclerView = createRecyclerView(layoutManager)
        recyclerViewEvent.addView(recyclerView)

        eventList = DataSourceWisata().getItemDataList()
        eventAdapter = DetailedWisataAdapter(eventList)
        recyclerView.adapter = eventAdapter


        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            onBackPressed()
        }

        return Unit
    }


    private fun createRecyclerView(layoutManager: RecyclerView.LayoutManager): RecyclerView {
        val recyclerView = RecyclerView(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val snapHelper : SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        return recyclerView
    }
}