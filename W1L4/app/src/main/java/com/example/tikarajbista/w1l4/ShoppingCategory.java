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

    public void toastMessage(View view){
        Context context = getApplicationContext(); // or you can pass directly this keyword.
        CharSequence text = "You have chosen\n" +
                "the Clothing category of shopping";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
