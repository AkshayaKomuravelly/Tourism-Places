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
import com.example.tourismplaces.databinding.FragmentMedakBinding
import com.example.tourismplaces.model.TourismModel

class MedakFragment : Fragment() {
    private lateinit var binding : FragmentMedakBinding
    private val tourList = generateList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMedakBinding.inflate(inflater, container, false)

        setupRecyclerview()

        return binding.root
    }
    private fun setupRecyclerview() {
        binding.rvMedak.adapter = TourismAdapter(tourList)
        binding.rvMedak.layoutManager = LinearLayoutManager(activity)
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