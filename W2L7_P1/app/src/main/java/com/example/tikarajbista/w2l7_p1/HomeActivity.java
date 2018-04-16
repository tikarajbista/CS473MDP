package com.example.tikarajbista.w2l7_p1;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ActionBar aBar = getSupportActionBar();
        aBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.TabListener tabListener = new ActionBar.TabListener(){

            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {



                if(tab.getPosition() == 1){
                    Intent intent = new Intent(getApplicationContext(), MovieList.class);
                    startActivity(intent);
                }
                if(tab.getPosition() == 2){
                    Intent intent = new Intent(getApplicationContext(), ShoppoingList.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
                if(tab.getPosition() == 0){
                    Intent intent = new Intent(getApplicationContext(), PersonalActivity.class);
                    startActivity(intent);
                }
            }
        };
        aBar.addTab(aBar.newTab().setText("Personal Site").setTabListener(tabListener));
        aBar.addTab(aBar.newTab().setText("Movies").setTabListener(tabListener));
        aBar.addTab(aBar.newTab().setText("Shopping").setTabListener(tabListener));
    }
}
