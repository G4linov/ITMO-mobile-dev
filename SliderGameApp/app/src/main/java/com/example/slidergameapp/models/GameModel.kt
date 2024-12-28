package com.example.slidergameapp.models
import kotlin.random.Random

class GameModel {
    var targetNumber: Int = 0
        private set
    var score: Int = 0
        private set
    var round: Int = 0
        private set

    init {
        resetGame()
    }

    fun resetGame() {
        score = 0
        round = 0
        generateNewNumber()
    }

    fun generateNewNumber() {
        targetNumber = Random.nextInt(1, 51)
    }

    fun calculatePoints(sliderValue: Int): Int {
        val difference = kotlin.math.abs(sliderValue - targetNumber)
        val points = kotlin.math.max(50 - difference, 0)
        score += points
        return points
    }

    fun increaseRound() {
        round++
    }

    fun isGameOver(): Boolean {
        return round >= 5
    }
}