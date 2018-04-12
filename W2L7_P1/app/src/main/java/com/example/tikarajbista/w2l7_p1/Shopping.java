package com.example.tikarajbista.w2l7_p1;

import java.util.ArrayList;
import java.util.Arrays;

public class Shopping {
    private String name;
    private String url;
    private int id;

    private Shopping(String name, String url, int id){
        this.name = name;
        this.url = url;
        this.id = id;
    }

    public static final ArrayList shopping = new ArrayList<Shopping>(Arrays.asList( new Shopping("Amazon", "https://www.amazon.com", R.drawable.amazon), new Shopping("eBay", "https://www.ebay.com/", R.drawable.ebay)));

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
