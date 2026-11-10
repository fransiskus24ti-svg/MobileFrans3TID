package com.example.frans3tid_model.message.tutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.frans3tid_model.R
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class TutorialMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial_message)

        val viewPager = findViewById<ViewPager2>(R.id.tutorialMessageViewPager)
        val dotIndicator = findViewById<DotsIndicator>(R.id.dot_indicator)

        val fragmentList = listOf(
            Tutorial1Fragment(),
            Tutorial2Fragment(),
            Tutorial3Fragment()
        )

        val adapter = TutorialFragmentAdapter(this, fragmentList)
        viewPager.adapter = adapter

        // Hubungkan DotsIndicator ke ViewPager2
        dotIndicator.attachTo(viewPager)
    }
}