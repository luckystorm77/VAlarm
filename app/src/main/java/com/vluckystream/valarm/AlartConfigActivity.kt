package com.vluckystream.valarm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_alart_config.*

class AlartConfigActivity : AppCompatActivity(), TimePickerFragment.OnTimeSelectedListner {
    private var selectedHour: Int = 0
    private var selectedMinute: Int = 0

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alart_config)
        //TODO alarmList to array.xml
        var alarmList :ArrayList<String> = ArrayList()
        alarmList.add("10:00")
        alarmList.add("9:30")

        alarm_list.layoutManager = LinearLayoutManager(this)

        alarm_list.adapter = AlarmListAdapter(alarmList) //bug adapter
    }

    override fun onSelected(hour: Int, minute: Int) {
        this.selectedHour = hour
        this.selectedMinute = minute
    }

    fun createAlarm(view: View) {
        val timePicker = TimePickerFragment()
        timePicker.show(supportFragmentManager, "time_picker")
    }

    /*
    fun addAlarmList(list: MutableList<AlarmConfig>, alarmConfigAdapter: AlarmConfigAdapter) {
        //TODO change do
        val alarmConfig = AlarmConfig()
        alarmConfig.setHour(1)
        alarmConfig.setMinute(40)
        list.add(alarmConfig)
        alarmConfigAdapter.notifyDataSetChanged()
    }

     */
}
