package com.example.noteapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        saveButton = findViewById(R.id.saveButton)

        // Загружаем сохранённый текст
        val sharedPreferences = getSharedPreferences("NoteAppPrefs", Context.MODE_PRIVATE)
        val savedText = sharedPreferences.getString("noteText", "")
        editText.setText(savedText)

        saveButton.setOnClickListener {
            val textToSave = editText.text.toString()

            if (textToSave.isNotEmpty()) {
                // Сохраняем текст в SharedPreferences
                val editor = sharedPreferences.edit()
                editor.putString("noteText", textToSave)
                editor.apply()

                Toast.makeText(this, "Заметка сохранена!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Введите текст!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}