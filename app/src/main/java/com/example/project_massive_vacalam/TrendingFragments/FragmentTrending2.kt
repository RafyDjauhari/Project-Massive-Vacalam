package com.example.project_massive_vacalam.TrendingFragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.example.project_massive_vacalam.*

class FragmentTrending2 : Fragment() {

    private lateinit var recyclerViewT2: FrameLayout
    private lateinit var trendingList: ArrayList<Wisata>
    private lateinit var trendingAdapter: DetailedWisataAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_trending2, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        recyclerViewT2 = view.findViewById(R.id.recyclerViewTrending2)

        val layoutManager = LinearLayoutManager(requireContext())
        val recyclerView2 = createRecyclerView(layoutManager)
        recyclerViewT2.addView(recyclerView2)

        trendingList = DataSourceTrending().getItemDataList()
        trendingAdapter = DetailedWisataAdapter(trendingList)
        recyclerView2.adapter = trendingAdapter

        trendingAdapter.onItemClick = {
            val intent = Intent(requireContext(), DetailedTrending::class.java)
            intent.putExtra("wisata", it)
            startActivity(intent)
        }

        return Unit
    }

    private fun createRecyclerView(layoutManager: RecyclerView.LayoutManager): RecyclerView {
        val recyclerView = RecyclerView(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        val snapHelper : SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        return recyclerView
    }


}