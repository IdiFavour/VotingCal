package com.example.government

import android.content.Intent
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_page.*

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)


        btnBackHome.setOnClickListener {
            startActivity(Intent(this,LoginandReg::class.java))
            finish()
        }
        loginbtn.setOnClickListener {
            startActivity(Intent(this,Option::class.java))
            finish()
        }
    }
}