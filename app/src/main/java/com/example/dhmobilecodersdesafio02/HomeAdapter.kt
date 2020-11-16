package com.example.dhmobilecodersdesafio02

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class HomeAdapter(
    private val itemList: List<HomeItem>,
    private val homeView: HomeScreenActivity): RecyclerView.Adapter<HomeViewHolder>() {

    private val itView = ItemScreenActivity()

    //referencia o layout do item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.home_list_item,parent,false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holderHome: HomeViewHolder, position: Int) {

        Picasso.get().load(itemList[position].itemPicture).into((holderHome.imgView))

        holderHome.txtItemTitle.text = itemList[position].itemTitle
        holderHome.txtItemAdress.text = itemList[position].itemAdress
        holderHome.txtItemTime.text = itemList[position].itemTime

        holderHome.imgView.setOnClickListener(View.OnClickListener {
          val intent = Intent(homeView, ItemScreenActivity::class.java)
          intent.putExtra("restaurante",itemList[position])
            homeView.startActivity(intent)
        })

//        holderHome.itemView.setOnClickListener {
//            Toast.makeText(holderHome.itemView.context, "Item Escolhido: ${itemList[position]
//                .itemTitle}", Toast.LENGTH_SHORT).show()
//
//        }
    }

    override fun getItemCount(): Int {
        return  itemList.size
    }

}