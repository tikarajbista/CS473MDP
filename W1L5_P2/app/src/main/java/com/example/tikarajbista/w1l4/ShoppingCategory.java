package com.example.tikarajbista.w1l4;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ShoppingCategory extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_activity);

        Intent intent = getIntent();
        String user = intent.getStringExtra("user");
        TextView userName = (TextView) findViewById(R.id.userName);
        userName.setText("Welcome " + user);

        ActionBar aBar = getSupportActionBar();
        aBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.TabListener listener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                if(tab.getPosition() == 1){
                    onClickCloth(null);
                }
                if(tab.getPosition() == 2){
                    onClickBeauty(null);
                }
                if(tab.getPosition() == 3){
                    onClickFood(null);
                }

                if(tab.getPosition() == 4){
                    alert();
                }

            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
                if (tab.getPosition() == 0){
                    onClickElectronics(null);
                }
            }
        };
        aBar.addTab(aBar.newTab().setText("Electronics").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("Clothing").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("Beauty").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("Food").setTabListener(listener));
        aBar.addTab(aBar.newTab().setText("Logout").setTabListener(listener));
    }

    /*public void toastMessage(View view){
        Context context = getApplicationContext();
        CharSequence text = "You have chosen\n" +
                "the Clothing category of shopping";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }*/
    // Method to handle Clothing Button
    public void onClickCloth(View voew){
        Intent intent = new Intent(this, ClothingActivity.class);
        startActivity(intent);
    }

    public void onClickBeauty(View view){
        Intent intent = new Intent(this, BeautyActivity.class);
        startActivity(intent);
    }

    // Method to handle Food Button
    public void onClickFood(View view){
        Intent intent = new Intent(this, FoodActivity.class);
        startActivity(intent);
    }

    // Method to handle Food Button
    public void onClickElectronics(View view){
        Intent intent = new Intent(this, ElectronicsActivity.class);
        startActivity(intent);
    }

    // Method to alert Logout dialougbox
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
}
