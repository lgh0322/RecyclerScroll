package com.vaca.recyclerscroll

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView

class HomeMemberAdapter(var context: Context) :
    RecyclerView.Adapter<HomeMemberAdapter.ViewHolder>() {


    interface WantInfo {
        fun go(u: String)
    }

    var myGo: WantInfo? = null

    companion object {
        val currentClickIndex = MutableLiveData<Int>()
        var currentMember = ""

    }

    var currentIndex = 0
    private val mInflater: LayoutInflater = LayoutInflater.from(context)


    val mem = ArrayList<String>()

    // inflates the cell layout from xml when needed
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = mInflater.inflate(R.layout.item_home_member, parent, false)
        return ViewHolder(view)
    }


    // binds the data to the TextView in each cell
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    // total number of cells
    override fun getItemCount(): Int {
        return 100
    }



    fun addAll(userBean: Array<String>) {
        mem.clear()
        for(k in userBean){
            mem.add(k)
        }


        notifyDataSetChanged()
    }

    inner class ViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        //        var myTextView: TextView = itemView.findViewById(R.id.t)
        val text = itemView.findViewById<TextView>(R.id.name)

        override fun onClick(view: View) {


        }

        init {
            itemView.setOnClickListener(this)
        }
    }


}