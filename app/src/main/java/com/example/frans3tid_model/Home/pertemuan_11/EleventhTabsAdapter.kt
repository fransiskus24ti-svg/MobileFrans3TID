package com.example.frans3tid_model.Home.pertemuan_11

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class EleventhTabsAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    // 1. Ubah jumlah tab menjadi 3
    override fun getItemCount(): Int = 3

    // 2. Tambahkan TabCFragment pada posisi index 2
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TabAFragment()
            1 -> TabBFragment()
            2 -> TabCFragment()
            else -> throw IllegalStateException("Posisi tidak valid")
        }
    }
}