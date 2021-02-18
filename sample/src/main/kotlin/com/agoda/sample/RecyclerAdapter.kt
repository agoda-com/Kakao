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
        private const val veryLongText = "What is Lorem Ipsum?\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
                "\n" +
                "Why do we use it?\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n" +
                "\n" +
                "Where does it come from?\n" +
                "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                "\n" +
                "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham."

        val longTextItem = ListItem.TextItem(veryLongText)
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
