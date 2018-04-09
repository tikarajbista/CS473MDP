package com.example.tikarajbista.w1l4;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = getListView();
        String[] food = getResources().getStringArray(R.array.foods);
       listView.setAdapter(new ArrayAdapter<Food>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, Food.food));

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent = new Intent(getApplicationContext(), FoodDetail.class);
               intent.putExtra(FoodDetail.Extra_FoodNo,  (int) id);
               startActivity(intent);
           }
       });
    }
}
