package com.example.dhmobilecodersdesafio02.view.activity


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.dhmobilecodersdesafio02.R

class SplashScreenActivity : AppCompatActivity() {
    // This is the loading time of the splash screen
    private val SPLASH_TIME_OUT:Long = 1000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val imageSplash = "https://c.pxhere.com/photos/c8/ea/appetizer_bowl_delicious_dish_epicure_food_fries_guacamole-1557385.jpg!d"
        findViewById<ImageView>(R.id.ivSplashScreenImage).apply {
            Glide.with(this@SplashScreenActivity).load(imageSplash).into(this)
        }

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LoginScreenActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)

    }
}