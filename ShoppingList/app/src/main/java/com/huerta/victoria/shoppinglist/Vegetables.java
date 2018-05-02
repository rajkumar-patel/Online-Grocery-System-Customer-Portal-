package com.huerta.victoria.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class Vegetables extends AppCompatActivity {
    //new
    //instance methods for the main activity
    ArrayList<String> Vegetables = null;
    ArrayAdapter<String> adapter = null;
    ListView lv = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);


        //set new instance of array list
        Vegetables = new ArrayList<>();
        //populate shoppingList
        Collections.addAll(Vegetables, "Broccoli", "Lettuce", "Bell Pepper", "Cucumber", "Carrots");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Vegetables);
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent appinfo = new Intent(Vegetables.this,Broccoli.class);
                        startActivity(appinfo);
                        break;

                    case 1:
                        Intent appinfo1 = new Intent(Vegetables.this,Lettuce.class);
                        startActivity(appinfo1);
                        break;


                    case 2:
                        Intent appinfo2 = new Intent(Vegetables.this,BellPepper.class);
                        startActivity(appinfo2);
                        break;


                    case 3:
                        Intent appinfo3 = new Intent(Vegetables.this,Cucumber.class);
                        startActivity(appinfo3);
                        break;


                    case 4:
                        Intent appinfo4 = new Intent(Vegetables.this,Carrots.class);
                        startActivity(appinfo4);
                        break;


                }
            }
        });



    }
}
