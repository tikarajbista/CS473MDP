package com.example.tikarajbista.w1l4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ElectronicDetail extends AppCompatActivity {
    public static final String PROD_NO = "prodNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic_detail);

        int prodNo = (Integer) getIntent().getExtras().get(PROD_NO);

        Product product = ElectronicsActivity.products.get(prodNo);

        ImageView image = (ImageView) findViewById(R.id.img);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        TextView tv3 = (TextView) findViewById(R.id.tv3);
        TextView tv4 = (TextView) findViewById(R.id.tv4);




        image.setImageResource(product.getItemId());
        tv1.setText(product.getTitle());
        tv2.setText(product.getPrice().toString());
        tv3.setText(product.getColor());
        tv4.setText(product.getDescription());

    }
}
