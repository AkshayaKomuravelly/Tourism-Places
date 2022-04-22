package com.example.tourismplaces.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismplaces.R
import com.example.tourismplaces.databinding.PlaceLayoutBinding
import com.example.tourismplaces.model.PlaceModel

class PlaceAdapter(private var tour: List<PlaceModel>): RecyclerView.Adapter<PlaceAdapter.MyViewHolder>() {


    private lateinit var context: Context
    class MyViewHolder( val binding: PlaceLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        context=parent.context
        return MyViewHolder(PlaceLayoutBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun getItemCount(): Int {
        return tour.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.placeImg.setImageResource(tour[position].imageTour)
        holder.binding.placeTitle.text = tour[position].title
        holder.itemView.setOnClickListener {
            if(tour[position].title=="adilabad") {
                Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_adilabadFragment)
            }
            if(tour[position].title=="warangal") {
                Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_warangalFragment)
            }
            if (tour[position].title=="hyderabad") {
                Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_hyderabadFragment)
            }
            if (tour[position].title=="karimnagar") {
                Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_karimnagarFragment)
            }
            if (tour[position].title=="mahabubnagar") {
                Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_mahabubnagarFragment)
            }
            if (tour[position].title=="khammam") {
                Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_khammamFragment)
            }
            if (tour[position].title=="medak") {
                Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_medakFragment)
            }
            if (tour[position].title=="nalgonda") {
                Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_nalgondaFragment)
            }
            if (tour[position].title=="nizamabad") {
                Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_nizamabadFragment)
            }
        }

    }
}
