package com.vluckystream.valarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickConfigButton(view: View) {
        val intent = Intent(this, AlartConfigActivity::class.java).apply {

        }
        startActivity(intent)

    }
}
