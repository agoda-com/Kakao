package com.agoda.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class ListActivity : AppCompatActivity() {
    val items = listOf("Title 1", "Title 2", "Title 3", "Title 4", "Title 5",
                       "Title 6", "Title 7", "Title 8", "Title 9", "Title 10")

    val list: ListView by lazy { findViewById(R.id.list) as ListView }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        list.adapter = object : BaseAdapter() {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val view: View

                val vh =  if (convertView != null) {
                    view = convertView
                    convertView.tag as ViewHolder
                } else {
                    view = layoutInflater.inflate(R.layout.item_recycler, null)
                    ViewHolder(view.findViewById(R.id.title) as TextView).apply { view.tag = this }
                }

                vh.title.text = items[position]
                return view
            }

            override fun getItemId(position: Int) = position.toLong()

            override fun getItem(position: Int) = items[position]

            override fun getCount() = items.size

        }
    }

    class ViewHolder(val title: TextView)
}