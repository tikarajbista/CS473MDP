package com.example.tikarajbista.customizedlistview;

import android.content.DialogInterface;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    static MainActivity mainActivity;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity = this;
       listView = (ListView) findViewById(R.id.list_item);
       listView.setAdapter(new MyAdapter());

        ActionBar aBar = getSupportActionBar();
        aBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.TabListener listener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

                if (tab.getPosition() == 0)
                    Toast.makeText(getApplicationContext(), tab.getText(), Toast.LENGTH_SHORT).show();

                if(tab.getPosition() == 0){
                    alert();
                }

            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }
        };
        aBar.addTab(aBar.newTab().setText("Electronics").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("Clothing").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("Beauty").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("Food").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("Logout").setTabListener(listener));






    }
    public void refresh(){
        listView.setAdapter(new MyAdapter());
    }

    public void alert(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit");
        builder.setMessage("Do you want to Exit");


        AlertDialog.OnClickListener listner = new AlertDialog.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(which == dialog.BUTTON_POSITIVE){
                    dialog.dismiss();
                    finish();
                }
                else
                    dialog.dismiss();
            }
        };

        builder.setPositiveButton("Yes", listner);
        builder.setNegativeButton("No", listner);
        builder.show();

    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }*/

}
