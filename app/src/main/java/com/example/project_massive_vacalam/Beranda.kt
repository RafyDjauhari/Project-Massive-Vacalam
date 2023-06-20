package com.example.project_massive_vacalam

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper

class Beranda : Fragment() {

    private lateinit var recyclerViewContainer1: LinearLayout
    private lateinit var recyclerViewContainer2: LinearLayout
    private lateinit var recyclerViewContainer3: LinearLayout
    private lateinit var wisataList: ArrayList<Wisata>
    private lateinit var trendingList: ArrayList<Wisata>
    private lateinit var eventList: ArrayList<EventData>
    private lateinit var wisataAdapter: WisataAdapter
    private lateinit var trendingAdapter: WisataAdapter
    private lateinit var eventAdapter: EventDataAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        recyclerViewContainer1 = view.findViewById(R.id.recyclerViewContainer1)
        recyclerViewContainer2 = view.findViewById(R.id.recyclerViewContainer2)
        recyclerViewContainer3 = view.findViewById(R.id.recyclerViewContainer3)
        recyclerViewContainer1.orientation = LinearLayout.VERTICAL
        recyclerViewContainer2.orientation = LinearLayout.VERTICAL
        recyclerViewContainer3.orientation = LinearLayout.VERTICAL

        val layoutManager = LinearLayoutManager(requireContext())
        val recyclerView1 = createRecyclerView(layoutManager)
        recyclerViewContainer1.addView(recyclerView1)

        val recyclerView2 = createRecyclerView(layoutManager)
        recyclerViewContainer2.addView(recyclerView2)

        val recyclerView3 = createRecyclerView(layoutManager)
        recyclerViewContainer3.addView(recyclerView3)

        wisataList = DataSourceWisata().getItemDataList()
        wisataAdapter = WisataAdapter(wisataList)
        recyclerView1.adapter = wisataAdapter

        trendingList = DataSourceTrending().getItemDataList()
        trendingAdapter = WisataAdapter(trendingList)
        recyclerView2.adapter = trendingAdapter

        eventList = DataSourceEvent().getItemDataList()
        eventAdapter = EventDataAdapter(eventList)
        recyclerView3.adapter = eventAdapter

        wisataAdapter.onItemClick = {
            val intent = Intent(requireContext(), DetailedWisata::class.java)
            intent.putExtra("wisata", it)
            startActivity(intent)
        }
        trendingAdapter.onItemClick = {
            val intent = Intent(requireContext(), DetailedTrending::class.java)
            intent.putExtra("wisata", it)
            startActivity(intent)
        }
        eventAdapter.onItemClick = {
            val intent = Intent(requireContext(), DetailedEvent::class.java)
            intent.putExtra("event", it)
            startActivity(intent)
        }

        val buttonJelajahi = view.findViewById<TextView>(R.id.jelajahiButton)
        val buttonTrending = view.findViewById<TextView>(R.id.trendingButton)
        val buttonEvent = view.findViewById<TextView>(R.id.eventButton)

        buttonJelajahi.setOnClickListener {
            val goToJelajahi = Intent(activity, Jelajahi::class.java)
            startActivity(goToJelajahi)
        }

        buttonTrending.setOnClickListener {
            val goToTrending = Intent(activity, Trending::class.java)
            startActivity(goToTrending)
        }

        buttonEvent.setOnClickListener {
            val goToEvent = Intent(activity, Event::class.java)
            startActivity(goToEvent)
        }

        return Unit
    }

    private fun createRecyclerView(layoutManager: RecyclerView.LayoutManager): RecyclerView {
        val recyclerView = RecyclerView(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        val snapHelper : SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        return recyclerView
    }

}
