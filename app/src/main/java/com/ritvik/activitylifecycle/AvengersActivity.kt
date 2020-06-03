package com.ritvik.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text.*

class AvengersActivity : AppCompatActivity() {

    var titleName: String? = "Avenger"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_example)

        if(intent!=null){
            titleName = intent.getStringExtra("Name")
        }

        title = titleName
    }
}
