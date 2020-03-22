package com.example.myhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn3 = findViewById(R.id.button3);  //find
        final  TextView tv1 = findViewById(R.id.tv1);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show
                tv1.setText("What a wonderful world!");
               // Log.d("Main", "onClick: ");
                Log.d(  "MainActivity",  "onClick: What a wonderful world!");

            }
        });
        Log.d("MainActivity", "onCreate: ");

    }
}
