package com.vluckystream.valarm

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.content.DialogInterface
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import java.util.*

class TimePickerFragment : DialogFragment(), TimePickerDialog.OnTimeSetListener {
    interface OnTimeSelectedListner {
        fun onSelected(hour: Int, minute: Int)
    }
    private lateinit var listener: OnTimeSelectedListner

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnTimeSelectedListner) {
            listener = context
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR)
        val minute = calendar.get(Calendar.MINUTE)
        return TimePickerDialog(context, this, hour, minute, false)
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        listener.onSelected(hourOfDay, minute)
    }
}
