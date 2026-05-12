package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var textColorIndex = 0
    private var bgColorIndex = 0
    private var fontSizeIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val btFontSize = findViewById<Button>(R.id.btFontSize)
        val btFontColor = findViewById<Button>(R.id.btFontColor)
        val btBgColor = findViewById<Button>(R.id.bg_color)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        btFontSize.setOnClickListener {
            when (fontSizeIndex) {
                0 -> tvMessage.textSize = 30f
                1 -> tvMessage.textSize = 40f
                2 -> tvMessage.textSize = 50f
            }
            fontSizeIndex = (fontSizeIndex + 1) % 3
        }

        btFontColor.setOnClickListener {
            when (textColorIndex) {
                0 -> tvMessage.setTextColor(Color.RED)
                1 -> tvMessage.setTextColor(Color.GREEN)
                2 -> tvMessage.setTextColor(Color.YELLOW)
            }
            textColorIndex = (textColorIndex + 1) % 3
        }

        btBgColor.setOnClickListener {
            when (bgColorIndex) {
                0 -> linearLayout.setBackgroundColor(Color.LTGRAY)
                1 -> linearLayout.setBackgroundColor(Color.CYAN)
                2 -> linearLayout.setBackgroundColor(Color.MAGENTA)
            }
            bgColorIndex = (bgColorIndex + 1) % 3
        }
    }
}
