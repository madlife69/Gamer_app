package com.example.gamer_app

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.storeImage3)
    val titleTextView: TextView = itemView.findViewById(R.id.storeTitle3)
    val descriptionTextView: TextView = itemView.findViewById(R.id.storeDescription3)
    val priceTextView: TextView = itemView.findViewById(R.id.price3)

}