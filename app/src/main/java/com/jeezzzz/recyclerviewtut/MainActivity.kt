package com.jeezzzz.recyclerviewtut

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jeezzzz.androidtut.MyAdapter
import com.jeezzzz.androidtut.User

class MainActivity : AppCompatActivity() {

    lateinit var UserArrayList:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView=findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,true)
        val name= arrayOf("Ajeesh Rawal","Innogeeks","Shubh Agarwal","Ansh Singh","Parth Aggarwal","Kshitiz Aggarwal","Ajeesh Rawal","Innogeeks","Shubh Agarwal","Ansh Singh","Parth Aggarwal","Kshitiz Aggarwal")
        val lastMsg= arrayOf("hii","class @5","yes we'll go","ui check kar","done np","hello?","hii","class @5","yes we'll go","ui check kar","done np","hello?")
        val lastMsgTime= arrayOf("5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM")
        val imageId= intArrayOf(R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,)

        UserArrayList=ArrayList()


        for(i in name.indices)
        {
            val user= User(imageId[i],name[i],lastMsg[i],lastMsgTime[i])
            UserArrayList.add(user)
        }



        recyclerView.adapter= MyAdapter(this,UserArrayList)

    }
}

