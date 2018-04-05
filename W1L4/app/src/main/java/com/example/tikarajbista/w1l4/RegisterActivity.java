package com.example.tikarajbista.w1l4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {
    private String email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Intent intent = getIntent();

        email = intent.getStringExtra("email");
        password = intent.getStringExtra("password");


    }

    public void clickSignUp(View view){
        MainActivity ma = new MainActivity();
        ma.addUser(new User("email", "password"));

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
