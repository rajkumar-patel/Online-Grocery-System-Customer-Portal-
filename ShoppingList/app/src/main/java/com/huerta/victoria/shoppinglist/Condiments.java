package com.huerta.victoria.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class Condiments extends AppCompatActivity {

    //new
    //instance methods for the main activity
    ArrayList<String> Condiments = null;
    ArrayAdapter<String> adapter = null;
    ListView lv = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condiments);

            //set new instance of array list
            Condiments = new ArrayList<>();
            //populate shoppingList
            Collections.addAll(Condiments, "Ketchup", "Relish", "Mustard", "Mayonnaise");

            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Condiments);
            lv = (ListView) findViewById(R.id.listView);
            lv.setAdapter(adapter);


            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            Intent appinfo = new Intent(Condiments.this,Ketchup.class);
                            startActivity(appinfo);
                            break;
                        case 1:
                            Intent appinfo1 = new Intent(Condiments.this,Relish.class);
                            startActivity(appinfo1);
                            break;
                        case 2:
                            Intent appinfo2 = new Intent(Condiments.this,Mustard.class);
                            startActivity(appinfo2);
                            break;

                        case 3:
                            Intent appinfo3 = new Intent(Condiments.this,Mayonnaise.class);
                            startActivity(appinfo3);
                            break;
                    }
                }
            });



    }
}
