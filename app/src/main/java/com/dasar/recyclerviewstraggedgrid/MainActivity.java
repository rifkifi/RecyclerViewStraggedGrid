package com.dasar.recyclerviewstraggedgrid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // ArrayList for person names
    ArrayList personNames = new ArrayList<>(Arrays.asList("Galaxy 1", "Galaxy 2", "Galaxy 3", "Galaxy 4", "Galaxy 5", "Galaxy 6", "Galaxy 7", "Galaxy 8", "Galaxy 9", "Galaxy 10", "Galaxy 11", "Galaxy 12", "Galaxy 13", "Galaxy 14"));
    ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.galaxy1, R.drawable.galaxy2, R.drawable.galaxy3, R.drawable.galaxy4, R.drawable.galaxy5, R.drawable.galaxy6, R.drawable.galaxy2, R.drawable.galaxy1, R.drawable.galaxy2, R.drawable.galaxy3, R.drawable.galaxy4, R.drawable.galaxy5, R.drawable.galaxy6, R.drawable.galaxy1));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a StaggeredGridLayoutManager with 3 number of columns and vertical orientation
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager); // set LayoutManager to RecyclerView
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, personNames, personImages);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}