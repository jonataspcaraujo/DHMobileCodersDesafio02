package com.example.dhmobilecodersdesafio02.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.dhmobilecodersdesafio02.R

class RegisterScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        initComponents()

    }

    private fun initComponents(){

        var nome = findViewById<EditText>(R.id.etRegisterName)
        var email = findViewById<EditText>(R.id.etRegisterEmail)
        var password = findViewById<EditText>(R.id.etRegisterPassword)
        var repassword = findViewById<EditText>(R.id.etRegisterRePassword)

        findViewById<Button>(R.id.btRegisterRegister).setOnClickListener {
            if (email.text.isNullOrEmpty() || password.text.isNullOrEmpty()){
                Toast.makeText(this, "Campos obrigatórios", Toast.LENGTH_LONG).show()
            }
            else if(!verificaEmail(email)) {
                Toast.makeText(this, "Email Inválido", Toast.LENGTH_LONG).show()
            }else if (!password.text.toString().equals(repassword.text.toString())) {
                Toast.makeText(this, "As senhas informadas não são iguais", Toast.LENGTH_LONG).show()
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