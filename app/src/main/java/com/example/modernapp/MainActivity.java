package com.example.modernapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello GitHub Actions!");
        tv.setTextSize(24);
        tv.setTextColor(Color.WHITE);
        tv.setBackgroundColor(Color.parseColor("#2196F3"));
        setContentView(tv);
    }
}
