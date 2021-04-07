package com.example.government

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_page.*

class RegisterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        btnBackHome.setOnClickListener {
            startActivity(Intent(this,LoginandReg::class.java))
            finish()
        }
    }
}