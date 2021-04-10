package com.example.government

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.activity_ward_option.*
import kotlinx.android.synthetic.main.activity_ward_option.idmanuel

class WardOption : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ward_option)


        checkward.setOnClickListener {
            startActivity(Intent(this,wardDashboard::class.java))

        }
        idmanuel.setOnClickListener {
            startActivity(Intent(this,Manuel::class.java))

        }
    }
}