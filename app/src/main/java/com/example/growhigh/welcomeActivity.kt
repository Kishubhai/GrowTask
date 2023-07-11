package com.example.growhigh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val uploadbtn=findViewById<Button>(R.id.uploadbtn)

        uploadbtn.setOnClickListener {
            intent= Intent(applicationContext,uploadActivity::class.java)
            startActivity(intent)
        }

        val fedbtn=findViewById<Button>(R.id.feedbtn)

        fedbtn.setOnClickListener {
            intent= Intent(applicationContext,feedActivity::class.java)
            startActivity(intent)
        }
    }
}