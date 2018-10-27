package com.example.hassan.intentwithgetstring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        textView = findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        Intent intent = getIntent();
        String v1 = intent.getStringExtra("Name");
        int roll=intent.getIntExtra("rollNO",0);
        textView.setText(v1);
        textView2.setText(String.valueOf(roll));

    }
}
