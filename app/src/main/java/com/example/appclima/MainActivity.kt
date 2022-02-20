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
        val ciudadfcp = Ciudad("Felipe Carrillo Puerto", 30, "Parcialmente Nublado")
        val ciudadchetu = Ciudad("Chetumal", 29, "Nublado")
        val ciudadTul = Ciudad("Tulum", 28, "Mayormente soleado")
        val ciudadCan = Ciudad("Cancún", 27, "Soleado")

        when (ciudad) {
           "ciudad-fcp"  -> {
               //Mostrar informacion ciudadfcp
                tvCiudad?.text = ciudadfcp.nombre
                tvGrados?.text = ciudadfcp.grados.toString()+ "°"
                tvEstatus?.text = ciudadfcp.estatus


            }
            "ciudad-chetu"  -> {
                // Mostrar informacion ciudadchetu
                tvCiudad?.text = ciudadchetu.nombre
                tvGrados?.text = ciudadchetu.grados.toString() + "°"
                tvEstatus?.text = ciudadchetu.estatus


            }
            "ciudad-tul"  -> {
                // Mostrar informacion ciudadtul
                tvCiudad?.text = ciudadTul.nombre
                tvGrados?.text = ciudadTul.grados.toString() + "°"
                tvEstatus?.text = ciudadTul.estatus

            }
            "ciudad-can"  -> {
                //Mostrar informacion ciudadcan
                tvCiudad?.text = ciudadCan.nombre
                tvGrados?.text = ciudadCan.grados.toString()+"°"
                tvEstatus?.text = ciudadCan.estatus


            } else -> {
            Toast.makeText(this, "No se encuentra la informacion.", Toast.LENGTH_SHORT).show()
            }


        }

    }
}