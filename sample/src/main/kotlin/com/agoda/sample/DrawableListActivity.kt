package com.agoda.sample

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class DrawableListActivity : AppCompatActivity() {
    val drawableIds = listOf(DrawableResource(R.drawable.ic_android_black_24dp),
                             DrawableResource(R.drawable.ic_sentiment_very_satisfied_black_24dp),
                             DrawableResource(R.drawable.ic_android_black_24dp, android.R.color.holo_red_dark),
                             DrawableResource(R.drawable.ic_android_black_24dp, scaleType = ImageView.ScaleType.FIT_XY))

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

                drawableIds[position].run {
                    vh.imageView.setImageResource(resId)
                    tint?.let {
                        vh.imageView.setColorFilter(
                            ContextCompat.getColor(vh.imageView.context,  it),
                            android.graphics.PorterDuff.Mode.SRC_IN)
                    }
                    scaleType?.let {
                        vh.imageView.scaleType = it
                    }
                }

                return view
            }

            override fun getItem(position: Int) = drawableIds[position]

            override fun getItemId(position: Int) = position.toLong()

            override fun getCount() = drawableIds.size
        }
    }

    class ViewHolder(val imageView: ImageView)

    data class DrawableResource(@DrawableRes val resId: Int, val tint: Int? = null, val scaleType: ImageView.ScaleType? = null)
}
