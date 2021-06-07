package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] images={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        String[] itemNames={"Chiken Biryani","Matton Biryani","Chiken Curry","Prwans Curry","Fish Curry","Chiken 65","Chiken Noodles","Veg Noodles","Eag Frired Rice","Chiken Manchoriya"};
        String[] itemPrices={"200","500","300","150","200","250","350","450","500","340"};
        rv=findViewById(R.id.recycle);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}