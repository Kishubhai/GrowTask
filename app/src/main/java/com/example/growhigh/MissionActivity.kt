package com.example.growhigh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MissionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission)

        val secondbtn=findViewById<ImageButton>(R.id.secondButton)

        secondbtn.setOnClickListener {
            intent= Intent(applicationContext,visoinActivity::class.java)
            startActivity(intent)
        }

        val skpbtn=findViewById<Button>(R.id.skipbtn)

        skpbtn.setOnClickListener {
            intent= Intent(applicationContext,welcomeActivity::class.java)
            startActivity(intent)
        }
    }
}