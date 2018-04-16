package com.example.tikarajbista.fragment_example;

import android.app.DatePickerDialog;
import android.app.Fragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class HomeFragment extends Fragment{

    Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = DateFormat.getDateTimeInstance();
    TextView tv1;
    Button btn1, btn2;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_galary, container, false);
        tv1 = (TextView) view.findViewById(R.id.tv1);
        btn1 =(Button) view.findViewById(R.id.bt1);
        btn2 = (Button) view.findViewById(R.id.bt2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDate();
            }
        });
        
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTime();
            }
        });

        updateLabel();
        return view;
    }

    private void updateLabel() {
        tv1.setText(dateFormat.format(calendar.getTime()));
    }

    private void updateTime() {

    }

    private void updateDate() {

    }
}