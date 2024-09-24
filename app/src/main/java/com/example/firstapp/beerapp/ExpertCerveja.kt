package com.example.firstapp.beerapp

class ExpertCerveja {
    fun getMarcas(cor: String): List<String> {
        return when (cor){
            "Lager" -> listOf("Brahma", "Skol","Heineken")
            "Pilsen" -> listOf("Itaipava", "Amstel","Antarctica")
            "Bock" -> listOf("Petra", "Caracu","Eisenbahn")
            else -> listOf("Nenhuma marca existente")
        }
    }
}