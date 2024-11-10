package com.example.mathapp

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// MainActivity: Klassen ärver från AppCompatActivity
class MainActivity : AppCompatActivity() {

    lateinit var questionView : TextView
    lateinit var answerView: EditText
    var correctAnswer: Int = 0                  // rätt svar på den aktuella frågan.
    var currentOperation: String = "+"          // sparar den valda operationen
    lateinit var correctSound: MediaPlayer
    lateinit var wrongSound: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) { // Körs när aktiviteten skapas
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()      // Aktiverar kant-till-kant-läge,på skärmen
        setContentView(R.layout.activity_main) // Sätter layouten
        // Systembars och Fönsterinläggningar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Knyta UI element
        questionView = findViewById(R.id.questionView)
        answerView = findViewById(R.id.answerView)
        val button = findViewById<Button>(R.id.answerButton)
        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)
        correctSound = MediaPlayer.create(this, R.raw.correct)
        wrongSound = MediaPlayer.create(this, R.raw.wrong)

        // Varje knapp tilldelas en funktion som körs när knappen klickas
        button.setOnClickListener { handleAnswer() } // Kallas när användaren klickar på answerButton
        addButton.setOnClickListener {
            currentOperation = "+"
            setNewQuestion() // Genererar en ny fråga baserad på den valda operationen.
        }
        subtractButton.setOnClickListener {
            currentOperation = "-"
            setNewQuestion()
        }
        multiplyButton.setOnClickListener {
            currentOperation = "*"
            setNewQuestion()
        }
        divideButton.setOnClickListener {
            currentOperation = "/"
            setNewQuestion()
        }
    }
}