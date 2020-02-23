package com.example.encuesta

//Importacion de las librerias pertinentes
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Creacion del primer Listener, para iniciar la encuesta
        btn.setOnClickListener {
            val intent = Intent(this, Encu::class.java)
            // Empieza la segunda ventana
            startActivity(intent)
        }

        //Creacion del segundo Listener para crear nueva pregunta
        btn9.setOnClickListener {
            val intent = Intent(this, Nuev::class.java)
            // Empieza la nueva ventana
            startActivity(intent)
        }

    }

}
