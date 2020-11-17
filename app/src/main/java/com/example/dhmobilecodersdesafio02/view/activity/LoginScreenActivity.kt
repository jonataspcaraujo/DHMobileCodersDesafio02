package com.example.dhmobilecodersdesafio02.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.dhmobilecodersdesafio02.R


class LoginScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        initComponents()
    }

    private fun initComponents() {

        var email = findViewById<EditText>(R.id.etLoginEmail)
        var password = findViewById<EditText>(R.id.etLoginPassword)


        findViewById<Button>(R.id.btLoginRegister).setOnClickListener {
            val intent = Intent (this, RegisterScreenActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btLoginLogin).setOnClickListener {
            if (email.text.isNullOrEmpty() || password.text.isNullOrEmpty()){
                Toast.makeText(this, "Campos obrigatórios", Toast.LENGTH_LONG).show()
            }
            else if(!verificaEmail(email)) {
                Toast.makeText(this, "Email Inválido", Toast.LENGTH_LONG).show()
            } else{
                val intent = Intent(this, RestauranteScreenActivity::class.java)
                startActivity(intent)
            }
        }

    }

    private fun verificaEmail(email: EditText): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email.text).matches()
    }

}