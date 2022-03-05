package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.io.IOException
import kotlin.jvm.Throws

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

        if(Network.hayRed(this)) {
            //ejecutar solicitud http
            solicitudHTTPVolley("http://api.openweathermap.org/data/2.5/weather?id={3527639}&appid={6572f556ba651d698f8d6fdc671c3a60}")
            //solicitudHTTPVolley("api.openweathermap.org/data/2.5/weather?id={3527639}&appid={6572f556ba651d698f8d6fdc671c3a60}")
            //6572f556ba651d698f8d6fdc671c3a60
            // fcp 3527639
        } else {
            //mostrar mensaje de error
        }

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
    //Metodo para Volley
    private fun solicitudHTTPVolley(url:String) {
        val queue = Volley.newRequestQueue(this)

        val solicitud = StringRequest(Request.Method.GET, url, Response.Listener <String>{

                response ->

            try {
                Log.d("solicitudHTTPVolley", response)
            } catch (e: Exception){

            }
        }, Response.ErrorListener {  })

        queue.add(solicitud)
    }}
