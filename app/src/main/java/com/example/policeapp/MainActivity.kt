package com.example.policeapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.calendar).setOnClickListener {
            startActivity(Intent(this, CalendarActivity::class.java))
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this, "TEST", Toast.LENGTH_SHORT).show()
    }
}