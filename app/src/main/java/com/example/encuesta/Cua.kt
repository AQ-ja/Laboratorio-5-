package com.example.encuesta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cua.*

class Cua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cua)
        btn_5.setOnClickListener {
            val intent = Intent(this, Cin::class.java)
            // Empieza la segunda ventana
            startActivity(intent)
        }
    }
}
