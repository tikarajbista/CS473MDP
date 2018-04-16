package com.example.tikarajbista.w2l7_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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
        Intent intent = new Intent(getApplicationContext(), ShoppingView.class);
        intent.putExtra(ShoppingView.shopId, position);
        startActivity(intent);
    }
}
