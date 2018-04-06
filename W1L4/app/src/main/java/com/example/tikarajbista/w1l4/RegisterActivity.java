package com.example.tikarajbista.w1l4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {
    EditText uEmail, uPass;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        uEmail = (EditText) findViewById(R.id.email);
        uPass = (EditText) findViewById(R.id.password);
    }

    public void clickSignUp(View view){
        String email = uEmail.getText().toString();
        String password = uPass.getText().toString();

        UserData.getUserData().getUser().add(new User(email, password));
        finish();

        // Display the Toast Message
        Context context = getApplicationContext(); // or you can pass directly this keyword.
        CharSequence text = "Account Created Successfully!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
