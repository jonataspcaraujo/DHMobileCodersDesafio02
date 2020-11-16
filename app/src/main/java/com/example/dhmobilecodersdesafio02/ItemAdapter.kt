package com.example.dhmobilecodersdesafio02

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ItemAdapter(
    private val itemList: List<Pratos>,
    private val itView: ItemScreenActivity
    ):RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_list_subitem,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holderHome: ItemViewHolder, position: Int) {
        Picasso.get().load(itemList[position].itemPicture).into((holderHome.imgView))
        holderHome.txtItemTitle.text = itemList[position].itemTitle

//        holderHome.itemView.setOnClickListener {
//            Toast.makeText(holderHome.itemView.context, "Item Escolhido: ${itemList[position]
//                .itemTitle}", Toast.LENGTH_SHORT).show()
//
//        }

        holderHome.imgView.setOnClickListener(View.OnClickListener {
            val intent = Intent(itView, DetailItemScreenActivity::class.java)
            itView.startActivity(intent)
        })


    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}