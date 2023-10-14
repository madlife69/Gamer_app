package com.example.gamer_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Storeadapter(private val stores: List<Modelstore>) : RecyclerView.Adapter<StoreviewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_store, parent, false)
        return StoreviewHolder(view)
    }

    override fun onBindViewHolder(holder: StoreviewHolder, position: Int) {
        val item = stores[position]
        holder.imageView.setImageResource(item.image)
        holder.titleTextView.text = item.title
        holder.descriptionTextView.text = item.description
        holder.priceTextView.text = item.price

    }

    override fun getItemCount(): Int {
        return stores.size
    }
}