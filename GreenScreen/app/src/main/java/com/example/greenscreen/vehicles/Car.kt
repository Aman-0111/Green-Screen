package com.example.greenscreen.vehicles

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.greenscreen.R
import kotlinx.android.synthetic.main.activity_car.*
import kotlinx.android.synthetic.main.activity_walk.*
import kotlinx.android.synthetic.main.activity_walk.text_view


class Car : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)
        text_view.setText("CO2 emissions: ")

       // val num1 = CO2.text.toString().toInt()
    }
}