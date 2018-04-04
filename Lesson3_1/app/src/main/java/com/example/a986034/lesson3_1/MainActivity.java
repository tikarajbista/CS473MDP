package com.example.a986034.lesson3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText input, output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.inputText);
        output = (EditText) findViewById(R.id.outputText);
    }
    protected void convertWeight(View v){
        Double x = Double.parseDouble(input.getText().toString());
        String res = String.valueOf(x * 0.453592) ;
        output.setText(res);
    }
}
