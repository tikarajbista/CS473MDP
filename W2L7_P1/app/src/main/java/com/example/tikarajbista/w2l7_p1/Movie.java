package com.example.tikarajbista.w2l7_p1;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    private String name;
    private String url;
    private int id;

    private Movie(String name, String url, int id){
        this.name = name;
        this.url = url;
        this.id = id;
    }

    public static final ArrayList movie = new ArrayList<Movie>(Arrays.asList( new Movie("NetFlix", "https://www.netflix.com/", R.drawable.netflix), new Movie("ViewSter", "http://www.viewster.com/", R.drawable.viewster)));

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
