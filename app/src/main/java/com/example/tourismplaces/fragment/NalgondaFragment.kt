package com.example.tourismplaces.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tourismplaces.R
import com.example.tourismplaces.adapter.TourismAdapter
import com.example.tourismplaces.databinding.FragmentHyderabadBinding
import com.example.tourismplaces.databinding.FragmentNalgondaBinding
import com.example.tourismplaces.model.TourismModel

class NalgondaFragment : Fragment() {
    private lateinit var binding: FragmentNalgondaBinding
    private val tourList = generateList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNalgondaBinding.inflate(inflater, container, false)

        setupRecyclerview()

        return binding.root
    }
    private fun setupRecyclerview() {
        binding.rvNalgonda.adapter = TourismAdapter(tourList)
        binding.rvNalgonda.layoutManager = LinearLayoutManager(activity)
    }

    private fun generateList(): List<TourismModel> {

        val list = ArrayList<TourismModel>()
        list.add(TourismModel(R.drawable.ic_launcher_background,"place1","this is place1",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.ic_launcher_background,"place2","this is place2",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.ic_launcher_background,"","",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.ic_launcher_background,"","",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.ic_launcher_background,"","",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.ic_launcher_background,"","",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.ic_launcher_background,"","",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        return list

    }

}