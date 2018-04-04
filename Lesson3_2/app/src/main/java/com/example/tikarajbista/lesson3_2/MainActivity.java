package com.example.tikarajbista.lesson3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
   ArrayList foodList = new ArrayList<String>(Arrays.asList("Hamburger", "Pizza", "Mexican", "American", "Chinese"));
   private TextView tv;
   private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textFood);
        et = (EditText) findViewById(R.id.addFood);
    }

    // Method to decide food ( randomly selects an item from foodList)
    protected void decideFood(View v){
        int r = (int)(Math.random() * foodList.size());
        tv.setText(foodList.get(r).toString());
    }

    // Add new food on ArrayList
    protected void addFood(View v){
        String txt = et.getText().toString();
        foodList.add(txt);
    }
}
