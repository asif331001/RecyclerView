package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitsDetails extends AppCompatActivity {

    private ImageView picImageView;
    private TextView detailsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits_details);

        //adding back button in toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        picImageView = (ImageView) findViewById(R.id.FruitsImageViewId);
        detailsTextView = (TextView) findViewById(R.id.fruitsDetailsTextViewId);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){

            String fruitsName = bundle.getString("name");
            showDetails(fruitsName);
        }
    }

    void showDetails(String fruitsName){

        if (fruitsName.equals("apple")){
            picImageView.setImageResource(R.drawable.applespic);
            detailsTextView.setText(R.string.apple_info);
        }

        if (fruitsName.equals("banana")){
            picImageView.setImageResource(R.drawable.bananapic);
            detailsTextView.setText(R.string.banana_info);
        }

        if (fruitsName.equals("orange")){
            picImageView.setImageResource(R.drawable.orangepic);
            detailsTextView.setText(R.string.orange_info);
        }

        if (fruitsName.equals("mango")){
            picImageView.setImageResource(R.drawable.mangopic);
            detailsTextView.setText(R.string.mango_info);
        }

        if (fruitsName.equals("watermelon")){
            picImageView.setImageResource(R.drawable.watermelonpic);
            detailsTextView.setText(R.string.watermelon_info);
        }

        if (fruitsName.equals("strawberry")){
            picImageView.setImageResource(R.drawable.strawberriespic);
            detailsTextView.setText(R.string.strawberry_info);
        }

        if (fruitsName.equals("grapes")){
            picImageView.setImageResource(R.drawable.grapepic);
            detailsTextView.setText(R.string.grapes_info);
        }

        if (fruitsName.equals("pineapple")){
            picImageView.setImageResource(R.drawable.pineapplepic);
            detailsTextView.setText(R.string.pineapple_info);
        }

        if (fruitsName.equals("pear")){
            picImageView.setImageResource(R.drawable.pearspic);
            detailsTextView.setText(R.string.pear_info);
        }

        if (fruitsName.equals("peach")){
            picImageView.setImageResource(R.drawable.peachtable);
            detailsTextView.setText(R.string.peach_info);
        }

    }
}