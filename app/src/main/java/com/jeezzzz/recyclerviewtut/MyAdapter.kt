package com.jeezzzz.androidtut

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jeezzzz.androidtut.MyAdapter.MyViewHolder
import com.jeezzzz.recyclerviewtut.R
import de.hdodenhof.circleimageview.CircleImageView



class MyAdapter(val context :Activity,var arraylist:ArrayList<User>):
RecyclerView.Adapter<MyViewHolder>() {
    class MyViewHolder(itemView:View):
        RecyclerView.ViewHolder(itemView) {

        var name = itemView.findViewById<TextView>(R.id.nameTxt)
        var lastMsg = itemView.findViewById<TextView>(R.id.lastMsgTxt)
        var lastMsgTime = itemView.findViewById<TextView>(R.id.lastMsgTimeTxt)
        var imageID = itemView.findViewById<CircleImageView>(R.id.profileImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view=LayoutInflater.from(context).inflate(R.layout.custom_user,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.name.text=arraylist[position].name
        holder.lastMsg.text=arraylist[position].lastMsg
        holder.lastMsgTime.text=arraylist[position].lastMsgTime
        holder.imageID.setImageResource(arraylist[position].imageID)
    }
}


//class MyAdapter(val context :Activity,var arraylist:ArrayList<User>):
//RecyclerView.Adapter<MyViewHolder>() {
//    class MyViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
//
//        var name = itemView.findViewById<TextView>(R.id.nameTxt)
//        var lastMsg = itemView.findViewById<TextView>(R.id.lastMsgTxt)
//        var lastMsgTime = itemView.findViewById<TextView>(R.id.lastMsgTimeTxt)
//        var imageID = itemView.findViewById<CircleImageView>(R.id.profileImage)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        val view=LayoutInflater.from(context).inflate(R.layout.custom_user,parent,false)
//        return MyViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        val currentItem=arraylist[position]
//        holder.name.text=currentItem.name
//        holder.lastMsg.text=currentItem.lastMsg
//        holder.lastMsgTime.text=currentItem.lastMsgTime
//        holder.imageID.setImageResource(currentItem.imageID)
//    }
//
//    override fun getItemCount(): Int {
//        return arraylist.size
//    }
//}





//class MyAdapter(val context:Activity,val arraylist:
//ArrayList<User>):ArrayAdapter<User>(context,R.layout.custom_user,arraylist) {
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//
//        val inflater = LayoutInflater.from(context)
//        val view = inflater.inflate(R.layout.custom_user, null)
//        val name = view.findViewById<TextView>(R.id.nameTxt)
//        val lastMsg = view.findViewById<TextView>(R.id.lastMsgTxt)
//        val lastMsgTime = view.findViewById<TextView>(R.id.lastMsgTimeTxt)
//        val imageID = view.findViewById<CircleImageView>(R.id.profileImage)
//
//
//        name.text = arraylist[position].name
//        lastMsg.text = arraylist[position].lastMsg
//        lastMsgTime.text = arraylist[position].lastMsgTime
//        imageID.setImageResource(arraylist[position].imageID)
//        return view
//    }
//
//}




