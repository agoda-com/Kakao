package com.agoda.sample.multitypeAdapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseDelegatesAdapter<I : Any>(vararg delegates: ItemDelegate<*, *>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val delegatesIndexMap: Map<Class<*>, Int>
    private val delegatesList: List<ItemDelegate<I, RecyclerView.ViewHolder>>

    init {
        val map = mutableMapOf<Class<*>, Int>()
        delegates.forEachIndexed { index, delegate ->
            if (map.put(delegate.itemType(), index) != null) {
                throw IllegalArgumentException()
            }
        }

        delegatesIndexMap = map
        delegatesList = delegates.map {
            @Suppress("UNCHECKED_CAST")
            it as? ItemDelegate<I, RecyclerView.ViewHolder>
                ?: throw IllegalArgumentException()
        }
    }

    var items: List<I> = mutableListOf()

    override fun getItemViewType(position: Int) = delegatesIndexMap[items[position]::class.java]
        ?: throw IllegalArgumentException()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = delegatesList[viewType].createVewHolder(parent)

    override fun getItemCount() = items.count()

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegatesList[getItemViewType(position)].bindView(position, items[position], holder)
    }
}
