package com.example.frans3tid_model.Home.pertemuan_11

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.example.frans3tid_model.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class EleventhActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eleventh)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Activity Eleventh"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_back)
        }

        toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val tabsAdapter = EleventhTabsAdapter(this)
        viewPager.adapter = tabsAdapter

        // TabLayoutMediator untuk 3 Tab
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Tab A"
                    tab.setIcon(R.drawable.ic_home)
                }
                1 -> {
                    tab.text = "Tab B"
                    tab.setIcon(R.drawable.ic_home)

                    val badge = tab.orCreateBadge
                    badge.number = 1
                    badge.backgroundColor = Color.parseColor("#06B6D4")
                    badge.badgeTextColor = Color.WHITE
                }
                2 -> {
                    tab.text = "Tab C"
                    tab.setIcon(R.drawable.ic_home)
                }
            }
        }.attach()
    }
}