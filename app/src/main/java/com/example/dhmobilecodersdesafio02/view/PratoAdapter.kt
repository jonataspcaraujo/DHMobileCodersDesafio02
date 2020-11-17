package com.example.dhmobilecodersdesafio02.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dhmobilecodersdesafio02.viewModel.PratoViewHolder
import com.example.dhmobilecodersdesafio02.model.Prato
import com.example.dhmobilecodersdesafio02.R
import com.squareup.picasso.Picasso

class PratoAdapter(
    private val itemList: List<Prato>,
    private val pratoView: PratoScreenActivity
    ):RecyclerView.Adapter<PratoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratoViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.prato_list_menu,parent,false)
        return PratoViewHolder(view)
    }

    override fun onBindViewHolder(holderPrato: PratoViewHolder, position: Int) {
        Picasso.get().load(itemList[position].itemPicture).into((holderPrato.imgView))
        holderPrato.txtItemTitle.text = itemList[position].itemTitle

//        holderPrato.imgView.setOnClickListener(View.OnClickListener {
//            val intent = Intent(pratoView, DetalheScreenActivity::class.java)
//            pratoView.startActivity(intent)
//        })
        holderPrato.imgView.setOnClickListener(View.OnClickListener {
            val intent = Intent(pratoView, DetalheScreenActivity::class.java)
            intent.putExtra("prato",itemList[position])
            pratoView.startActivity(intent)
        })



    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}