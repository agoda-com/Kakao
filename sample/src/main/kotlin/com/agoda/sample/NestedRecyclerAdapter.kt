package com.agoda.sample

import androidx.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NestedRecyclerAdapter : RecyclerView.Adapter<NestedRecyclerAdapter.ViewHolder>() {
    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // no-op
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(parent.inflate(R.layout.item_nested_recycler))

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.findViewById<RecyclerView>(R.id.nested_recycler_view).run {
                layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
                adapter = RecyclerAdapter()
            }
        }
    }

    fun ViewGroup.inflate(@LayoutRes layout: Int)
            = LayoutInflater.from(context).inflate(layout, this, false)
}