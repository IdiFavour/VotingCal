package com.example.government

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loginand_reg.*

class LoginandReg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginand_reg)


        idlogin.setOnClickListener {
            startActivity(Intent(this,LoginPage::class.java))
        }
        idregister.setOnClickListener {
            startActivity(Intent(this,RegisterPage::class.java))
        }
        makecalculate.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}