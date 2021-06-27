package com.example.contacts

import android.content.Context
import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter( var contactsList:List<Contacts>,var context:Context):RecyclerView.Adapter<contactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactsViewHolder {
       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false
       )
        return contactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: contactsViewHolder, position: Int) {
      var currentContact=contactsList.get(position)
        holder.tvname.text=currentContact.name
        holder.tvnumber.text=currentContact.phoneNumber
        holder.tvemail.text=currentContact.email
        Picasso.get().load(currentContact.imageUrl).into(holder.imgContact)
        holder.cvContacts.setOnClickListener{
         var intent=Intent(context,viewcontact::class.java)
            intent.putExtra("name",currentContact.name)
            intent.putExtra("phoneNumber",currentContact.phoneNumber)
            intent.putExtra("emailAddress",currentContact.email)
            intent.putExtra("imageUrl",currentContact.imageUrl)

            context.startActivity((intent))
        }
    }

    override fun getItemCount(): Int {
       return contactsList.size
    }

}

class contactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    var tvname = itemView.findViewById<TextView>(R.id.tvName)
    var tvnumber = itemView.findViewById<TextView>(R.id.tvphonenumber)
    var tvemail = itemView.findViewById<TextView>(R.id.tvmail)
    var imgContact = itemView.findViewById<ImageView>(R.id.imgContact)
    var cvContacts=itemView.findViewById<CardView>(R.id.cvContacts)
}