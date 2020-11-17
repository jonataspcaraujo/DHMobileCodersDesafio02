package com.example.dhmobilecodersdesafio02.viewModel

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dhmobilecodersdesafio02.R


class RestauranteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    val imgView: ImageView = itemView.findViewById(R.id.ivMenuItem)
    val txtItemTitle : TextView = itemView.findViewById(R.id.tvMenuItemTitle)
    val txtItemAdress : TextView = itemView.findViewById(R.id.tvMenuItemAdress)
    val txtItemTime : TextView = itemView.findViewById(R.id.tvMenuItemTime)
}