package com.example.lab_week_06

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab_week_06.model.CatModel

// File: CatAdapter.kt
class CatAdapter(
    private val layoutInflater: LayoutInflater,
    private val imageLoader: ImageLoader,
    // Ditambahkan: Menerima OnClickListener sebagai parameter
    private val onClickListener: OnClickListener
) : RecyclerView.Adapter<CatViewHolder>() {

    private val cats = mutableListOf<CatModel>()

    // Interface untuk click listener
    interface OnClickListener {
        fun onItemClick(cat: CatModel)
    }

    fun setData(newCats: List<CatModel>) {
        cats.clear()
        cats.addAll(newCats)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val view = layoutInflater.inflate(R.layout.item_list, parent, false)
        // Diperbaiki: Meneruskan onClickListener ke ViewHolder
        return CatViewHolder(view, imageLoader, onClickListener)
    }

    override fun getItemCount() = cats.size

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.bindData(cats[position])
    }
}