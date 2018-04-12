package com.example.tikarajbista.w2l7_p1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class PersonalActivity extends AppCompatActivity {
    public static PersonalActivity personalActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        personalActivity = this;

        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new PersonalAdaptar());
    }

    public  void go(int position){
        Intent intent = new Intent(getApplicationContext(), PersonalView.class);
        intent.putExtra(PersonalView.personalId, position);
        startActivity(intent);
    }

}
