package com.example.pelli.a2742ex2g;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final TextView sensorReadingIdTextView;
    private final TextView dateTimeTextView;
    private final TextView valueTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.sensorReadingIdTextView = (TextView) findViewById(R.id.sensorReadingTextView);
        this.dateTimeTextView = (TextView) findViewById(R.id.dateTimeTextView);
        this.dateTimeTextView = (TextView) findViewById(R.id.valueTextView);

        this.sensorReadingIdTextView.setText("99999");
        this.dateTimeTextView.setText("2018-12-17");
        this.valueTextView.setText("29.0");


    }
}
