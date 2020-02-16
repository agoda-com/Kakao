package com.agoda.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class ViewPager2Activity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager2)

        val pager = findViewById<ViewPager2>(R.id.pager)
        val adapter = ScreenSlidePagerAdapter(this, (1..5).map { SimpleFragment(it) })

        pager.adapter = adapter

    }

    private inner class ScreenSlidePagerAdapter(fragmentActivity: FragmentActivity, val pages: List<Fragment>)
        : FragmentStateAdapter(fragmentActivity) {
        override fun getItemCount(): Int = pages.size

        override fun createFragment(position: Int): Fragment = pages[position]
    }
}

class SimpleFragment(private val number: Int) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.simple_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.text).text = number.toString()
    }
}
