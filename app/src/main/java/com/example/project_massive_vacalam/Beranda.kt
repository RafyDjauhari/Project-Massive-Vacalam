package com.example.project_massive_vacalam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper

class Beranda : Fragment() {

    private lateinit var recyclerViewContainer1: LinearLayout
    private lateinit var recyclerViewContainer2: LinearLayout
    private lateinit var recyclerViewContainer3: LinearLayout
    private lateinit var wisataList1: ArrayList<Wisata>
    private lateinit var wisataList2: ArrayList<Wisata>
    private lateinit var wisataList3: ArrayList<Wisata>
    private lateinit var wisataAdapter1: WisataAdapter
    private lateinit var wisataAdapter2: WisataAdapter
    private lateinit var wisataAdapter3: WisataAdapter

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

        val layoutManager1 = LinearLayoutManager(requireContext())
        val recyclerView1 = createRecyclerView(layoutManager1)
        recyclerViewContainer1.addView(recyclerView1)

        val layoutManager2 = LinearLayoutManager(requireContext())
        val recyclerView2 = createRecyclerView(layoutManager2)
        recyclerViewContainer2.addView(recyclerView2)

        val layoutManager3 = LinearLayoutManager(requireContext())
        val recyclerView3 = createRecyclerView(layoutManager3)
        recyclerViewContainer3.addView(recyclerView3)

        wisataList1 = ArrayList()
        addDataToList1()
        wisataAdapter1 = WisataAdapter(wisataList1)
        recyclerView1.adapter = wisataAdapter1

        wisataList2 = ArrayList()
        addDataToList2()
        wisataAdapter2 = WisataAdapter(wisataList2)
        recyclerView2.adapter = wisataAdapter2

        wisataList3 = ArrayList()
        addDataToList3()
        wisataAdapter3 = WisataAdapter(wisataList3)
        recyclerView3.adapter = wisataAdapter3
    }

    private fun createRecyclerView(layoutManager: RecyclerView.LayoutManager): RecyclerView {
        val recyclerView = RecyclerView(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        val snapHelper : SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        return recyclerView
    }

    private fun addDataToList1() {
        wisataList1.add(Wisata(R.drawable.bukit_sakura, "Bukit Sakura", "Kec. Jati Agung, Kabupaten Lampung Selatan"))
        wisataList1.add(Wisata(R.drawable.kebun_karet_trikora, "Kebun Karet Trikora", "Kec. Jati Agung, Kabupaten Lampung Selatan"))
        wisataList1.add(Wisata(R.drawable.gigi_hiu, "Gigi Hiu", "Kec. Langkapura, Kota Bandar Lampung, Lampung"))
    }

    private fun addDataToList2() {
        wisataList2.add(Wisata(R.drawable.gigi_hiu, "Gigi Hiu", "Kec. Langkapura, Kota Bandar Lampung, Lampung"))
        wisataList2.add(Wisata(R.drawable.kebun_karet_trikora, "Kebun Karet Trikora", "Kec. Jati Agung, Kabupaten Lampung Selatan"))
        wisataList2.add(Wisata(R.drawable.bukit_sakura, "Bukit Sakura", "Kec. Jati Agung, Kabupaten Lampung Selatan"))
    }

    private fun addDataToList3() {
        wisataList3.add(Wisata(R.drawable.gigi_hiu, "Gigi Hiu", "Kec. Langkapura, Kota Bandar Lampung, Lampung"))
        wisataList3.add(Wisata(R.drawable.kebun_karet_trikora, "Kebun Karet Trikora", "Kec. Jati Agung, Kabupaten Lampung Selatan"))
        wisataList3.add(Wisata(R.drawable.bukit_sakura, "Bukit Sakura", "Kec. Jati Agung, Kabupaten Lampung Selatan"))
    }
}
