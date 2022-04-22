package com.example.tourismplaces.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tourismplaces.R
import com.example.tourismplaces.adapter.PlaceAdapter
import com.example.tourismplaces.databinding.FragmentHomeBinding
import com.example.tourismplaces.model.PlaceModel

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding
    private val placeList = generateList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        setupRecyclerview()

        return binding.root
    }

    private fun setupRecyclerview() {
        binding.rvPlaces.adapter = PlaceAdapter(placeList)
        binding.rvPlaces.layoutManager = GridLayoutManager(context,2)
    }

    private fun generateList(): List<PlaceModel> {

        val list = ArrayList<PlaceModel>()
        list.add(PlaceModel(R.drawable.adilabad_d1,"adilabad"))
        list.add(PlaceModel(R.drawable.warangal_d5,"warangal"))
        list.add(PlaceModel(R.drawable.hyderabad_d6,"hyderabad"))
        list.add(PlaceModel(R.drawable.karimnagar_d3,"karimnagar"))
        list.add(PlaceModel(R.drawable.khammam_d8,"khammam"))
        list.add(PlaceModel(R.drawable.nalgonda_d7,"nalgonda"))
        list.add(PlaceModel(R.drawable.medak_d4,"medak"))
        list.add(PlaceModel(R.drawable.mahabubnagar_d9,"mahabubnagar"))
        list.add(PlaceModel(R.drawable.nizamabad_d2,"nizamabad"))

        return list

    }

}