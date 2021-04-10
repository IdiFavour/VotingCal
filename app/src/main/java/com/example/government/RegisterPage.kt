package com.example.government

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_login_page.*
import kotlinx.android.synthetic.main.activity_login_page.btnBackHome
import kotlinx.android.synthetic.main.activity_register_page.*


class RegisterPage : AppCompatActivity() {

    private lateinit var signAuth : FirebaseAuth
//    private lateinit var database: DatabaseReference
    private var connection = FirebaseDatabase.getInstance().reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        signAuth = FirebaseAuth.getInstance()


        btnBackHome.setOnClickListener {
            startActivity(Intent(this,LoginandReg::class.java))
            finish()
        }
        register.setOnClickListener {
            if (wardno.text.toString().isEmpty()){
                wardno.error = "Field is required"
                wardno.requestFocus()
                return@setOnClickListener
            }
            else if(emailreg.text.toString().isEmpty()){
                emailreg.error="Field is required"
                emailreg.requestFocus()
                return@setOnClickListener
            }
            else if(passwordreg.text.toString().isEmpty()){
                passwordreg.error="Field is required"
                passwordreg.requestFocus()
                return@setOnClickListener
            }
            else{
                userRegistration(emailreg.text.toString(), passwordreg.text.toString(), wardno.text.toString())
            }
        }
    }

    private fun userRegistration(email: String, pass : String, wardnum : String){
        signAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
                task -> if(task.isSuccessful){
            //function goes here
            writeNewUser(wardnum)
        }else{
            task.exception?.message?.let {
                msg(it)
            }
        }
        }
    }

    fun writeNewUser(wardnum: String) {
        val user = userDetails(wardnum)
        connection.push().setValue(user)
        welcome()
    }


}