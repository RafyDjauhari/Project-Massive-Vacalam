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

class FragmentJelajahi2 : Fragment() {

    private lateinit var recyclerViewJ2: FrameLayout
    private lateinit var wisataList: ArrayList<Wisata>
    private lateinit var wisataAdapter: DetailedWisataAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_jelajahi2, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        recyclerViewJ2 = view.findViewById(R.id.recyclerViewJelajahi2)

        val layoutManager = LinearLayoutManager(requireContext())
        val recyclerView2 = createRecyclerView(layoutManager)
        recyclerViewJ2.addView(recyclerView2)

        wisataList = DataSourceWisata().getItemDataList()
        val filteredList = wisataList.filter { it.kategori == "Pantai" }

        wisataAdapter = DetailedWisataAdapter(filteredList)
        recyclerView2.adapter = wisataAdapter

        wisataAdapter.onItemClick = {
            val intent = Intent(requireContext(), DetailedWisata::class.java)
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