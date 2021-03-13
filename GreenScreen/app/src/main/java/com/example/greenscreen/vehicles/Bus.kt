package com.example.greenscreen.vehicles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.greenscreen.R
import kotlinx.android.synthetic.main.activity_walk.*

class Bus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus)
        text_view.setText("CO2 emissions: ")
    }
}