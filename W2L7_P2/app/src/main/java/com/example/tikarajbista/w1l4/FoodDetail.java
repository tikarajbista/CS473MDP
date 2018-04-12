package com.example.tikarajbista.w1l4;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.net.URI;

public class FoodDetail extends Activity {
    public  static final String Extra_FoodNo = "foodNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        int foodNo = (Integer) getIntent().getExtras().get(Extra_FoodNo);
        Food food = Food.food[foodNo];


        ImageView photo = (ImageView) findViewById(R.id.img);
        TextView name = (TextView) findViewById(R.id.name);
        TextView desc = (TextView) findViewById(R.id.desc);


        photo.setImageResource(food.getId());
        name.setText(food.toString());
        desc.setText(food.getDesc());


        //imageView.setImageURI(Uri.fromFile());



    }
}
