package com.example.fragmentsapp2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBasic = findViewById<Button>(R.id.btnBasic)
        val btnAdditional = findViewById<Button>(R.id.btnAdditional)

        // Default Fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, MovieBasicFragment())
            .commit()

        btnBasic.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, MovieBasicFragment())
                .commit()
        }

        btnAdditional.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, MovieAdditionalFragment())
                .commit()
        }
    }
}