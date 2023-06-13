package com.bignerdranch.android.mukhametovde_02_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

private lateinit var btn: Button
private lateinit var loginEdText: EditText
private lateinit var passwordEdText: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginEdText = findViewById(R.id.editTextTextLogin)
        passwordEdText = findViewById(R.id.editTextPassword)
        btn = findViewById(R.id.start_btn)

        btn.setOnClickListener {
            if (loginEdText.text.toString() == "" || passwordEdText.text.toString() == ""){
                val toast = Toast.makeText(applicationContext,"Введите логин и пароль", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                val intent = Intent (this, InformationConverterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}