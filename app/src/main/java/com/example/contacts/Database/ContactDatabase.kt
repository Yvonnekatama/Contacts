package com.example.contactspage.database

import android.content.Context
import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.contacts.Database.Dao


@Database(entities = arrayOf(ContactsContract.Contacts::class, ContactsContract.CommonDataKinds.Note::class),  version = 2)
abstract class ContactsDatabase: RoomDatabase() {
    abstract fun contactDao(): Dao.ContactDao

    abstract fun getNotesDao(): NotesDao

    companion object {
        private var database: ContactsDatabase? = null

        fun getDatabase(context: Context): ContactsDatabase {
            if (database == null) {
                database =
                    Room.databaseBuilder(context, ContactsDatabase::class.java, "contactsDb")
                        .fallbackToDestructiveMigration().build()
            }
            return database as ContactsDatabase
        }
    }
}
