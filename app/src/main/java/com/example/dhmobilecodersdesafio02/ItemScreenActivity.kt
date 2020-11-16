package com.example.dhmobilecodersdesafio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dhmobilecodersdesafio02.HomeItem

class ItemScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_screen)

        initComponents()

    }

    private fun initComponents() {
//        val itemList = mutableListOf<HomeItem1>()
//        val item1 = HomeItem1("https://c.pxhere.com/photos/c8/ea/appetizer_bowl_delicious_dish_epicure_food_fries_guacamole-1557385.jpg!d","Salada com molho Gengibre")
//        val item2 = HomeItem1("https://c.pxhere.com/images/af/50/01b0c1ceadd061577f40aba4f47c-1594753.jpg!d","Salada com molho Gengibre")
//        val item3 = HomeItem1("https://c.pxhere.com/photos/0c/a0/meat_plate_ketchup_frits_eat_calories_french_food-664514.jpg!d","OSalada com molho Gengibre")
//        val item4 = HomeItem1("https://c.pxhere.com/photos/3d/86/hamburger_food_meal_tasty_dining_lunch_citizen_luncheon-927054.jpg!d","Salada com molho Gengibre")
//        val item5 = HomeItem1("https://c.pxhere.com/photos/c8/ea/appetizer_bowl_delicious_dish_epicure_food_fries_guacamole-1557385.jpg!d","Salada com molho Gengibre")
//        val item6 = HomeItem1("https://c.pxhere.com/images/af/50/01b0c1ceadd061577f40aba4f47c-1594753.jpg!d","Salada com molho Gengibre")
//        val item7 = HomeItem1("https://c.pxhere.com/photos/0c/a0/meat_plate_ketchup_frits_eat_calories_french_food-664514.jpg!d","OSalada com molho Gengibre")
//        val item8 = HomeItem1("https://c.pxhere.com/photos/3d/86/hamburger_food_meal_tasty_dining_lunch_citizen_luncheon-927054.jpg!d","Salada com molho Gengibre")
//
//        val addAll = itemList.addAll(listOf(item1, item2, item3, item4, item5, item6, item7, item8))

        val restaurante: HomeItem? = intent.getParcelableExtra("restaurante")

        findViewById<RecyclerView>(R.id.rvItemSubitemList).apply {
            layoutManager = GridLayoutManager (this@ItemScreenActivity,2)
            adapter = restaurante?.lpratos?.let {
                ItemAdapter(it, this.context as ItemScreenActivity) }

        }
        findViewById<ImageView>(R.id.ivItem).apply {
            Glide.with(this@ItemScreenActivity).load(restaurante?.itemPicture).into(this)
        }
    }
}