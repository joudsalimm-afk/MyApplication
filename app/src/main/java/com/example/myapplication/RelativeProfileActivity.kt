package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RelativeProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_profile)

        val btnGoToConstraint = findViewById<Button>(R.id.btnGoToConstraint)
        val btnBack = findViewById<ImageView>(R.id.btnBack)

        btnGoToConstraint.setOnClickListener {
            val intent = Intent(this, ConstraintProfileActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}
