package com.example.harshi.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.harshi.recyclerview.information.Information;
import com.example.harshi.recyclerview.information.ListDetail;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    GridLayoutManager layoutManager;
    ArrayList<Information> Inf;
    RAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        Inf = ListDetail.getList();
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RAdapter(MainActivity.this,Inf);
        recyclerView.setAdapter(adapter);


    }
}
