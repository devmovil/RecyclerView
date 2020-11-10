package com.devmovil.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarRecyclerView()
    }

    fun inicializarRecyclerView(){
        recyclerView = findViewById(R.id.recyclerView)
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager

        val lugares = listOf(
            Lugar(R.drawable.img_bosque, "Bosque"),
            Lugar(R.drawable.img_desierto, "Desierto"),
            Lugar(R.drawable.img_montana, "Montaña"),
            Lugar(R.drawable.img_bosque, "Bosque"),
            Lugar(R.drawable.img_selva, "Selva"),
        )

        val adapter = LugarAdapter(lugares)

        recyclerView.adapter = adapter
    }
}