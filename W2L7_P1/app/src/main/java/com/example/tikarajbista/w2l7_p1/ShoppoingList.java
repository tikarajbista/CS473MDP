package com.example.tikarajbista.w2l7_p1;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShoppoingList extends AppCompatActivity {
    public static ShoppoingList shoppoingList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppoing_list);
        shoppoingList = this;

        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new ShopAdaptar());
    }

    public  void go(int position){
        Intent intent = new Intent(getApplicationContext(), ViewWeb.class);
        intent.putExtra(ViewWeb.shopId, position);
        startActivity(intent);
    }
}
