package com.example.growhigh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstbtnintent=findViewById<ImageButton>(R.id.firstbutton)

        firstbtnintent.setOnClickListener {
            intent= Intent(applicationContext,MissionActivity::class.java)
            startActivity(intent)
        }

        val skpbtn=findViewById<Button>(R.id.skipbtn)

        skpbtn.setOnClickListener {
            intent= Intent(applicationContext,welcomeActivity::class.java)
            startActivity(intent)
        }
    }
}