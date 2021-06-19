package com.example.contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter( var contactsList:List<Contacts>):RecyclerView.Adapter<contactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactsViewHolder {
       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false
       )
        return contactsViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: contactsViewHolder, position: Int) {
      var currentContact=contactsList.get(position)
        holder.tvname.text=currentContact.name
        holder.tvnumber.text=currentContact.phoneNumber
        holder.tvemail.text=currentContact.email
    }

    override fun getItemCount(): Int {
       return contactsList.size
    }

}

class contactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvName)
    var tvnumber=itemView.findViewById<TextView>(R.id.tvphonenumber)
    var tvemail=itemView.findViewById<TextView>(R.id.tvmail)
}