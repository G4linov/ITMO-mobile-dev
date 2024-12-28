package com.example.slidergameapp

import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.slidergameapp.models.GameModel
import com.example.slidergameapp.ui.theme.SliderGameAppTheme

class MainActivity : ComponentActivity() {

    private lateinit var gameModel: GameModel
    private lateinit var targetNumberText: TextView
    private lateinit var slider: SeekBar
    private lateinit var scoreText: TextView
    private lateinit var checkButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gameModel = GameModel()

        targetNumberText = findViewById(R.id.targetNumber)
        slider = findViewById(R.id.slider)
        scoreText = findViewById(R.id.scoreText)
        checkButton = findViewById(R.id.checkButton)

        updateUI()

        checkButton.setOnClickListener {
            val sliderValue = slider.progress + 1
            val points = gameModel.calculatePoints(sliderValue)

            if (!gameModel.isGameOver()) {
                gameModel.increaseRound()
                gameModel.generateNewNumber()
                updateUI()
                showMessage("Вы заработали $points очков!")
            } else {
                showMessage("Игра окончена! Ваш итоговый счёт: ${gameModel.score}")
                gameModel.resetGame()
                updateUI()
            }
        }
    }

    private fun updateUI() {
        targetNumberText.text = "Число: ${gameModel.targetNumber}"
        scoreText.text = "Очки: ${gameModel.score}"
        slider.progress = 24
    }

    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
