package com.krisnachy.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val dataArray = arrayOf("Kurma", "Gorengan", "Bubur Sumsum", "Terang Bulan")
        val listView = findViewById<ListView>(R.id.list_item)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, dataArray)

        listView.adapter = adapter
    }
}