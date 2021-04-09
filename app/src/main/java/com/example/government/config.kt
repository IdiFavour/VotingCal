package com.example.government

import android.content.Context
import android.content.Intent
import android.widget.Toast

fun Context.welcome(){
    var intent = Intent(this,Option::class.java).apply {
        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
    }
    startActivity(intent)
}

fun Context.msg(message:String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}