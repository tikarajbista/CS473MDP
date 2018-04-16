package com.example.tikarajbista.fragment_example;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void galaryClick(){
        View fragmentContainer = findViewById(R.id.frame1);
        if(fragmentContainer != null){
            GalaryFragment galaryFragment = new GalaryFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frame1, galaryFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            ft.commit();
        }
    }


}
