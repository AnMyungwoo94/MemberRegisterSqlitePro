package com.example.memberregistersqlitepro

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.memberregistersqlitepro.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    lateinit var binding: ActivityListBinding
    lateinit var dbHelper: DBHelper
    var dataList: MutableList<Member> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dbHelper  = DBHelper(applicationContext,  MainActivity.DB_NAME, MainActivity.VERION)

        dataList = dbHelper.selectAll()!!
        binding.recyclerView.adapter = ListAdapter(dataList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}