package com.example.connectinginterfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToNextPage = findViewById<Button>(R.id.buttonSwitchActivity)
        goToNextPage.setOnClickListener { setContentView(R.layout.activity_about_me) }
    }
}