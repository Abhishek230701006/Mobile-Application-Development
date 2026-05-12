package com.example.techloungecounter // Ensure this matches your actual package name

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Variable to hold the current count
    private var studentCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Link the UI elements to variables
        val countDisplay = findViewById<TextView>(R.id.countText)
        val btnCheckIn = findViewById<Button>(R.id.btnCheckIn)
        val btnCheckOut = findViewById<Button>(R.id.btnCheckOut)

        // Logic for the Check In button
        btnCheckIn.setOnClickListener {
            studentCount++
            countDisplay.text = studentCount.toString()
        }

        // Logic for the Check Out button (prevents negative numbers)
        btnCheckOut.setOnClickListener {
            if (studentCount > 0) {
                studentCount--
                countDisplay.text = studentCount.toString()
            }
        }
    }
}