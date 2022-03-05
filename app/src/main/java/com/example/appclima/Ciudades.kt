package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG= "com.vidamrr.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bFcp = findViewById<Button>(R.id.bFcp)
        val bChetu = findViewById<Button>(R.id.bChetu)
        val bTul = findViewById<Button>(R.id.bTulum)
        val bCan = findViewById<Button>(R.id.bCancun)

        bFcp.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3527639")
            startActivity(intent)
        })

        bChetu.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3531023")
            startActivity(intent)
        })

        bTul.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3515040")
            startActivity(intent)
        })

        bCan.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3531673")
            startActivity(intent)
        })
    }
}