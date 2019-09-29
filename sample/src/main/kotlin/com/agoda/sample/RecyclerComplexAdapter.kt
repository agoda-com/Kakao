package com.agoda.sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

class RecyclerComplexAdapter : RecyclerView.Adapter<RecyclerComplexAdapter.CheckBoxViewHolder>() {
    override fun getItemCount() = settings.size

    override fun onBindViewHolder(holderCheckBox: CheckBoxViewHolder, position: Int) {
        settings.getOrNull(position)?.also { holderCheckBox.bind(it.first, it.second) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CheckBoxViewHolder(parent.inflate(R.layout.item_checkbox))

    class CheckBoxViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val checkBox: CheckBox = itemView as CheckBox

        fun bind(name : String, checked: Boolean) {
            checkBox.text = name
            checkBox.isChecked = checked
        }
    }

    fun ViewGroup.inflate(@LayoutRes layout: Int) = LayoutInflater.from(context).inflate(layout, this, false)

    companion object {
        val settings = listOf(
            "Setting 1" to false,
            "Setting 2" to true,
            "Setting 3" to false,
            "Setting 4" to false,
            "Setting 5" to false,
            "Setting 6" to false,
            "Setting 7" to false
        )
    }
}
