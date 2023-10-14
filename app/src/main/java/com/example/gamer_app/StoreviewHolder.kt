package com.example.gamer_app

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoreviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.storeImage1)
    val titleTextView: TextView = itemView.findViewById(R.id.storeTitle1)
    val descriptionTextView: TextView = itemView.findViewById(R.id.storeDescription1)
    val priceTextView: TextView = itemView.findViewById(R.id.price)

}