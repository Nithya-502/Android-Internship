package com.example.task_3_dateandtime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int day,month,year,min,hours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Date(View view) {
        Calendar c = Calendar.getInstance();
        day=c.get(Calendar.DATE);
        month=c.get(Calendar.MONTH);
        year=c.get(Calendar.YEAR);
        DatePickerDialog dialog= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                String date=i+"-"+(i1+1)+"-"+i2;
                Toast.makeText(MainActivity.this, ""+date, Toast.LENGTH_SHORT).show();
            }
        },year,month,day);
        dialog.show();
    }

    public void Time(View view) {
        Calendar c=Calendar.getInstance();
        min=c.get(Calendar.MINUTE);
        hours=c.get(Calendar.HOUR_OF_DAY);
        TimePickerDialog dialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                String time=i+"-"+i1;
                Toast.makeText(MainActivity.this, "now time is "+time, Toast.LENGTH_SHORT).show();
            }
        },hours,min,false);
        dialog.show();
    }
}