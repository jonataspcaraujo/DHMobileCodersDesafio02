package com.example.dhmobilecodersdesafio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class LoginScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        initComponents()
    }


    private fun initComponents() {

        findViewById<Button>(R.id.btLoginRegister).setOnClickListener {
            val intent = Intent (this,RegisterScreenActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btLoginLogin).setOnClickListener {
            val intent = Intent(this,HomeScreenActivity::class.java)
            startActivity(intent)
        }

    }
}