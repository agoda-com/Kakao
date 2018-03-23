package com.agoda.sample

import android.support.annotation.LayoutRes
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class NestedRecyclerAdapter : RecyclerView.Adapter<NestedRecyclerAdapter.ViewHolder>() {
    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // no-op
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(parent.inflate(R.layout.item_nested_recycler))

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            if (itemView is RecyclerView) {
                itemView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
                itemView.adapter = RecyclerAdapter()
            }
        }
    }

    fun ViewGroup.inflate(@LayoutRes layout: Int)
            = LayoutInflater.from(context).inflate(layout, this, false)
}