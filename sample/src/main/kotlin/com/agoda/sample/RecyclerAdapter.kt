package com.agoda.sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.agoda.sample.multitypeAdapter.BaseDelegatesAdapter
import com.agoda.sample.multitypeAdapter.ItemDelegate

class RecyclerAdapter : BaseDelegatesAdapter<RecyclerAdapter.ListItem>(MainItemDelegate(), CheckBoxItemDelegate()) {

    companion object {
        val finalItem = ListItem.TextItem("Final Title")
        val textItems = (0..3).map { ListItem.TextItem("Title $it") }
        val checkBoxItems = (0..3).map { ListItem.CheckBoxItem("CheckBox $it") }
    }


    sealed class ListItem {
        data class TextItem(val text: String) : ListItem()
        data class CheckBoxItem(val text: String) : ListItem()
    }

    private class MainItemDelegate : ItemDelegate<ListItem.TextItem, MainItemDelegate.Holder> {

        override fun itemType() = ListItem.TextItem::class.java

        override fun createVewHolder(parent: ViewGroup) =
            Holder(LayoutInflater.from(parent.context).inflate(R.layout.text_item_recycler, parent, false))

        override fun bindView(position: Int, item: ListItem.TextItem, holder: Holder) {
            holder.title.text = item.text
        }

        class Holder(view: View) : RecyclerView.ViewHolder(view) {
            val title: TextView = view.findViewById(R.id.title)
            val subtitle: TextView = view.findViewById(R.id.subtitle)
            val button: Button = view.findViewById(R.id.button)
        }
    }

    private class CheckBoxItemDelegate : ItemDelegate<ListItem.CheckBoxItem, CheckBoxItemDelegate.Holder> {

        override fun itemType() = ListItem.CheckBoxItem::class.java

        override fun createVewHolder(parent: ViewGroup) =
            Holder(LayoutInflater.from(parent.context).inflate(R.layout.checkbox_item_recycler, parent, false))

        override fun bindView(position: Int, item: ListItem.CheckBoxItem, holder: Holder) {
            holder.checkbox.text = item.text
        }

        class Holder(view: View) : RecyclerView.ViewHolder(view) {
            val checkbox: CheckBox = view as CheckBox
        }
    }
}
