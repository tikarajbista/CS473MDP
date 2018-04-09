package com.example.tikarajbista.customizedlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    static MainActivity mainActivity;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity = this;
       listView = (ListView) findViewById(R.id.list_item);
       listView.setAdapter(new MyAdapter());


    }
    public void refresh(){
        listView.setAdapter(new MyAdapter());
    }
}
