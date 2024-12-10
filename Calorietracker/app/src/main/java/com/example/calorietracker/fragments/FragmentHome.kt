package com.example.calorietracker.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.calorietracker.R

class FragmentHome : Fragment(R.layout.fragment_home) {
    private lateinit var recyclerView: RecyclerView
    private lateinit var addMealButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.rvMeals)
        addMealButton = view.findViewById(R.id.btnAddMeal)

        // Обработка кнопки
        addMealButton.setOnClickListener {
            Toast.makeText(requireContext(), "Добавление блюда", Toast.LENGTH_SHORT).show()
        }
    }
}
