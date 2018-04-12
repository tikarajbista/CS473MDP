package com.example.tikarajbista.w2l7_p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PersonalView extends AppCompatActivity {
    public static final String personalId = "personalId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_view);

        WebView webView = (WebView) findViewById(R.id.personalView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

        int i = (Integer) getIntent().getExtras().get(personalId);
        Personal personal =(Personal) Personal.personals.get(i);
        String url = personal.getUrl();
        webView.loadUrl(url);
    }
}
