package com.example.tikarajbista.w2l7_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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
        Intent intent = new Intent(getApplicationContext(), MovieView.class);
        intent.putExtra(MovieView.movieId, position);
        startActivity(intent);
    }
}
