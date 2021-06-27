package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display(listOf(Contacts("Eunice Atieno","0798676088","eunniceatieno@gmailcom",imageUrl = "https://bit.ly/2SsANU8" ),
            Contacts("Nelly Mutheu","0798676088","mutheunelly@gmailcom",imageUrl = "https://bit.ly/3qvjLBe"),
            Contacts("Wesley Mbote","0798676088","mbotewesley@gmail.com",imageUrl = "https://bit.ly/3gYQmws"),
            Contacts("Mercy Birungi","0798676088","birungimercy@gmail.com",imageUrl = "https://bit.ly/2SsANU8"),
            Contacts("Nelly mutheu","0798676088","mutheunelly@gmail.com",imageUrl = "https://bit.ly/3qrpeJA"),
            Contacts("Riri mutanu","0798676088","ririmutanu@gmail.com",imageUrl = "https://bit.ly/3gYQmws"),
            Contacts("Cate wanjiku","0798676088","wanjikucate@gmail.com",imageUrl = "https://bit.ly/2SsANU8"),
            Contacts("Eunice atieno","0798676088","eunniceatieno@gmailcom",imageUrl = "https://bit.ly/3qvjLBe"),
            Contacts("night akoth","0798676088","eunniceatieno@gmailcom",imageUrl = "https://bit.ly/3qrpeJA")))
    }

    fun display(contactList: List<Contacts>){
         var rvcontacts=findViewById<RecyclerView>(R.id.rvcontacts)
        var contactsAdapter=ContactsAdapter(contactList,baseContext)
        rvcontacts.layoutManager= LinearLayoutManager(baseContext)
        rvcontacts.adapter=contactsAdapter
    }
    }

