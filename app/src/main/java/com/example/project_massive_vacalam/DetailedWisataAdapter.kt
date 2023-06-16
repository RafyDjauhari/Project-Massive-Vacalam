package com.example.project_massive_vacalam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailedWisataAdapter(private val wisataList: List<Wisata>) : RecyclerView.Adapter<DetailedWisataAdapter.WisataViewHolder>() {

    var onItemClick : ((Wisata) -> Unit)? = null

    class WisataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val gambarWisataIv : ImageView = itemView.findViewById(R.id.gambarWisata)
        val namaWisataTv : TextView = itemView.findViewById(R.id.namaWisata)
        val alamatWisataTv : TextView = itemView.findViewById(R.id.alamatWisata)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_detailed_wisata, parent,false)
        return WisataViewHolder(view)
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val wisata = wisataList[position]
        holder.gambarWisataIv.setBackgroundResource(wisata.gambarWisata)
        holder.namaWisataTv.text = wisata.namaWisata
        holder.alamatWisataTv.text = wisata.alamatWisata

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(wisata)
        }
    }

    override fun getItemCount(): Int {
        return wisataList.size
    }
}