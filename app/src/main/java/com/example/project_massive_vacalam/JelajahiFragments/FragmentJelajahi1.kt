package com.example.project_massive_vacalam.JelajahiFragments

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

class FragmentJelajahi1 : Fragment() {

    private lateinit var recyclerViewJ1: FrameLayout
    private lateinit var wisataList: ArrayList<Wisata>
    private lateinit var wisataAdapter: DetailedWisataAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_jelajahi1, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        recyclerViewJ1 = view.findViewById(R.id.recyclerViewJelajahi1)

        val layoutManager = LinearLayoutManager(requireContext())
        val recyclerView1 = createRecyclerView(layoutManager)
        recyclerViewJ1.addView(recyclerView1)

        wisataList = DataSourceWisata().getItemDataList()
        wisataAdapter = DetailedWisataAdapter(wisataList)
        recyclerView1.adapter = wisataAdapter

        wisataAdapter.onItemClick = {
            val intent = Intent(requireContext(), DetailedWisata::class.java)
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