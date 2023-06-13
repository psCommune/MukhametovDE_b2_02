package com.bignerdranch.android.mukhametovde_02_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var btn: Button

class SelectingInformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selecting_information)

        btn = findViewById(R.id.start_btn)
        btn.setOnClickListener {
            val intent = Intent (this, SelectingInformationActivity::class.java)
            startActivity(intent)
        }
    }
}