package com.example.project_massive_vacalam

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.project_massive_vacalam.JelajahiFragments.FragmentJelajahi1
import com.example.project_massive_vacalam.JelajahiFragments.FragmentJelajahi2
import com.example.project_massive_vacalam.JelajahiFragments.FragmentJelajahi3
import com.example.project_massive_vacalam.JelajahiFragments.FragmentJelajahi4

class JelajahiAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentJelajahi1()
            1 -> FragmentJelajahi2()
            2 -> FragmentJelajahi3()
            3 -> FragmentJelajahi4()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}