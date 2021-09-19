
package com.example.contactspage.repository

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import com.example.contactspage.ContactsApp
import com.example.contactspage.database.ContactsDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database = ContactsDatabase.getDatabase(ContactsApp.appContext)

    suspend fun saveContact(contact: ContactsContract.Contacts){
        withContext(Dispatchers.IO){
            database.contactDao().insertContact(Contact)
        }
    }

    fun getAllContacts(): LiveData<List<ContactsContract.Contacts>>{
        return database.contactDao().getAllContacts()
    }

    fun fetchContacts(): LiveData<List<ContactsContract.Contacts>>{
        return database.contactDao().getAllContacts()
    }

    fun getContactById(contactId: Int): LiveData<ContactsContract.Contacts> {
        return database.contactDao().getContactById(contactId)
    }
}