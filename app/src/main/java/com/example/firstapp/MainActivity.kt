package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstapp.beerapp.BuscarCervejaActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnConsultorCerveja: Button = findViewById(R.id.btnConsultorCerveja)

        btnConsultorCerveja.setOnClickListener(){
            val intent = Intent(this, BuscarCervejaActivity::class.java)
            startActivity(intent)
        }
    }
}