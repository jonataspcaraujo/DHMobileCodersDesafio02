package com.example.dhmobilecodersdesafio02


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {
    // This is the loading time of the splash screen
    private val SPLASH_TIME_OUT:Long = 1000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //deprecated method. Find another way later
        Handler(Looper.getMainLooper()).postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity
            startActivity(Intent(this,LoginScreenActivity::class.java))

            //close this activity
            finish()

        }, SPLASH_TIME_OUT)

    }
}