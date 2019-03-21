package com.agoda.sample

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class DrawableListActivity : AppCompatActivity() {
    val drawableIds = listOf(R.drawable.ic_android_black_24dp, R.drawable.ic_sentiment_very_satisfied_black_24dp)

    val list: ListView by lazy { findViewById<ListView>(R.id.drawableList) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawable_list)

        list.adapter = object : BaseAdapter() {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val view: View

                val vh = if (convertView != null) {
                    view = convertView
                    convertView.tag as ViewHolder
                } else {
                    view = layoutInflater.inflate(R.layout.item_image, null)
                    ViewHolder(view.findViewById(R.id.imgView)).apply { view.tag = this }
                }

                vh.imageView.setImageResource(drawableIds[position])
                return view
            }

            override fun getItem(position: Int) = drawableIds[position]

            override fun getItemId(position: Int) = position.toLong()

            override fun getCount() = drawableIds.size
        }
    }

    class ViewHolder(val imageView: ImageView)
}
