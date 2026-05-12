package com.example.tempconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTemperature = findViewById<EditText>(R.id.etTemperature)
        val btnConvert = findViewById<Button>(R.id.btnConvert)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnConvert.setOnClickListener {

            val input = etTemperature.text.toString()

            if (input.isEmpty()) {
                Toast.makeText(this, "Please enter a temperature", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val temp = input.toDouble()

            // Convert Celsius to Fahrenheit
            val fahrenheit = (temp * 9/5) + 32

            // Convert Fahrenheit to Celsius
            val celsius = (temp - 32) * 5/9

            tvResult.text = """
                $temp °C = $fahrenheit °F
                $temp °F = $celsius °C
            """.trimIndent()
        }
    }
}