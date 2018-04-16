package com.example.tikarajbista.w2l7_p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MovieView extends AppCompatActivity {
    public static final String movieId = "movieId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_view);

        WebView webView = (WebView) findViewById(R.id.movieView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

        int i = (Integer) getIntent().getExtras().get(movieId);
        Movie movie =(Movie) Movie.movie.get(i);
        String url = movie.getUrl();
        webView.loadUrl(url);
    }
}
