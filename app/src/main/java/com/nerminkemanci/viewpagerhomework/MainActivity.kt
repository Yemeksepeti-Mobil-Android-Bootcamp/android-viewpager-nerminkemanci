package com.nerminkemanci.viewpagerhomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.nerminkemanci.viewpagerhomework.utils.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    protected var indicatorLayout : TabLayout? = null
    protected var viewPager : ViewPager2? = null
    private var viewPagerAdapter : ViewPagerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        indicatorLayout = findViewById(R.id.indicatorLayout)
        viewPager = findViewById(R.id.viewPager)
        viewPagerAdapter = ViewPagerAdapter(this)
        viewPager?.adapter = viewPagerAdapter
        //indicatorLayout?.setupWithViewPager(viewPager,true)
        TabLayoutMediator(indicatorLayout!!,viewPager!!){tab, position -> }.attach()
    }

}
