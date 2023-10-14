package com.example.gamer_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class homeFragment : Fragment(R.layout.fragment_games) {
    private lateinit var recyclerView: RecyclerView
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_games, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val items = listOf(

            Modelgame(R.drawable.hihihihi, "THRESH","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.chkoun, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r__1_, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.why, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.hihihihi, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.chkoun, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.hihihihi, "THRESH","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.chkoun, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r__1_, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.why, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.hihihihi, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.chkoun, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.hihihihi, "THRESH","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.chkoun, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r__1_, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.why, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.hihihihi, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.chkoun, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.hihihihi, "THRESH","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.chkoun, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r__1_, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.why, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.hihihihi, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.chkoun, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),
            Modelgame(R.drawable.r, "Item 3","League of Legends is a popular online game that lets you choose your champion, fight in different modes, and create your own legend. Learn more about the latest news"),


            // Ajoutez d'autres éléments ici
        )

        val adapter = GameAdapter(items)
        recyclerView.adapter = adapter

        return view






    }



}