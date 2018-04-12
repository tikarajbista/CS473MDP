package com.example.tikarajbista.w2l7_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MovieList extends AppCompatActivity {
    public static MovieList movieList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);
        movieList = this;

        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new MovieAdaptar());
    }
    public  void go(int position){
        Intent intent = new Intent(getApplicationContext(), ViewWeb.class);
        intent.putExtra(ViewWeb.shopId, position);
        startActivity(intent);
    }
}
