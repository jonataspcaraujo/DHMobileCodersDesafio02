package com.example.dhmobilecodersdesafio02.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.dhmobilecodersdesafio02.R


class LoginScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        val email = findViewById<EditText>(R.id.etLoginEmail)
        val password = findViewById<EditText>(R.id.etLoginPassword)


        initComponents()
    }


    private fun initComponents() {



        findViewById<Button>(R.id.btLoginRegister).setOnClickListener {
            val intent = Intent (this, RegisterScreenActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btLoginLogin).setOnClickListener {
            val intent = Intent(this, RestauranteScreenActivity::class.java)
            startActivity(intent)
        }

    }
}