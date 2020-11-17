package com.example.dhmobilecodersdesafio02.view.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dhmobilecodersdesafio02.R
import com.example.dhmobilecodersdesafio02.model.Restaurante
import com.example.dhmobilecodersdesafio02.view.activity.PratoScreenActivity
import com.example.dhmobilecodersdesafio02.view.activity.RestauranteScreenActivity
import com.squareup.picasso.Picasso

class RestauranteAdapter(
        private val itemList: List<Restaurante>,
        private val restauranteView: RestauranteScreenActivity
): RecyclerView.Adapter<RestauranteViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.restaurante_list_menu,parent,false)
        return RestauranteViewHolder(view)
    }

    override fun onBindViewHolder(holderRestaurante: RestauranteViewHolder, position: Int) {

        Picasso.get().load(itemList[position].itemPicture).into((holderRestaurante.imgView))

        holderRestaurante.txtItemTitle.text = itemList[position].itemTitle
        holderRestaurante.txtItemAdress.text = itemList[position].itemAdress
        holderRestaurante.txtItemTime.text = itemList[position].itemTime

        holderRestaurante.imgView.setOnClickListener(View.OnClickListener {
          val intent = Intent(restauranteView, PratoScreenActivity::class.java)
          intent.putExtra(KEY_RESTAURATE,itemList[position])
            restauranteView.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
        return  itemList.size
    }

    companion object {
        const val KEY_RESTAURATE = "restaurante"
    }

}