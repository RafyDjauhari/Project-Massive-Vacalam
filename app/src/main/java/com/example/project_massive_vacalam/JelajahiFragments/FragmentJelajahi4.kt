package com.example.project_massive_vacalam.JelajahiFragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.example.project_massive_vacalam.*

class FragmentJelajahi4 : Fragment() {

    private lateinit var recyclerViewJ4: FrameLayout
    private lateinit var wisataList: ArrayList<Wisata>
    private lateinit var wisataAdapter: DetailedWisataAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_jelajahi4, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        recyclerViewJ4 = view.findViewById(R.id.recyclerViewJelajahi4)

        val layoutManager = LinearLayoutManager(requireContext())
        val recyclerView4 = createRecyclerView(layoutManager)
        recyclerViewJ4.addView(recyclerView4)

        wisataList = DataSourceWisata().getItemDataList()
        val filteredList = wisataList.filter { it.kategori == "Kuliner" }

        wisataAdapter = DetailedWisataAdapter(filteredList)
        recyclerView4.adapter = wisataAdapter

        wisataAdapter.onItemClick = {
            val intent = Intent(requireContext(), DetailedKuliner::class.java)
            intent.putExtra("wisata", it)
            startActivity(intent)
        }
    }

    private fun createRecyclerView(layoutManager: RecyclerView.LayoutManager): RecyclerView {
        val recyclerView = RecyclerView(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        return recyclerView
    }

}