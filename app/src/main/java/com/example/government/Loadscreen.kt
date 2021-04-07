package com.example.government

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Loadscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loadscreen)


        Handler().postDelayed({
            startActivity(Intent(this@Loadscreen, LoginandReg::class.java))
            finish()
        },3000)
    }
}