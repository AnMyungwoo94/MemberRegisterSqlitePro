package com.example.memberregistersqlitepro

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.memberregistersqlitepro.databinding.ItemListBinding

class ListAdapter(val dataList : MutableList<Member>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding : ItemListBinding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }
    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
       val binding = holder.binding
       binding.tvId.text = dataList.get(position).id
       binding.tvName.text = dataList.get(position).name
       binding.tvLevel.text = dataList.get(position).level
       binding.tvPassword.text =  dataList.get(position).password
    }
    class ListViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root){

    }
}