package com.example.tikarajbista.w2l7_p1;

import java.util.ArrayList;
import java.util.Arrays;

public class Personal {
    private String name;
    private String url;
    private int id;

    private Personal(String name, String url, int id){
        this.name = name;
        this.url = url;
        this.id = id;
    }

    public static final ArrayList personals = new ArrayList<Personal>(Arrays.asList( new Personal("Google", "https://www.google.com/", R.drawable.google), new Personal("Youtube", "https://www.youtube.com/", R.drawable.youtube), new Personal("Facebook", "https://www.facebook.com/", R.drawable.facebook)));

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
