package com.example.encuesta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resul.*

class Resul : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resul)
        //Creacion del primer Listener
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // Empieza la segunda ventana
            startActivity(intent)
        }
    }
}
