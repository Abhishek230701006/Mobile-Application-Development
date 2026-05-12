package com.example.CheckBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pizza = findViewById<CheckBox>(R.id.pizza)
        val burger = findViewById<CheckBox>(R.id.burger)
        val coffee = findViewById<CheckBox>(R.id.coffee)
        val btn = findViewById<Button>(R.id.calcBtn)

        btn.setOnClickListener {

            var total = 0

            if (pizza.isChecked) {
                total += 150
            }

            if (burger.isChecked) {
                total += 120
            }

            if (coffee.isChecked) {
                total += 80
            }

            Toast.makeText(this, "Total Amount = ₹$total", Toast.LENGTH_LONG).show()
        }
    }
}