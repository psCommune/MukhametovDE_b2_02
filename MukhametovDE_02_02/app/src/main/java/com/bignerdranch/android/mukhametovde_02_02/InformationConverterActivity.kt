package com.bignerdranch.android.mukhametovde_02_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

private lateinit var startEdText: EditText
private lateinit var byteEdText: EditText
private lateinit var kilobyteEdText: EditText
private lateinit var resultEdText: EditText

class InformationConverterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information_converter)

        startEdText = findViewById(R.id.start_edText)
        byteEdText = findViewById(R.id.byte_edText)
        kilobyteEdText = findViewById(R.id.kilobyte_edText)
        resultEdText = findViewById(R.id.result_edText)

        resultEdText.isActivated = false

        
    }
}