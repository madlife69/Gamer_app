package com.example.gamer_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class fragment_profile : Fragment(R.layout.fragment_profile) {
    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        recyclerView = view.findViewById(R.id.recyclerView_profile)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val items = listOf(

            model_profile(R.drawable.hihihihi, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.chkoun ,"THRESH","eate your own legend. Learn more about the latest news","30.0 $"),

            model_profile(R.drawable.r__1_, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.why, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.hihihihi, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.chkoun, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),

            model_profile(R.drawable.r__1_, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.why, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.hihihihi, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.chkoun, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.r__1_, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.why, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),

            model_profile(R.drawable.hihihihi, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.chkoun ,"THRESH","eate your own legend. Learn more about the latest news","30.0 $"),

            model_profile(R.drawable.r__1_, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),
            model_profile(R.drawable.why, "THRESH","eate your own legend. Learn more about the latest news","30.0 $"),



            // Ajoutez d'autres éléments ici
        )

        val adapter = ProfileAdapter(items)
        recyclerView.adapter = adapter

        return view






    }



}