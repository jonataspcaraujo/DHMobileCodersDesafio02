package com.example.dhmobilecodersdesafio02.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dhmobilecodersdesafio02.R
import com.example.dhmobilecodersdesafio02.model.Prato
import com.example.dhmobilecodersdesafio02.model.Restaurante

class DetalheScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_screen)

        initComponents()
    }

    private fun initComponents() {
        val prato: Prato? = intent.getParcelableExtra("prato")

//        findViewById<RecyclerView>(R.id.rvItemSubitemList).apply {
//            layoutManager = GridLayoutManager (this@DetalheScreenActivity,2)
//            adapter = prato?.lpratoes?.let {
//                PratoAdapter(it, this.context as PratoScreenActivity) }
//
//        }
        findViewById<ImageView>(R.id.ivItem).apply {
            Glide.with(this@DetalheScreenActivity).load(prato?.itemPicture).into(this)
        }
        findViewById<TextView>(R.id.tvItemName).text = prato?.itemTitle
        findViewById<TextView>(R.id.tvItemDescription).text = prato?.itemDescription

    }
}