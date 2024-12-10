package com.example.calorietracker.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.calorietracker.fragments.FragmentBodyMetrics
import com.example.calorietracker.fragments.FragmentHome
import com.example.calorietracker.fragments.FragmentRecommendations
import com.example.calorietracker.fragments.FragmentStatistics

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 4 // Количество вкладок

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentHome()
            1 -> FragmentStatistics() // Класс для "Моя статистика"
            2 -> FragmentBodyMetrics() // Класс для "Показатели тела"
            else -> FragmentRecommendations() // Класс для "Рекомендации"
        }
    }
}