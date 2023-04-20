package com.example.recyclerviewhwclass21

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import coil.load
import com.example.recyclerviewhwclass21.databinding.ImageDesignBinding

class ImageAdapter:ListAdapter<Image,ImageViewholder>(comparator) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewholder {
        return ImageViewholder(ImageDesignBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ImageViewholder, position: Int) {
        getItem(position).let {
            holder.binding.categoryBTN.text = it.category
            holder.binding.titleTV.text = it.title
            holder.binding.writerBTN.text = it.writer
            holder.binding.likeBTN.text = it.like
            holder.binding.dummyIV.load(it.ImageURL)
        }
    }

    companion object{
        var comparator = object : DiffUtil.ItemCallback<Image>(){
            override fun areItemsTheSame(oldItem: Image, newItem: Image): Boolean {
                return oldItem.ImageURL == newItem.ImageURL
            }

            override fun areContentsTheSame(oldItem: Image, newItem: Image): Boolean {
                return oldItem == newItem
            }

        }
    }

}