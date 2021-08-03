package com.vaca.recyclerscroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.VERTICAL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fuck:RecyclerView=findViewById(R.id.fuck)
        val aa=HomeMemberAdapter(this)
        aa.addAll(arrayOf("fuyck","djlskf","hkjdsfjhksdjhkf"))
        fuck.layoutManager=LinearLayoutManager(this,VERTICAL,false)
        fuck.adapter=aa
        fuck.isScrollbarFadingEnabled=true
        fuck.scrollBarFadeDuration=0
    }
}