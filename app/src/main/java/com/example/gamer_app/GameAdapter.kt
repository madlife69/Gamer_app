package com.example.gamer_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(private val games: List<Modelgame>) : RecyclerView.Adapter<GameviewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_games, parent, false)
        return GameviewHolder(view)
    }

    override fun onBindViewHolder(holder: GameviewHolder, position: Int) {
        val item = games[position]
        holder.imageView.setImageResource(item.image)
        holder.titleTextView.text = item.title
        holder.descriptionTextView.text = item.description

    }

    override fun getItemCount(): Int {
        return games.size
    }
}