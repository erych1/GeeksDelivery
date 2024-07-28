package com.myself223.main.presentation.ui.adapters.menu_adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.myself223.main.R
import com.myself223.main.presentation.model.CategoryUi
import com.myself223.main.databinding.ItemCategoryBinding


class CategoryAdapter(private val click: (String) -> Unit) :
    ListAdapter<CategoryUi, CategoryAdapter.CategoryViewHolder>(CategoryDiffutil()) {

    private var selectedPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model, position == selectedPosition)
        holder.itemView.setOnClickListener {
            model.name?.let { name -> click(name) }
            updateSelectedPosition(position)
        }

    }

    private fun updateSelectedPosition(newPosition: Int) {
        val previousPosition = selectedPosition
        selectedPosition = newPosition
        notifyItemChanged(previousPosition)
        notifyItemChanged(newPosition)
    }

    inner class CategoryViewHolder(private val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: CategoryUi, isSelected: Boolean) {
            binding.itemNameCategory.text = item.name
            binding.container.setBackgroundResource(
                if (isSelected) R.drawable.bg_for_item_category_if_select
                else R.drawable.bg_for_item_category_default
            )
            binding.itemNameCategory.setTextColor(
                if (isSelected) ContextCompat.getColor(binding.root.context, R.color.black)
                else ContextCompat.getColor(binding.root.context, R.color.grey)
            )
        }
    }
    class CategoryDiffutil : DiffUtil.ItemCallback<CategoryUi>() {
        override fun areItemsTheSame(oldItem: CategoryUi, newItem: CategoryUi): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: CategoryUi, newItem: CategoryUi): Boolean {
            return oldItem == newItem
        }
    }
}


/*
class CategoryAdapter(private val click: (String) -> Unit) :
    ListAdapter<CategoryUi, CategoryAdapter.CategoryViewHolder>(CategoryDiffutil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)
        holder.itemView.setOnClickListener {

            model?.name?.let { name -> click(name) }
            model?.isSelected = true
        }

    }

    inner class CategoryViewHolder(private val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: CategoryUi) {
            binding.itemNameCategory.text = item.name
            if (item.isSelected == true){
                binding.container.setBackgroundResource(R.drawable.bg_for_item_category_if_select)
                binding.itemNameCategory.setTextColor(R.color.black)
            }
        }
    }
}

class CategoryDiffutil : DiffUtil.ItemCallback<CategoryUi>() {
    override fun areItemsTheSame(oldItem: CategoryUi, newItem: CategoryUi): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: CategoryUi, newItem: CategoryUi): Boolean {
        return oldItem == newItem
    }
}
*/
