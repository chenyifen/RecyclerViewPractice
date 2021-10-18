package com.example.recyclerviewbasicuse1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewbasicuse1.adapter.CustomAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mAdapater : CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView = findViewById(R.id.recycler)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        val dataSet = arrayOf("这是一个测试元素","这是另外一个测试元素")
        mAdapater = CustomAdapter(dataSet)
        
        mRecyclerView.adapter = mAdapater


    }
}