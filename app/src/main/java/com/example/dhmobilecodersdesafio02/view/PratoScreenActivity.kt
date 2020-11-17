package com.example.dhmobilecodersdesafio02.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dhmobilecodersdesafio02.R
import com.example.dhmobilecodersdesafio02.model.Restaurante

class PratoScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prato_screen)

        initComponents()

    }

    private fun initComponents() {

        val restaurante: Restaurante? = intent.getParcelableExtra("restaurante")

        findViewById<RecyclerView>(R.id.rvItemSubitemList).apply {
            layoutManager = GridLayoutManager (this@PratoScreenActivity,2)
            adapter = restaurante?.lpratoes?.let {
                PratoAdapter(it, this.context as PratoScreenActivity) }

        }
        findViewById<ImageView>(R.id.ivItem).apply {
            Glide.with(this@PratoScreenActivity).load(restaurante?.itemPicture).into(this)
        }
        findViewById<TextView>(R.id.tvItemName).text = restaurante?.itemTitle
    }
}

