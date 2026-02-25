package com.example.randomnum

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

        val etMin = findViewById<EditText>(R.id.etMin)
        val etMax = findViewById<EditText>(R.id.etMax)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnGenerate.setOnClickListener {
            val minStr = etMin.text.toString()
            val maxStr = etMax.text.toString()

            if (minStr.isEmpty() || maxStr.isEmpty()) {
                Toast.makeText(this, "Please enter both min and max!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val min = minStr.toInt()
            val max = maxStr.toInt()

            if (min >= max) {
                Toast.makeText(this, "Max must be greater than Min!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val randomNumber = (min..max).random()
            tvResult.text = randomNumber.toString()
        }
    }
}