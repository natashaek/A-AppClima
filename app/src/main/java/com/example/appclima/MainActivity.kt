package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)

        val ciudad = intent.getStringExtra("com.vidamrr.appclima.ciudades.CIUDAD")

        Toast.makeText(this, ciudad, Toast.LENGTH_SHORT).show()
        val ciudadfcp = Ciudad ("Felipe Carrillo Puerto", 30, "Parcialmente Nublado")
        val ciudadchetu = Ciudad ("Othon P. Blanco", 29, "Parcialmente Nublado")

        if(ciudad =="ciudad-fcp") {
            // Mostrar informacion ciudadfcp
            tvCiudad?.text = ciudadfcp.nombre
            tvGrados?.text = ciudadfcp.grados.toString() + "°"
            tvEstatus?.text= ciudadfcp.estatus

        } else if (ciudad == "ciudad-chetu") {
            // Mostrar informacion ciudadchetu
            tvCiudad?.text = ciudadchetu.nombre
            tvGrados?.text = ciudadchetu.grados.toString()+"°"
            tvEstatus?.text = ciudadchetu.estatus
        } else {
            Toast.makeText(this, "No se encuentra la informacion.", Toast.LENGTH_SHORT).show()
        }
    }
}