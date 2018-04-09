package com.example.tikarajbista.w1l4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ShoppingCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_activity);
        Intent intent = getIntent();
        String user = intent.getStringExtra("user");
        TextView userName = (TextView) findViewById(R.id.userName);
        userName.setText("Welcome " + user);
    }

    /*public void toastMessage(View view){
        Context context = getApplicationContext();
        CharSequence text = "You have chosen\n" +
                "the Clothing category of shopping";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }*/
    // Method to handle Clothing Button
    public void onClickCloth(View voew){
        Intent intent = new Intent(this, ClothingActivity.class);
        startActivity(intent);
    }

    public void onClickBeauty(View view){
        Intent intent = new Intent(this, BeautyActivity.class);
        startActivity(intent);
    }

    // Method to handle Food Button
    public void onClickFood(View view){
        Intent intent = new Intent(this, FoodActivity.class);
        startActivity(intent);
    }
}
