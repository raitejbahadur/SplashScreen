package com.example.splash_screen

import android.net.http.HttpResponseCache.install
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.window.SplashScreen
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val splashScreen = installSplashScreen()
        //enableEdgeToEdge()
        splashScreen.setKeepOnScreenCondition{true}
        addLoading(splashScreen)
    }

    private fun addLoading(splashScreen:SplashScreen) {

        Handler(Looper.getMainLooper()).postDelayed({
            splashScreen.setKeepOnScreenCondition{false}
        },2000)
    }
}

