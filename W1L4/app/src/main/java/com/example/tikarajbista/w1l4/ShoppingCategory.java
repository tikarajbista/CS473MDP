package com.example.tikarajbista.w1l4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShoppingCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_activity);
        Intent intent = getIntent();
        String user = intent.getStringExtra("user");
        TextView userName = (TextView) findViewById(R.id.userName);
        userName.setText(user);
    }
}
