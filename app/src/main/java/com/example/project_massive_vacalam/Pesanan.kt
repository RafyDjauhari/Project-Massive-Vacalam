package com.example.project_massive_vacalam

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout



class Pesanan : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_pesanan, container, false)
        val pilihWisataBtn = view.findViewById<FrameLayout>(R.id.pilihWisataBtn)

        pilihWisataBtn.setOnClickListener {
            val intent = Intent(activity, Jelajahi::class.java)
            startActivity(intent)
        }

        return view
    }

}