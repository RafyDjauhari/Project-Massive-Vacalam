package com.example.project_massive_vacalam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailedEventAdapter(private val eventList: List<EventData>) : RecyclerView.Adapter<DetailedEventAdapter.EventViewHolder>() {

    var onItemClick : ((EventData) -> Unit)? = null

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val gambarEventIv : ImageView = itemView.findViewById(R.id.gambarEvent)
        val namaEventTv : TextView = itemView.findViewById(R.id.namaEvent)
        val alamatEventTv : TextView = itemView.findViewById(R.id.alamatEvent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_detailed_event, parent,false)
        return EventViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = eventList[position]
        holder.gambarEventIv.setBackgroundResource(event.gambarEvent)
        holder.namaEventTv.text = event.namaEvent
        holder.alamatEventTv.text = event.alamatEvent

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(event)
        }
    }

    override fun getItemCount(): Int {
        return eventList.size
    }
}