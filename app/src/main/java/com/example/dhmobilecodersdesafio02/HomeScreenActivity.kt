package com.example.dhmobilecodersdesafio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        initComponents()
    }

    private fun initComponents() {
        val itemList = mutableListOf<HomeItem>()
        val prato = Pratos("https://c.pxhere.com/photos/c8/ea/appetizer_bowl_delicious_dish_epicure_food_fries_guacamole-1557385.jpg!d","Tony Roma's","descrição" )
        val item1 = HomeItem("https://c.pxhere.com/photos/c8/ea/appetizer_bowl_delicious_dish_epicure_food_fries_guacamole-1557385.jpg!d","Tony Roma's", "Av. Lavandisca, 717 - Indianápolis, São Paulo","Fecha às 22:00", mutableListOf(prato))
        val item2 = HomeItem("https://c.pxhere.com/images/af/50/01b0c1ceadd061577f40aba4f47c-1594753.jpg!d","Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema","Fecha às 00:00", mutableListOf(prato))
        val item3 = HomeItem("https://c.pxhere.com/photos/0c/a0/meat_plate_ketchup_frits_eat_calories_french_food-664514.jpg!d","Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo","Fecha às 00:00", mutableListOf(prato))
        val item4 = HomeItem("https://c.pxhere.com/photos/3d/86/hamburger_food_meal_tasty_dining_lunch_citizen_luncheon-927054.jpg!d","Sí Señor!", "Alameda Jauaperi, 626 - Moema","Fecha às 01:00", mutableListOf(prato))
        itemList.addAll(listOf(item1, item2, item3, item4))

//        val itemHomeDados: HomeItem? = intent.getParcelableExtra<HomeItem>("itemHomeDados")
        findViewById<RecyclerView>(R.id.rvHomeItemList).apply {
            layoutManager = LinearLayoutManager(this@HomeScreenActivity)
            adapter = HomeAdapter(itemList, this.context as HomeScreenActivity)
        }
    }
}