package com.example.contactspage.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.ContactsAdapter
import com.example.contacts.R

import com.example.contactspage.ContactsViewModel.ContactsViewModel



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var rvContacts: RecyclerView
    val contactsViewModel: ContactsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        contactsViewModel.getAllContacts()
        contactsViewModel.contactsLiveData.observe(this, {contacts->
            displayContacts(contacts)
        })

        binding.fabSave.setOnClickListener {
            startActivity(Intent(this,Viewcontact ::class.java))
        }
    }

    fun displayContacts(contactList: List<ContactsContract.Contacts>){
        var rvContacts=findViewById<RecyclerView>(R.id.rvcontacts)
        var contactslist= listOf(contactList)
        var contactsAdapter= ContactsAdapter(contactList,baseContext)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactsAdapter
    }
}
