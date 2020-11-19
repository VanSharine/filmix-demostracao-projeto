package com.github.grupo7dh.filmix.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.github.grupo7dh.filmix.MainActivity
import com.github.grupo7dh.filmix.R

class SplashActivity : AppCompatActivity() {
    private val splashTimeout: Long = 6000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        navigateToMainActivity()
    }
    private fun navigateToMainActivity() {
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, splashTimeout)
    }
}