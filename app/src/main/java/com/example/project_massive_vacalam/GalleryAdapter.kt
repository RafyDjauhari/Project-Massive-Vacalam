package com.example.project_massive_vacalam

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView

class GalleryAdapter(context: Context, private val galleryImages: List<Int>) :
    ArrayAdapter<Int>(context, 0, galleryImages) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.gallery_item_layout, parent, false)
        }

        val galleryImageView: ImageView = itemView?.findViewById(R.id.galleryGambarWisata) ?: ImageView(context)
        galleryImageView.setBackgroundResource(galleryImages[position])

        return itemView!!
    }
}


