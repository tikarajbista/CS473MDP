package com.example.tikarajbista.w2l7_p1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText t1, t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        t1 = (EditText) findViewById(R.id.name);
        t2 = (EditText) findViewById(R.id.phone);
        t3 = (EditText) findViewById(R.id.email);
        t4 = (EditText) findViewById(R.id.password);
    }

    public void onRegister(View view) {
        SharedPreferences preferences = getSharedPreferences("login", MODE_PRIVATE);
        SharedPreferences.Editor editor= preferences.edit();

        editor.putString("name", t1.getText().toString());
        editor.putString("phone", t2.getText().toString());
        editor.putString("email", t3.getText().toString());
        editor.putString("password", t4.getText().toString());

        editor.commit();

        Toast.makeText(getApplicationContext(), "Account is created!", Toast.LENGTH_SHORT).show();
        finish();


    }
}
