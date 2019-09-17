package com.vluckystream.valarm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_alart_config.*

class AlartConfigActivity : AppCompatActivity(), TimePickerFragment.OnTimeSelectedListner {
    private var selectedHour: Int = 0
    private var selectedMinute: Int = 0

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alart_config)
        //val listView: ListView = findViewById(R.id.alarmList)

        val list: MutableList<AlarmConfig> = mutableListOf()
        val alarmConfigAdapter = AlarmConfigAdapter(this)

        addAlarmList(list, alarmConfigAdapter)

        alarmConfigAdapter.setAlarmList(list)
        //this.alarmList.adapter = alarmConfigAdapter

    }

    override fun onSelected(hour: Int, minute: Int) {
        this.selectedHour = hour
        this.selectedMinute = minute
    }

    fun createAlarm(view: View) {
        val timePicker = TimePickerFragment()
        timePicker.show(supportFragmentManager, "time_picker")
    }

    fun addAlarmList(list: MutableList<AlarmConfig>, alarmConfigAdapter: AlarmConfigAdapter) {
        //TODO change do
        val alarmConfig = AlarmConfig()
        alarmConfig.setHour(1)
        alarmConfig.setMinute(40)
        list.add(alarmConfig)
        alarmConfigAdapter.notifyDataSetChanged()
    }
}
