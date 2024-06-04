package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var WelcomeTextView: TextView
    lateinit var ClickButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WelcomeTextView = findViewById(R.id.WelcomeTextView)
        ClickButton = findViewById(R.id.ClickButton)


        WelcomeTextView.text = "CalculadoraIMC"

        ClickButton.setOnClickListener {
            WelcomeTextView.text = "Texto del Click del Boton"

        }
    }
}