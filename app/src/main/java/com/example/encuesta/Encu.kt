package com.example.encuesta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_encu.*
import kotlinx.android.synthetic.main.activity_main.*

class Encu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encu)
        //Creacion del primer Listener
        btn_2.setOnClickListener {
            val intent = Intent(this, Dos::class.java)
            // Empieza la segunda ventana
            startActivity(intent)
        }
    }
}
