package com.example.tikarajbista.customizedlistview;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class MyAdapter extends BaseAdapter {

    String path = "/storage/sdcard0/clothing";
    File file = new File(path);
    String[] files = file.list();

    @Override
    public int getCount() {
        return files.length;
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
        LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.mainActivity);
        View view = layoutInflater.inflate(R.layout.activity_my_view, null);

        ImageView img = (ImageView) view.findViewById(R.id.img);
        TextView t1 = (TextView) view.findViewById(R.id.text1);
        TextView t2 = (TextView) view.findViewById(R.id.text2);
        Button button = (Button) view.findViewById(R.id.del);

        String new_path = path + files[position];
        final File new_file = new File(new_path);

        img.setImageURI(Uri.fromFile(new_file));
        t1.setText(files[position]);
        t2.setText(new_file.length() + "bytes");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new_file.delete();
                MainActivity.mainActivity.refresh();
            }
        });
        return view;
    }
}
