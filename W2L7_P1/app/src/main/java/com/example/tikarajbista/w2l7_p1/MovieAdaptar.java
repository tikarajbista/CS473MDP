package com.example.tikarajbista.w2l7_p1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieAdaptar extends BaseAdapter {
    @Override
    public int getCount() {
        return Movie.movie.size();
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
        LayoutInflater inflater = LayoutInflater.from(MovieList.movieList);

        View view = inflater.inflate(R.layout.movie_view, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        Button go = (Button) view.findViewById(R.id.btn);
        TextView textView = (TextView) view.findViewById(R.id.text);

        Movie movie =(Movie) Movie.movie.get(position);

        textView.setText(movie.getName());
        imageView.setImageResource(movie.getId());

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MovieList.movieList.go(position);
            }
        });
        return view;
    }
}
