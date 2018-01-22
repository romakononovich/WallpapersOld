package xyz.romakononovich.wallpapers.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import xyz.romakononovich.wallpapers.R

/**
 * Created by romank on 22.01.18.
 */
class Splash: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onResume() {
        super.onResume()
        Handler().postDelayed({ startActivity(Intent(applicationContext, TestActivity::class.java)) }, 2000)
    }
}
