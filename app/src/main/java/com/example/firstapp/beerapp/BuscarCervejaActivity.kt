package com.example.firstapp.beerapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.MainActivity
import com.example.firstapp.R

class BuscarCervejaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_buscacerveja)


        val spnTiposCerveja: Spinner = findViewById(R.id.spnTiposCerveja)
        val btnBuscar: Button = findViewById(R.id.btnBuscar)
        val marcasTextView: TextView = findViewById(R.id.marcasTextView)

        val tiposCerveja = listOf("Lager", "Pilsen", "Bock")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, tiposCerveja)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spnTiposCerveja.adapter = adapter

        val expertCerveja = ExpertCerveja()

        btnBuscar.setOnClickListener {
            val tipoSelecionado = spnTiposCerveja.selectedItem.toString()

            val marcas = expertCerveja.getMarcas(tipoSelecionado)

            marcasTextView.text = marcas.joinToString(", ")
        }
    }
}
