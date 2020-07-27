package com.agoda.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DrawableRecyclerActivity : AppCompatActivity() {
    val drawableIds = listOf(DrawableResource(R.drawable.ic_android_black_24dp),
                             DrawableResource(R.drawable.ic_sentiment_very_satisfied_black_24dp),
                             DrawableResource(R.drawable.ic_android_black_24dp, android.R.color.holo_red_dark))

    val list: RecyclerView by lazy { findViewById<RecyclerView>(R.id.drawableRecycler) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawable_recycler)

        list.layoutManager = LinearLayoutManager(this)
        list.adapter = object: RecyclerView.Adapter<ViewHolder>() {

            override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
            ): ViewHolder {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_image, parent, false)
                return ViewHolder(view)
            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                // - get element from your dataset at this position
                // - replace the contents of the view with that element
                drawableIds[position].run {
                    holder.imageView.setImageResource(resId)
                    tint?.let {
                        holder.imageView.setColorFilter(
                            ContextCompat.getColor(holder.imageView.context, it),
                            android.graphics.PorterDuff.Mode.SRC_IN
                        )
                    }
                }
            }

            override fun getItemCount() = drawableIds.size
        }
    }

    class ViewHolder(val root: View): RecyclerView.ViewHolder(root) {
        val imageView: ImageView by lazy { root.findViewById<ImageView>(R.id.imgView) }
    }

    data class DrawableResource(@DrawableRes val resId: Int, val tint: Int? = null)
}
