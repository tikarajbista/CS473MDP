package com.example.tikarajbista.lesson3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList arr = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void decideFood(View v){
        TextView food = (TextView) findViewById(R.id.textFood);
        food.setText("raj");
        //double r = Math.random() * 5 ;
    }
}
