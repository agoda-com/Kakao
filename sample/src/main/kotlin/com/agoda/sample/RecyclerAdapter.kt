package com.agoda.sample

import androidx.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun getItemCount() = 10

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(parent.inflate(R.layout.item_recycler))

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var title: TextView
        lateinit var subtitle: TextView
        lateinit var button: Button

        init {
            with (itemView) {
                title = findViewById(R.id.title)
                subtitle = findViewById(R.id.subtitle)
                button = findViewById(R.id.button)
            }
        }

        fun bind(position: Int) {
            title.text = RecyclerAdapter.titles[position]
        }
    }

    fun ViewGroup.inflate(@LayoutRes layout: Int)
            = LayoutInflater.from(context).inflate(layout, this, false)

    companion object {
        val titles = listOf("Title 1", "Test Title", "Super Test Title", "Title 2",
                "Title 5", "Mega Test", "Uber Test", "Turtles 4",
                "Pre Final Title", "Final Title")
    }
}