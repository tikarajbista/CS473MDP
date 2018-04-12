package com.example.tikarajbista.w1l4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsActivity extends AppCompatActivity {
    static ElectronicsActivity electronicsActivity;
    ListView listView;
    public static final ArrayList<Product> products = new ArrayList<Product>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
        addProduct();
        electronicsActivity = this;

        listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(new ElectronicsAdaptar());

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ElectronicDetail.class);
                intent.putExtra(ElectronicDetail.PROD_NO, (int) id);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addProduct() {
        products.add(new Product("Nikon D3300", 396.95, "Black", R.drawable.dcamera,"dcamera", "This product has a serial number that uniquely identifies the item. When your order ships, Amazon will scan the serial number and add it to the history of the order. Should the item go missing before it arrives, Amazon may register the serial number with loss and theft databases to prevent fraudulent use or resale of the item. There is no action required from you and the serial number will only be used to prevent fraudulent activity associated with the missing item."));
        products.add(new Product("Moto G PLUS (5th Generation)", 259.99,"Black, Blue", R.drawable.phone,"phone","Pre-installed selection of Amazon apps, including the Amazon Widget, provide Prime members with easy access to daily deals, Prime movies and TV shows, Prime Music, Prime Photos storage, and more with a single sign-on experience\n" +
                "Fast 4G LTE speed, up to 2.0 GHz octa-core processor, 4 GB of RAM, and a bright 5.2 full HD (1080p) display ensures videos and games run smoothly and look great"));
    }

    public void refresh(){
        listView.setAdapter(new ElectronicsAdaptar());
    }
}
