package com.ritvik.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    /*override fun onClick(v: View?) {
        Toast.makeText(this@LoginActivity,"clicked",Toast.LENGTH_LONG).show()

    }*/

    lateinit var etMobileNumber: EditText
    lateinit var etPassword : EditText
    lateinit var btnLogin : Button
    lateinit var txtForgotPassword : TextView
    lateinit var txtRegister : TextView
    val validMobileNumber = "8319774912"
    lateinit var etMessage : EditText
    lateinit var btnSend : Button
    val validPassword = arrayOf("tony","steve","bruce","thanos")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title = "Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)

        etMessage = findViewById(R.id.etMessage)
        btnSend = findViewById(R.id.btnSend)

        var nameOfAvenger: String


        btnSend.setOnClickListener {
            val message = etMessage.text.toString()

            val intent = Intent(this@LoginActivity,MessageActivity::class.java)
            intent.putExtra("Name",message)
            startActivity(intent)
        }



        btnLogin.setOnClickListener {
            val mobileNumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()


            val intent = Intent(this@LoginActivity,AvengersActivity::class.java)

            if (mobileNumber==validMobileNumber){

                if (password==validPassword[0]){
                    nameOfAvenger = "Iron Man"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }

                else if (password==validPassword[1]){
                    nameOfAvenger = "Captain America"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }

                else if(password==validPassword[2]){
                    nameOfAvenger = "Hulk"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }

                else if(password==validPassword[3]){
                    nameOfAvenger = "Thanos"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }

                else{
                    Toast.makeText(this@LoginActivity,"Incorrect Credentials",Toast.LENGTH_LONG).show()
                }

            }
            else{
                Toast.makeText(this@LoginActivity,"Incorrect Credentials",Toast.LENGTH_LONG).show()
            }



        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }

}
