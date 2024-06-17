package com.foodsalesapp;

import static com.foodsalesapp.Food.SAMPLE_FOODS;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class FoodListPage extends AppCompatActivity {
    private GridView listView;
    private ImageButton chartOpt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_list_layout);
        listView = findViewById(R.id.food_list);
        chartOpt = findViewById(R.id.map_item_chart_btn);
        // Create an ArrayList to store Food objects
        ArrayList<Food> recipes = SAMPLE_FOODS();
        chartOpt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FoodListPage.this, DetailActivity.class);
                startActivity(intent);
            }
        });



        // Create a custom adapter for the ListView
        FoodListAdapter adapter = new FoodListAdapter(this, recipes);
        listView.setAdapter(adapter);
    }
}
