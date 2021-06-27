package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class viewcontact : AppCompatActivity() {
    lateinit var names:TextView
    lateinit var phones:TextView
    lateinit var emails:TextView
    lateinit var images:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewcontact)
        names=findViewById(R.id.tvName2)
        phones=findViewById(R.id.tvphone2)
        emails=findViewById(R.id.tvemail2)
        images=findViewById(R.id.imgpic)

        var name=intent.getStringExtra("name")
        names.text=name
        var phone=intent.getStringExtra("phoneNumber")
        phones.text=phone
        var email=intent.getStringExtra("emailAddress")
        emails.text=email
        var imagesIntent=intent.getStringExtra("imageUrl").toString()
        Picasso.get().load(imagesIntent).into(images)



        
    }
}