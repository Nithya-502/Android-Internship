package com.example.task_1_hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declare all the views here
    Button toast,count,reduce;
    TextView tv;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instantiate the views here
        toast = findViewById(R.id.toast);
        count = findViewById(R.id.count);
        tv = findViewById(R.id.tv);
        reduce = findViewById(R.id.reduce);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                tv.setText(""+i);
                //tv.setText(String.valueOf(i));
            }
        });
        reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i!=0){
                    i--;
                    tv.setText(""+i);
                }
            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "WELCOME TO ANDROID your count is "+i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}