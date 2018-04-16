package com.example.tikarajbista.w2l7_p1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonalAdaptar extends BaseAdapter {
    @Override
    public int getCount() {
        return Personal.personals.size();
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

        LayoutInflater inflater = LayoutInflater.from(PersonalActivity.personalActivity);

        View view = inflater.inflate(R.layout.personal_view, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView textView = (TextView) view.findViewById(R.id.text);
        Button button = (Button) view.findViewById(R.id.btn);

        Personal personal =(Personal) Personal.personals.get(position);
        textView.setText(personal.getName());
        imageView.setImageResource(personal.getId());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PersonalActivity.personalActivity.go(position);
            }
        });

        return view;
    }
}
