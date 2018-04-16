package com.example.tikarajbista.w2l7_p1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById(R.id.email);
        t2 = (EditText) findViewById(R.id.password);

    }
    public void onLogin(View view) {
        SharedPreferences preferences = getSharedPreferences("login", MODE_PRIVATE);
        String email = preferences.getString("email", null);
        String password = preferences.getString("password", null);

        if(t1.getText().toString().equalsIgnoreCase(email) && t2.getText().toString().equalsIgnoreCase(password)){
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
        else
            Toast.makeText(getApplicationContext(), "Invalid Login!", Toast.LENGTH_SHORT).show();
    }

    public void onRegister(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
