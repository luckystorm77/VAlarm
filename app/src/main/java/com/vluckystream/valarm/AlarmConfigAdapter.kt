package com.vluckystream.valarm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class AlarmConfigAdapter(context: Context) : BaseAdapter() {
    private var context: Context = context
    private var layoutInflater: LayoutInflater
    private var alarmList: MutableList<AlarmConfig> = mutableListOf()

    init {
        this.layoutInflater = LayoutInflater.from(this.context)
    }

    public fun setAlarmList(alarmList: MutableList<AlarmConfig>) {
        this.alarmList = alarmList
    }

    override public fun getCount(): Int {
        return alarmList.size
    }

    override public fun getItem(position: Int): Any {
        return alarmList.get(position)
    }

    override public fun getItemId(position: Int): Long {
        return alarmList.get(position).getId()
    }

    override public fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = layoutInflater.inflate(R.layout.activity_alart_config, parent, false)

        //view.findViewById<TextView>(R.id.hour).setText(alarmList.get(position).getHour())
        //view.findViewById<TextView>(R.id.minute).setText(alarmList.get(position).getMinute())

        return view
    }
}