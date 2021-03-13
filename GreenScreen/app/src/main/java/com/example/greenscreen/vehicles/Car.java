package com.example.greenscreen.vehicles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.greenscreen.R;

public class Car extends AppCompatActivity {

    EditText emissions;
    protected void onCreate(Bundle savedInstanceState) {
        double value=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        TextView CO2 = (TextView) findViewById(R.id.text_view);
        TextView overallCO2 = (TextView) findViewById(R.id.overall);
        emissions   = (EditText)findViewById(R.id.CO2);
        String text =emissions.getText().toString();

        Button button=findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) Car.this.findViewById(R.id.textView)).setText(emissions.getText().toString());
            }
        });

        if(!text.isEmpty()){
            button.setEnabled(true);
            value= Double.parseDouble(text);

        }
                // it means it is double

        CO2.setText("Car's CO2 emissions: ");
        Bundle car = getIntent().getExtras();
        double result = car.getDouble("key");

        overallCO2.setText("CO2 emissions: "+result*value+" g/km");
    }
}
