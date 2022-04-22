package com.example.tourismplaces.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismplaces.R
import com.example.tourismplaces.databinding.TourimsLayoutBinding
import com.example.tourismplaces.fragment.AdilabadFragmentDirections
import com.example.tourismplaces.fragment.warangalFragmentDirections
import com.example.tourismplaces.model.PlaceModel
import com.example.tourismplaces.model.TourismModel

class TourismAdapter(private var tour: List<TourismModel>): RecyclerView.Adapter<TourismAdapter.MyViewHolder>() {

    private lateinit var context: Context
    class MyViewHolder( val binding: TourimsLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        context=parent.context
        return MyViewHolder(TourimsLayoutBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun getItemCount(): Int {
        return tour.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.tourimg.setImageResource(tour[position].imageTour)
        holder.binding.tourTitle.text = tour[position].title
        holder.itemView.setOnClickListener {
            if (tour[position].title == "place1") {
                val action = AdilabadFragmentDirections.actionAdilabadFragmentToDetailsFragment(
                    tour[position].title,
                    tour[position].imageTour,
                    tour[position].desc
                )
                Navigation.findNavController(it).navigate(action)
            }
            if (tour[position].title == "place2") {
                val action = warangalFragmentDirections.actionWarangalFragmentToDetailsFragment(
                    tour[position].title,
                    tour[position].imageTour,
                    tour[position].desc
                )
                Navigation.findNavController(it).navigate(action)
            }
        }
    }
}
