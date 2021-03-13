package com.example.greenscreen.vehicles;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.greenscreen.R;

public class Cycle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle);
        TextView CO2 = (TextView) findViewById(R.id.text_view);
        CO2.setText("CO2 emissions: ");
        Bundle cycle = getIntent().getExtras();
        double result = cycle.getDouble("key");
        CO2.setText("CO2 emissions: "+result);
}
}
