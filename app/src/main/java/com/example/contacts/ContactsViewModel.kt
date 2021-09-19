
package com.example.contactspage.ContactsViewModel

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contacts.Repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel: ViewModel() {
    val contactsRepository = ContactsRepository()
    lateinit var contactsLiveData: LiveData<List<ContactsContract.Contacts>>

    fun saveContact(contacts: ContactsContract.Contacts){
        viewModelScope.launch {
            contactsRepository.saveContact(contacts)
        }
    }
    fun getAllContacts(){
        contactsLiveData = contactsRepository.getAllContacts()
    }
    fun fetchContacts(){
        contactsLiveData = contactsRepository.fetchContacts()
    }

}