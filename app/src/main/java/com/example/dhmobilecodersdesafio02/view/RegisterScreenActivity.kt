package com.example.dhmobilecodersdesafio02.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dhmobilecodersdesafio02.R

class RegisterScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        initComponents()

    }

    private fun initComponents(){

        findViewById<Button>(R.id.btRegisterRegister).setOnClickListener {
            val intent = Intent (this, RestauranteScreenActivity::class.java)
            startActivity(intent)
        }


    }

}