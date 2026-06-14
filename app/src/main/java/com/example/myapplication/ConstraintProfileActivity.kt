package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ConstraintProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_profile)

        val btnGoToRelative = findViewById<Button>(R.id.btnGoToRelative)
        val btnBack = findViewById<ImageView>(R.id.btnBack)

        btnGoToRelative.setOnClickListener {
            // Simply finish if we came from RelativeProfileActivity, 
            // or start a new intent if it's the launcher.
            finish()
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}
