package com.example.sahil.internshipprogram;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recyler_training);
        LinearLayout linearLayout=new LinearLayout(getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        List<Pogo> list=new ArrayList<>();


          list.add(new Pogo(R.drawable.internshalalogo,"","ONLINE SUMMER TARININGS","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));


        ListAdapter myAdapter=new ListAdapter(list,this);
        recyclerView.setAdapter(myAdapter);

        /*    button=(Button) findViewById(R.id.view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });*/
    }
}
