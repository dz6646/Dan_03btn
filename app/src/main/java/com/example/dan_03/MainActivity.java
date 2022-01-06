package com.example.dan_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int clicks;
    Button updateClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clicks = 0;
        updateClick = findViewById(R.id.clickButton);
    }

    public void updateClick(View view) {
        clicks++;
        updateClick.setText("This is a click number: " + clicks);
        if(clicks == 6)
        {
            clicks = 0;
            updateClick.setText("Enough to click go to a new start");
        }
    }
}