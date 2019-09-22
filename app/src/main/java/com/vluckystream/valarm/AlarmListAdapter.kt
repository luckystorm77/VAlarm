package com.vluckystream.valarm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.alarm.view.*

class AlarmListAdapter(private val myDataset: MutableList<String>) : RecyclerView.Adapter<AlarmListAdapter.ViewHolder>() {
    class ViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        var time_textView: TextView = view.time_text_view as TextView
        var delete_button: Button = view.delete_button as Button
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.alarm, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.time_textView.text = myDataset[position]
        holder.delete_button.text = "d"
    }

    override fun getItemCount(): Int {
        return myDataset.size
    }
}