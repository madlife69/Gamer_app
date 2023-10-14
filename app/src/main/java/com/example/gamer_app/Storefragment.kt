package com.example.gamer_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Storefragment : Fragment(R.layout.fragment_store) {
    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_store, container, false)

        recyclerView = view.findViewById(R.id.recyclerView_store)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val items = listOf(

            Modelstore(R.drawable.hihihihi, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.chkoun ,"THRESH","eate your own legend. Learn more about the latest news","30.0 $"),

            Modelstore(R.drawable.r__1_, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.why, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.hihihihi, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.chkoun, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),

            Modelstore(R.drawable.r__1_, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.why, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.hihihihi, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.chkoun, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.r__1_, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.why, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),

            Modelstore(R.drawable.hihihihi, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.chkoun ,"THRESH","eate your own legend. Learn more about the latest news","30.0 $"),

            Modelstore(R.drawable.r__1_, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            Modelstore(R.drawable.why, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),



            // Ajoutez d'autres éléments ici
        )

        val adapter = Storeadapter(items)
        recyclerView.adapter = adapter

        return view






    }



}