package com.example.company.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FinishActivity : AppCompatActivity() {
    var number: TextView? = null
    var message: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        number = findViewById(R.id.number)
        message = findViewById(R.id.message)
        val extras = intent.extras
        number?.text = extras.getString("number")
        message?.text = extras.getString("message")

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        number = findViewById(R.id.number)
//        message = findViewById(R.id.message)
//        if(data == null) return
//        when (requestCode){
//            0 -> {
//                number?.text = data.getStringExtra("number")
//                message?.text = data.getStringExtra("message")
//            }
//        }


    }
}