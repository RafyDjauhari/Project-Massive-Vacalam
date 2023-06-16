package com.example.project_massive_vacalam.JelajahiFragments

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
import com.example.project_massive_vacalam.DataSourceWisata
import com.example.project_massive_vacalam.DetailedWisataAdapter
import com.example.project_massive_vacalam.R
import com.example.project_massive_vacalam.Wisata

class FragmentJelajahi3 : Fragment() {

    private lateinit var recyclerViewJ3: FrameLayout
    private lateinit var wisataList: ArrayList<Wisata>
    private lateinit var wisataAdapter: DetailedWisataAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_jelajahi3, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        recyclerViewJ3 = view.findViewById(R.id.recyclerViewJelajahi3)

        val layoutManager = LinearLayoutManager(requireContext())
        val recyclerView3 = createRecyclerView(layoutManager)
        recyclerViewJ3.addView(recyclerView3)

        wisataList = DataSourceWisata().getItemDataList()
        wisataAdapter = DetailedWisataAdapter(wisataList)
        recyclerView3.adapter = wisataAdapter

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