package com.example.tikarajbista.w1l4;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.Inflater;

public class ElectronicsAdaptar extends BaseAdapter{
    int id;
    @Override
    public int getCount() {
        return ElectronicsActivity.products.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from( ElectronicsActivity.electronicsActivity);

        View view = inflater.inflate(R.layout.products, null);


        ImageView img = (ImageView) view.findViewById(R.id.iView);
        TextView tv1 = (TextView) view.findViewById(R.id.tv1);
        TextView tv2 = (TextView) view.findViewById(R.id.tv2);
        TextView tv3 = (TextView) view.findViewById(R.id.tv3);

        Product prod = ElectronicsActivity.products.get(position);

        id = prod.getItemId();
        img.setImageResource(id);
        tv1.setText(prod.getTitle());
        tv2.setText(prod.getPrice().toString());
        tv3.setText(prod.getColor());
        return view;
    }
}
