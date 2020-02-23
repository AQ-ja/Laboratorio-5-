package com.example.encuesta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_nuev.*

class Nuev : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuev)
        //Creacion del primer Listener
        btn8.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // Empieza la segunda ventana
            startActivity(intent)
        }
    }
}
