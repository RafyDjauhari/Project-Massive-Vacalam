package com.example.project_massive_vacalam

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.project_massive_vacalam.EventFragments.Fragment1
import com.example.project_massive_vacalam.EventFragments.Fragment2

class EventAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}