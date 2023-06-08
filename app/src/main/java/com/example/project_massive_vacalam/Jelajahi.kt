package com.example.project_massive_vacalam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Jelajahi : AppCompatActivity() {
    private lateinit var tabLayout : TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: JelajahiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jelajahi)
        viewPager2 = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        adapter = JelajahiAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Semua"
                }
                1 -> {
                    tab.text = "Pantai"
                }
                2 -> {
                    tab.text = "Gunung"
                }
                3 -> {
                    tab.text = "Sejarah"
                }
            }
        }.attach()

        for (i in 0..3){
            val textView = LayoutInflater.from(this).inflate(R.layout.tab_title, null)
                    as TextView
            when (i) {
                0 -> textView.text = "Semua"
                1 -> textView.text = "Pantai"
                2 -> textView.text = "Gunung"
                3 -> textView.text = "Sejarah"
            }
            tabLayout.getTabAt(i)?.customView = textView
        }
    }
}