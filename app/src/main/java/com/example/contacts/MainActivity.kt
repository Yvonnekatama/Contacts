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
        display(listOf(Contacts("Eunice Atieno","0798676088","eunniceatieno@gmailcom"),
            Contacts("Nelly Mutheu","0798676088","mutheunelly@gmailcom"),
            Contacts("Wesley Mbote","0798676088","mbotewesley@gmail.com"),
            Contacts("Mercy Birungi","0798676088","birungimercy@gmail.com"),
            Contacts("Nelly mutheu","0798676088","mutheunelly@gmail.com"),
            Contacts("Riri mutanu","0798676088","ririmutanu@gmail.com"),
            Contacts("Cate wanjiku","0798676088","wanjikucate@gmail.com"),
            Contacts("Eunice atieno","0798676088","eunniceatieno@gmailcom"),
            Contacts("night akoth","0798676088","eunniceatieno@gmailcom")))
    }

    fun display(contactList: List<Contacts>){
         var rvcontacts=findViewById<RecyclerView>(R.id.rvcontacts)
        var contactsAdapter=ContactsAdapter(contactList)
        rvcontacts.layoutManager= LinearLayoutManager(baseContext)
        rvcontacts.adapter=contactsAdapter
    }
    }

