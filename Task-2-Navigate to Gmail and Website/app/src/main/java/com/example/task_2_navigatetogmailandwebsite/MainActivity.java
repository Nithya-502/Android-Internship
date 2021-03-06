package com.example.task_2_navigatetogmailandwebsite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText to,subject,message,url;
    Button web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        to = findViewById(R.id.to);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
        url= findViewById(R.id.url);
        web = findViewById(R.id.web);


    }

    public void send(View view) {
        String recipientList = to.getText().toString();
        String[] r = recipientList.split(",");
        String s = subject.getText().toString();
        String m = message.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, r);
        intent.putExtra(Intent.EXTRA_SUBJECT, s);
        intent.putExtra(Intent.EXTRA_TEXT, m);
        intent.setType("message/rfc822");
        //startActivity(Intent.createChooser(intent, "Choose an email client"));
        startActivity(intent);
    }

    public void MovetoWebsite(View view) {

        String value = url.getText().toString();
        Uri u= Uri.parse(value);
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        Intent intent1 = Intent.createChooser(i,"Open with");
        startActivity(intent1);
    }
}