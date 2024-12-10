package com.example.calorietracker
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailField = findViewById<EditText>(R.id.etEmail)
        val passwordField = findViewById<EditText>(R.id.etPassword)
        val loginButton = findViewById<Button>(R.id.btnLogin)
        //val signUpLink = findViewById<TextView>(R.id.tvSignUp)

        // Обработка нажатия на кнопку Login
        loginButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            // Валидация
            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Переход на главный экран
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Ошибка: пустые поля
                emailField.error = "Required"
                passwordField.error = "Required"
            }
        }

        // Переход на экран регистрации
//        signUpLink.setOnClickListener {
//            val intent = Intent(this, SignUpActivity::class.java)
//            startActivity(intent)
//        }
    }
}