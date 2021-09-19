package com.example.contactspage.database

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface NotesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: ContactsContract.CommonDataKinds.Note)

    @Query(value = "SELECT * FROM Notes")
    fun getAllNotes(): LiveData<List<ContactsContract.CommonDataKinds.Note>>

    @Query("SELECT * FROM Notes WHERE noteId = :id")
    fun getNoteById(id: Int): LiveData<ContactsContract.CommonDataKinds.Note>

    @Delete
    fun deleteNote(note: ContactsContract.CommonDataKinds.Note)
}