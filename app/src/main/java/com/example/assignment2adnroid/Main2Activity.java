package com.example.assignment2adnroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView=findViewById(R.id.recycleView);

        StudentDateSaurce studentDateSaurce=StudentDateSaurce.getInstance();
        RecycleviewAdp recycleviewAdp=new RecycleviewAdp(this,studentDateSaurce.getAllStudent());

        recyclerView.setAdapter(recycleviewAdp);

        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
