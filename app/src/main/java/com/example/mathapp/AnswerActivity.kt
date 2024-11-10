package com.example.mathapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AnswerActivity : AppCompatActivity() {

    lateinit var resultView : TextView
    lateinit var resultImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_answer)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*resultView kopplas till TextView-elementet resultView i layouten. En Button-variabel kopplas till knappen backButton.*/
        resultView = findViewById(R.id.resultView)
        resultImageView = findViewById(R.id.resultImageView)
        val button = findViewById<Button>(R.id.backButton)

        // När knappen trycks stängs AnswerActivity och återgår till föregående aktivitet genom att anropa finish().
        button.setOnClickListener {
            finish()
        }

        // Här hämtas värdet på answeredCorrect som skickades med Intent från MainActivity. Om inget värde skickades sätts standardvärdet till false.
        val answer = intent.getBooleanExtra("answeredCorrect", false)

        // Om användarens svar var rätt (answer är true), sätts texten i resultView till "Rätt svar". Annars sätts den till "Fel svar".
        if (answer) {
            resultView.text = "Rätt svar"
            resultImageView.setImageResource(R.drawable.correct)
        } else {
            resultView.text = "Fel svar"
            resultImageView.setImageResource(R.drawable.incorrect)
        }
    }
}