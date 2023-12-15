package com.example.bogotaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bogotaapp.databinding.ActivityMenuBinding
import com.example.bogotapp.SitiosAdapter

class MenuActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recycler.adapter = SitiosAdapter(
            listOf(
                Sitio("Plaza de Bolivar", "plazabolivar","La plaza es un lugar de gran importancia histórica y cultural, ya que ha sido testigo de importantes acontecimientos de la historia colombiana, como la proclamación de la independencia de Colombia en 1819. "),
                        Sitio("Museo del oro", "museo_oro", " El museo alberga una colección de más de 55.000 piezas de orfebrería y alfarería de culturas indígenas del periodo precolombino de la actual Colombia. La colección del museo es una de las más importantes del mundo en su campo. "),
                    Sitio("Museo Nacional", "museo_nal", "El museo alberga una colección de más de 250.000 piezas, que abarcan desde la época precolombina hasta la actualidad. Su colección incluye arte, arqueología, historia y etnografía."),
        Sitio("Jardin Botanico", "jardinb", "El jardín alberga una gran variedad de plantas, incluyendo especies de todo el mundo. También cuenta con un zoológico, un museo y un centro de investigación.")

        )
        )
    }
}