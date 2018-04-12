package com.example.tikarajbista.w2l7_p1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShopAdaptar extends BaseAdapter {
    @Override
    public int getCount() {
        return Shopping.shopping.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(ShoppoingList.shoppoingList);

        View view = inflater.inflate(R.layout.shop_view, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        Button go = (Button) view.findViewById(R.id.btn);
        Shopping shop =(Shopping) Shopping.shopping.get(position);

        imageView.setImageResource(shop.getId());

       go.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ShoppoingList.shoppoingList.go(position);
           }
       });
        return view;
    }
}
