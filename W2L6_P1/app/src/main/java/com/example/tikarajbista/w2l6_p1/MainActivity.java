package com.example.tikarajbista.w2l6_p1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();

        // Tab implementation
        ActionBar aBar = getSupportActionBar();
        aBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.TabListener listener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                if(tab.getPosition() == 0){
                    transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment, new HomeFragment());
                    transaction.commit();
                }
                else if ( tab.getPosition() == 1){
                    transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment, new AboutmeFragment());
                    transaction.commit();
                }
                else if( tab.getPosition() == 2){
                    transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment, new ExperienceFragment());
                    transaction.commit();
                }
                else if ( tab.getPosition() == 3){
                    transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment, new ContactFragment());
                    transaction.commit();
                }
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }
        };
        aBar.addTab(aBar.newTab().setText("HOME").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("ABOUT ME").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("EXPERIENCE").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("CONTACT").setTabListener(listener));

    }


}
