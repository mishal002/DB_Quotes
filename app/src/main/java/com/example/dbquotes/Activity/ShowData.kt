package com.example.dbquotes.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dbquotes.ModelClass.DataBaseModal
import com.example.dbquotes.R
import com.example.dbquotes.databinding.ActivityShowDataBinding
import com.example.dbquotes.util.DBHelpar
import com.example.dbquotes.util.adapter

class ShowData : AppCompatActivity() {

    lateinit var binding : ActivityShowDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)
        binding= ActivityShowDataBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.doneBtn.setOnClickListener {

        }

        var list = ArrayList<DataBaseModal>()
        var db = DBHelpar(this)
        var list2 = db.readData()
        Log.e("TAG", "onCreate: ==>" + list2.size)
        var adapter = adapter(this, list2)
        var layoutManager = LinearLayoutManager(this)
        binding.rvView.layoutManager = layoutManager
        binding.rvView.adapter = adapter
    }
}