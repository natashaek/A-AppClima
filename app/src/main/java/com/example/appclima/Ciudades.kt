package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bFcp = findViewById<Button>(R.id.bFcp)
        val bChetu = findViewById<Button>(R.id.bChetu)

        bFcp.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

        bChetu.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Chetumal", Toast.LENGTH_SHORT).show()
        })
    }
}