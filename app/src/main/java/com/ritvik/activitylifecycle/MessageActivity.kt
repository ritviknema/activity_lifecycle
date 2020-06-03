package com.ritvik.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_message.*

abstract class MessageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        val message = findViewById<TextView>(R.id.txtMessage)

        var text = intent.getStringExtra("Name")

        message.text = text



    }
}
