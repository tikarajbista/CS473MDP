package com.example.tikarajbista.w1l4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        intent = getIntent();
    }

    public void clickSignUp(View view){
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        UserData.getUserData().user.add(new User("email", "password"));
       // UserData.getUserData()..add(new User("email", "password"));

        finish();

        // Display the Toast Message
        Context context = getApplicationContext(); // or you can pass directly this keyword.
        CharSequence text = "Account Created Successfully!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
