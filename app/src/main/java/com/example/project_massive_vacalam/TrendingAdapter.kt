package com.example.project_massive_vacalam

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.project_massive_vacalam.TrendingFragments.FragmentTrending1
import com.example.project_massive_vacalam.TrendingFragments.FragmentTrending2
import com.example.project_massive_vacalam.TrendingFragments.FragmentTrending3

class TrendingAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentTrending1()
            1 -> FragmentTrending2()
            2 -> FragmentTrending3()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}