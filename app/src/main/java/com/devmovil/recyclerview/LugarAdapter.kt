package com.devmovil.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LugarAdapter (
    val lugares: List<Lugar>
): RecyclerView.Adapter<LugarAdapter.LugarViewHolder>() {

    inner class LugarViewHolder: RecyclerView.ViewHolder{
        val imagen: ImageView
        val titulo: TextView
        constructor(item: View): super(item){
            imagen = item.findViewById(R.id.imagen)
            titulo = item.findViewById(R.id.titulo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugarViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_lugar, parent, false)
        return LugarViewHolder(view)
    }

    override fun onBindViewHolder(holder: LugarViewHolder, position: Int) {
        val item = lugares[position]

        holder.imagen.setImageResource(item.imagen)
        holder.titulo.text = item.descripcion

    }

    override fun getItemCount(): Int {
        return lugares.size
    }

}