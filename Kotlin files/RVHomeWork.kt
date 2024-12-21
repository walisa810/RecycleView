package com.walisaalam.class3.RV

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.walisaalam.class3.R
import com.walisaalam.class3.recyclerVew.Product
import com.walisaalam.class3.recyclerVew.recyclerViewDemo

class RVHomeWork : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rvhome_work)

        val rvlistlayout = findViewById<RecyclerView>(R.id.rvlist)

        //layout manager
        rvlistlayout.layoutManager =LinearLayoutManager(this)

        //adapter
        val rvlistadapter = listAdapter(getDummyData())
        rvlistlayout.adapter= rvlistadapter
    }
    fun getDummyData() :ArrayList<Item>{
        val DummyData = ArrayList<Item>()
        for( i in 0..100) {
            DummyData.add(Item( name="Item $i", image="", description = "Item Number $i"))
        }
        return DummyData
    }
}