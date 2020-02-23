package com.example.encuesta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cin.*
import kotlinx.android.synthetic.main.activity_main.*

class Cin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cin)
        //Creacion del primer Listener
        btn_7.setOnClickListener {
            val intent = Intent(this, Resul::class.java)
            // Empieza la segunda ventana
            startActivity(intent)
        }
    }
}
