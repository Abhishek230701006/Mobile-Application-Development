package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var studentCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount = findViewById<TextView>(R.id.tvCount)
        val btnCheckIn = findViewById<Button>(R.id.btnCheckIn)
        val btnCheckOut = findViewById<Button>(R.id.btnCheckOut)

        btnCheckIn.setOnClickListener {
            studentCount++
            tvCount.text = studentCount.toString()
            Toast.makeText(this, "Student Checked In!", Toast.LENGTH_SHORT).show()
        }

        btnCheckOut.setOnClickListener {
            if (studentCount > 0) {
                studentCount--
                tvCount.text = studentCount.toString()
                Toast.makeText(this, "Student Checked Out!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "No students inside!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}