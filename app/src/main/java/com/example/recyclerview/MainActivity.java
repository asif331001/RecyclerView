package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    int[] images = {
            R.drawable.apple, R.drawable.banana, R.drawable.orange, R.drawable.mango,
            R.drawable.watermelon, R.drawable.strawberry, R.drawable.grapes,
            R.drawable.pineapple, R.drawable.pear, R.drawable.peach,
    };

    String[] title, desc;
    MyAdapter myAdapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewID);

        title = getResources().getStringArray(R.array.fruitsName);
        desc = getResources().getStringArray(R.array.fruitsShortInfo);

        myAdapter = new MyAdapter(this, title, desc, images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
         if (position == 9) {
                    intent = new Intent(MainActivity.this, FruitsDetails.class);
                    intent.putExtra("name", "peach");
                    startActivity(intent);
                }
                if (position == 0) {
                    intent = new Intent(MainActivity.this, FruitsDetails.class);
                    intent.putExtra("name", "apple");
                    startActivity(intent);
                }
         if (position == 1) {
                    intent = new Intent(MainActivity.this, FruitsDetails.class);
                    intent.putExtra("name", "banana");
                    startActivity(intent);
                }
         if (position == 2) {
                    intent = new Intent(MainActivity.this, FruitsDetails.class);
                    intent.putExtra("name", "orange");
                    startActivity(intent);
                }
         if (position == 3) {
                    intent = new Intent(MainActivity.this, FruitsDetails.class);
                    intent.putExtra("name", "mango");
                    startActivity(intent);
                }
         if (position == 4) {
                    intent = new Intent(MainActivity.this, FruitsDetails.class);
                    intent.putExtra("name", "watermelon");
                    startActivity(intent);
                }
         if (position == 5) {
                    intent = new Intent(MainActivity.this, FruitsDetails.class);
                    intent.putExtra("name", "strawberry");
                    startActivity(intent);
                }
         if (position == 6) {
                    intent = new Intent(MainActivity.this, FruitsDetails.class);
                    intent.putExtra("name", "grapes");
                    startActivity(intent);
                }
         if (position == 7) {
                    intent = new Intent(MainActivity.this, FruitsDetails.class);
                    intent.putExtra("name", "pineapple");
                    startActivity(intent);
                }
         if (position == 8) {
                    intent = new Intent(MainActivity.this, FruitsDetails.class);
                    intent.putExtra("name", "pear");
                    startActivity(intent);
                }
            }

            @Override
            public void onItemLongClick(int position, View v) {

            }
        });
    }
}