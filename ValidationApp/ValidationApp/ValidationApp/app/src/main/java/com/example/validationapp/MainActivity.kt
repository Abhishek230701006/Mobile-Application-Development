package com.example.validationapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etID = findViewById<EditText>(R.id.etID)
        val btnValidate = findViewById<Button>(R.id.btnValidate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnValidate.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val id = etID.text.toString().trim()

            // Check if empty
            if (username.isEmpty() || id.isEmpty()) {
                tvResult.text = "❌ Both fields must not be empty!"
                tvResult.setTextColor(0xFFFF0000.toInt())
                return@setOnClickListener
            }

            // Check if username has only alphabets
            if (!username.all { it.isLetter() || it.isWhitespace() }) {
                tvResult.text = "❌ Username must contain alphabets only!"
                tvResult.setTextColor(0xFFFF0000.toInt())
                return@setOnClickListener
            }

            // Check if ID is exactly 4 digits
            if (!id.matches(Regex("\\d{4}"))) {
                tvResult.text = "❌ ID must be exactly 4 numeric digits!"
                tvResult.setTextColor(0xFFFF0000.toInt())
                return@setOnClickListener
            }

            // All good!
            tvResult.text = "✅ Validation Successful!"
            tvResult.setTextColor(0xFF008000.toInt())
        }
    }
}