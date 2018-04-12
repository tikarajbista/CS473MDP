package com.example.tikarajbista.w2l7_p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ViewWeb extends AppCompatActivity {
    public static final String shopId = "shopId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_web);

        WebView webView = (WebView) findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

      int i = (Integer) getIntent().getExtras().get(shopId);
      Shopping shop =(Shopping) Shopping.shopping.get(i);
      String url = shop.getUrl();
        webView.loadUrl(url);
    }
}
