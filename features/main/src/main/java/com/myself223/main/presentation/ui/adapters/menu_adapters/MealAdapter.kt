package com.myself223.main.presentation.ui.adapters.menu_adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.myself223.core.loadImageURL
import com.myself223.main.presentation.model.MealUi
import com.myself223.main.databinding.ItemProductBinding

class MealAdapter:ListAdapter<MealUi, MealAdapter.MealViewHolder>(MealDiffutil()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        return MealViewHolder(
            ItemProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    inner class MealViewHolder(private val binding: ItemProductBinding):ViewHolder(binding.root) {
        fun onBind(it: MealUi){
            binding.itemNameProduct.text = it.nameMeal
            binding.itemImgProduct.loadImageURL(it.imgMeal)


        }
    }

    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)
        holder.itemView.setOnClickListener {
        }
    }

}
class MealDiffutil:DiffUtil.ItemCallback<MealUi>() {
    override fun areItemsTheSame(oldItem: MealUi, newItem: MealUi): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: MealUi, newItem: MealUi): Boolean {
        return oldItem == newItem

    }

}
