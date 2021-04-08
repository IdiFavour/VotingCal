package com.example.government

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_login_page.*
import kotlinx.android.synthetic.main.activity_login_page.btnBackHome
import kotlinx.android.synthetic.main.activity_register_page.*


class RegisterPage : AppCompatActivity() {

    private lateinit var signAuth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        signAuth = FirebaseAuth.getInstance()
        var connection = FirebaseDatabase.getInstance().reference

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
            else if(unitno.text.toString().isEmpty()){
                unitno.error="Field is required"
                unitno.requestFocus()
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
//                connection.child(emailreg.text.toString()).setValue(userDetails(wardno.text.toString(), unitno.text.toString()))
                userRegistration(emailreg.text.toString(), passwordreg.text.toString(), wardno.text.toString(), unitno.text.toString())
            }
        }
    }

    private fun userRegistration(email: String, pass : String, wardnum : String, unitnum : String){
        signAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
                task -> if(task.isSuccessful){
            //function goes here
            Toast.makeText(this@RegisterPage, "Registration successful", Toast.LENGTH_SHORT).show()
            welcome()
        }else{
            task.exception?.message?.let {
                msg(it)
            }
        }
        }
    }

//    private fun addData(WardNumber : String , UnitNumber : String){
//
//        connection.addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(snapshot: DataSnapshot) {
//                // inside the method of on Data change we are setting
//                // our object class to our database reference.
//                // data base reference will sends data to firebase.
//
//                // after adding this data we are showing toast message.
//                Toast.makeText(this@RegisterPage, "Registration successful", Toast.LENGTH_SHORT).show()
//                welcome()
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                // if the data is not added or it is cancelled then
//                // we are displaying a failure toast message.
//                Toast.makeText(this@RegisterPage, "Fail to add data $error", Toast.LENGTH_SHORT).show()
//            }
//        })
//    }
}