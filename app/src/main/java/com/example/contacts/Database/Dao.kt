package com.example.contacts.Database

import Contact
import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface Dao {

    interface ContactDao {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertContact(contact: Contact)
        @Query("SELECT * FROM Contacts")
        fun getAllContacts(): LiveData<List<Contact>>
        @Query("SELECT * FROM Contacts WHERE contactId = :contactId")
        fun getContactById(contactId: Int): LiveData<Contact>
    }
}