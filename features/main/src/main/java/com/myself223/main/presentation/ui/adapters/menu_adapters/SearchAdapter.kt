package com.myself223.main.presentation.ui.adapters.menu_adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.myself223.core.loadImageURL
import com.myself223.main.databinding.ItemBannersBinding
import com.myself223.main.presentation.model.SearchUi
class SearchAdapter : ListAdapter<SearchUi, SearchAdapter.SearchViewHolder>(SearchDiffutil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        return SearchViewHolder(
            ItemBannersBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    inner class SearchViewHolder(private val binding: ItemBannersBinding) : ViewHolder(binding.root) {
        fun onBind(it: SearchUi) {
            binding.itemNameProduct.text = it.name
            binding.itemImgProduct.loadImageURL(it.image)
            binding.itemIngredientsProduct.text = it.getAllIngredients()
        }
    }

    override fun onBindViewHolder(holder: SearchAdapter.SearchViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)
        holder.itemView.setOnClickListener {
            // Handle item click if needed
        }
    }
}

class SearchDiffutil : DiffUtil.ItemCallback<SearchUi>() {
    override fun areItemsTheSame(oldItem: SearchUi, newItem: SearchUi): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: SearchUi, newItem: SearchUi): Boolean {
        return oldItem == newItem
    }
}

/*

class SearchAdapter:ListAdapter<SearchUi,SearchAdapter.SearchViewHolder>(SearchDiffutil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        return SearchViewHolder(
            ItemBannersBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
    inner class SearchViewHolder(private val binding:ItemBannersBinding):ViewHolder(binding.root){
        fun onBind(it:SearchUi){
            binding.itemNameProduct.text = it.name
            binding.itemImgProduct.loadImageURL(it.image)
            binding.itemIngredientsProduct.text = it.getAllIngredients()

        }
    }

    override fun onBindViewHolder(holder: SearchAdapter.SearchViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)
        holder.itemView.setOnClickListener {
        }

    }
}

class SearchDiffutil:DiffUtil.ItemCallback<SearchUi>() {
    override fun areItemsTheSame(oldItem: SearchUi, newItem: SearchUi): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: SearchUi, newItem: SearchUi): Boolean {
        return oldItem == newItem
    }

}
*/
