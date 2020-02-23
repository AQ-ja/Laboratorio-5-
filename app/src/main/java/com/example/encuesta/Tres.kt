package com.example.encuesta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tres.*

class Tres : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tres)
        btn_5.setOnClickListener {
            val intent = Intent(this, Cua::class.java)
            // Empieza la segunda ventana
            startActivity(intent)
        }
    }
}
