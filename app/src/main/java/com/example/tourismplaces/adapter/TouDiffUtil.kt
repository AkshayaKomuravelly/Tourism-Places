package com.example.tourismplaces.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.tourismplaces.model.PlaceModel

class TouDiffUtil(private val oldList: List<PlaceModel>, private val newList: List<PlaceModel>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].title == newList[newItemPosition].title
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when {
            oldList[oldItemPosition].title != newList[newItemPosition].title -> {
                false
            }
            else ->true
        }

    }
}
