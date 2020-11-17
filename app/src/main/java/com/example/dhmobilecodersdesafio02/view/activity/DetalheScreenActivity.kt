package com.example.dhmobilecodersdesafio02.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.dhmobilecodersdesafio02.R
import com.example.dhmobilecodersdesafio02.model.Prato
import com.example.dhmobilecodersdesafio02.view.adapter.PratoAdapter.Companion.KEY_PRATO
import com.squareup.picasso.Picasso

class DetalheScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_screen)

        initComponents()
    }

    private fun initComponents() {
        val prato: Prato? = intent.getParcelableExtra(KEY_PRATO)

        findViewById<ImageView>(R.id.ivItem).apply {
//            Glide.with(this@DetalheScreenActivity).load(prato?.itemPicture).into(this)
            Picasso.get().load(prato?.itemPicture).into((this))
        }
        findViewById<TextView>(R.id.tvItemName).text = prato?.itemTitle
        findViewById<TextView>(R.id.tvItemDescription).text = prato?.itemDescription

    }
}