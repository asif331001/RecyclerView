package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyAdapter myAdapter;

    int[] images = {
            R.drawable.apple,R.drawable.banana,R.drawable.orange,R.drawable.mango,
            R.drawable.watermelon,R.drawable.strawberry,R.drawable.grapes,
            R.drawable.pineapple,R.drawable.pear,R.drawable.peach,
    };
    String[] titles, desc;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerView = findViewById(R.id.recyclerViewID);

        titles = getResources().getStringArray(R.array.fruitsName);
        desc = getResources().getStringArray(R.array.fruitsShortInfo);

        myAdapter = new MyAdapter(getApplicationContext(),images,titles,desc);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}