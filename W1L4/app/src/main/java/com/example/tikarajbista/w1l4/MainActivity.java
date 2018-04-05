package com.example.tikarajbista.w1l4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ArrayList user = new ArrayList<User>();
    private EditText emailText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user.addAll(Arrays.asList(new User("rajbista@gmail.com", "rajan"), new User("tbista@mum.edu", "tbista"), new User("tbista", "tbista")));

        emailText = (EditText) findViewById(R.id.email);
        passwordText = (EditText) findViewById(R.id.password);
    }

    // Method to validate the user in ArrayList (user)
    public void clickSignIn(View view){
        String email = emailText.getText().toString().trim();
        String password = passwordText.getText().toString().trim();

        Intent intent = new Intent(this, ShoppingCategory.class);
       /* intent.putExtra("user", this.email);
        startActivity(intent);*/
            for(int i=0; i<user.size(); i++){
                User usr = (User) user.get(i);
                if(usr.getUserName().equals(email) && usr.getPassword().equals(password)){
                    intent.putExtra("user", email);
                    startActivity(intent);
                }
        }
    }

    // Method to Register user with email and password
    public void methodRegister(View view){
        String email = emailText.getText().toString().trim();
        String password = passwordText.getText().toString().trim();

        Intent intent = new Intent(this, RegisterActivity.class);
        intent.putExtra("email", email);
        intent.putExtra("password", password);
        startActivity(intent);
    }

    // Method to add new user into ArrayLIst (user)
    public void addUser(User usr){
        this.user.add(usr);
    }
}
