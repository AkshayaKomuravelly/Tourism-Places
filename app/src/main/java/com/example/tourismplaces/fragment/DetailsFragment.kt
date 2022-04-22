package com.example.tourismplaces.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tourismplaces.R
import com.example.tourismplaces.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.detailsTitle.text = DetailsFragmentArgs.fromBundle(requireArguments()).detailsTitle
        binding.detailsDesc.text = DetailsFragmentArgs.fromBundle(requireArguments()).detailsDesc
        binding.detailsImg.setImageResource(DetailsFragmentArgs.fromBundle(requireArguments()).detailsImage)
    }

}