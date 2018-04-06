package com.example.tikarajbista.w1l4_p2;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText messageBody, search, note, sms, number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (EditText) findViewById(R.id.search);
        messageBody =  (EditText) findViewById(R.id.messageBody);
        note = (EditText) findViewById(R.id.note);
        sms = (EditText) findViewById(R.id.sms);
    }

    // Method to send message
    public void sendMessage(View view){
        String body = messageBody.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, body);

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

    // Method to perform a web search
    public void search(View view){
        String keyword = search.getText().toString();

        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, keyword);

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

    // Method to create note
    public void createNote(View view){
        String note = search.getText().toString();

        Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
        intent.putExtra(Intent.EXTRA_TEXT, note);

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

    // Method to send sms
    public void sendSms(View view){
        String sms = search.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.putExtra("sms_body", sms);

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }


    }
