package com.example.gamer_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(private val profiles: List<model_profile>) : RecyclerView.Adapter<ProfileviewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_profile, parent, false)
        return ProfileviewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileviewHolder, position: Int) {
        val item=profiles[position]
        holder.imageView.setImageResource(item.image)
        holder.titleTextView.text = item.title
        holder.descriptionTextView.text = item.description
        holder.priceTextView.text = item.price

    }

    override fun getItemCount(): Int {
        return profiles.size
    }
}