package com.example.dbquotes.util

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dbquotes.Activity.MainActivity
import com.example.dbquotes.Activity.ShowData
import com.example.dbquotes.ModelClass.DataBaseModal
import com.example.dbquotes.R

class adapter(val factivity: ShowData, var list1: ArrayList<DataBaseModal>) :
    RecyclerView.Adapter<adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(factivity).inflate(R.layout.itemfile, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txt.text=list1[position].quote
    }

    override fun getItemCount(): Int {
        Log.e("TAG", "getItemCount: "+list1.size )
        return list1.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txt = itemView.findViewById<TextView>(R.id.QuotesTxt)
    }
}