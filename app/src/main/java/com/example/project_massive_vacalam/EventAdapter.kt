package com.example.project_massive_vacalam

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.project_massive_vacalam.EventFragments.FragmentEvent1
import com.example.project_massive_vacalam.EventFragments.FragmentEvent2

class EventAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentEvent1()
            1 -> FragmentEvent2()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}