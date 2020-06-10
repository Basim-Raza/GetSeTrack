package com.example.basimraza.vehiclestrackingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> name, carname, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        name = new ArrayList<>();
        carname = new ArrayList<>();
        number = new ArrayList<>();
        for (int i =0; i < 10; i++){
            name.add("Ali " + i);
            carname.add("Ferrari " + i);
            number.add("090078601");
        }

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(name, carname, number);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);
    }
}
