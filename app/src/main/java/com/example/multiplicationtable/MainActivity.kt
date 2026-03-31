package com.example.multiplicationtable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //added variable to hold multiplication button
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        //Added variable that holds the user's input
        val numInput = findViewById<EditText>(R.id.edtNum)
        //a listener listens for a button that's been clicked
        btnMultiply.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("tableNumber", numInput.text.toString())
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}