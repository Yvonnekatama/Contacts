package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class contactsicon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactsicon)
        var btnnext=findViewById<Button>(R.id.btnnext)
        btnnext.setOnClickListener {val intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }

    }
}