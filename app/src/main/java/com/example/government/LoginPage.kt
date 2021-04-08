package com.example.government

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login_page.*

class LoginPage : AppCompatActivity() {
    private lateinit var signAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        signAuth = FirebaseAuth.getInstance()

        btnBackHome.setOnClickListener {
            startActivity(Intent(this,LoginandReg::class.java))
            finish()
        }
        loginbtn.setOnClickListener {
            if (email.text.toString().isEmpty()){
                email.error = "Field is required"
                email.requestFocus()
                return@setOnClickListener
            }
            else if(password.text.toString().isEmpty()){
                password.error = "Field is required"
                password.requestFocus()
                return@setOnClickListener
            }
            else{
                userLog(email.text.toString(), password.text.toString())
            }

        }
    }

    private fun userLog(email : String, password : String){
        signAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this){
                work ->
            if (work.isSuccessful){
                welcome()
            }
            else{
                work.exception?.message?.let {
                    msg(it)
                }
            }
        }
    }
    private fun userLog(email : String, password : String){
        signAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this){
                work ->
            if (work.isSuccessful){
                welcome()
            }
            else{
                work.exception?.message?.let {
                    msg(it)
                }
            }
        }
    }
}