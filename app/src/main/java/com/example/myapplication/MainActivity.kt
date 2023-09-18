package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var buttonChangeText: Button
    private lateinit var buttonChangeColor: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        buttonChangeText = findViewById(R.id.button)
        buttonChangeColor = findViewById(R.id.button2)

        buttonChangeText.setOnClickListener {
            // Change the TextView text when the "Button that changes the text" is clicked
            textView.text = "sefuiafseaefwfwae"
        }

        buttonChangeColor.setOnClickListener {
            // Change the text color of the TextView to red when the "Button that changes the color" is clicked
            textView.setTextColor(resources.getColor(android.R.color.holo_red_dark))
        }
    }
}
