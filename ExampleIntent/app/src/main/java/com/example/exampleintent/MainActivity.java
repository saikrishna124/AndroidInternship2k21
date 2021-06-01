package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //declare all the views here
    EditText name,number,link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        link=findViewById(R.id.link);
    }

    public void next(View view) {
        //here work with explicit intent
       String n=name.getText().toString();
       //Intent obj=new Intent(present class ,other class)
        //startActivity(obj)
        Intent i=new Intent(this,SecondActivity.class);
        i.putExtra("key",n);
        startActivity(i);
    }

    public void Dial(View view) {
        //here we will work with implicit intent
        String n=number.getText().toString();
        Uri uri=Uri.parse("tel:"+n);
        Intent i=new Intent(Intent.ACTION_CALL,uri);
        startActivity(i);


    }

    public void Search(View view) {
        String n=link.getText().toString();
        Uri uri=Uri.parse("https://"+n);
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }

}