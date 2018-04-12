package com.example.tikarajbista.w1l4;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private EditText emailText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addUser();

        emailText = (EditText) findViewById(R.id.email);
        passwordText = (EditText) findViewById(R.id.password);

    }

    // Method to validate the user in ArrayList (user)
    public void clickSignIn(View view){
        String email = emailText.getText().toString().trim();
        String password = passwordText.getText().toString().trim();

        Intent intent = new Intent(this, ShoppingCategory.class);


        for(int i=0; i<UserData.getUser().size(); i++){
                User usr = (User) UserData.getUser().get(i);
                if(usr.getUserName().equals(email) && usr.getPassword().equals(password)){
                   // intent.putExtra("user", email);
                    addUserCredentail(usr.getUserName(), usr.getPassword());
                    startActivity(intent);
                }
        }
    }

    // Method to Register user with email and password
    public void methodRegister(View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivityForResult(intent, 1);
    }

    // Method to add new user into ArrayLIst (user)
    public static void addUser(){
        UserData.getUserData().user.addAll(Arrays.asList(new User("rajbista@gmail.com", "rajan"), new User("tbista@mum.edu", "tbista"), new User("tbista", "tbista")));
    }

    // Method to store username and passoword in sharedPreferences

    public void addUserCredentail(String user, String pass){
        SharedPreferences preferences = getSharedPreferences("lastLogin", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= preferences.edit();

        editor.putString("username", user);
        editor.putString("password", pass);
        editor.commit();

    }




}
