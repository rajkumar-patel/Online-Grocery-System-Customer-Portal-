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

public class Fruit extends AppCompatActivity {

    //new
    //instance methods for the main activity
    ArrayList<String> Fruit = null;
    ArrayAdapter<String> adapter = null;
    ListView lv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        //set new instance of array list
        Fruit = new ArrayList<>();
        //populate shoppingList
        Collections.addAll(Fruit, "Apples", "Strawberries", "Rasberries", "Grapes", "Bananas");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Fruit);
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent appinfo = new Intent(Fruit.this,Apples.class);
                        startActivity(appinfo);
                        break;
                }
            }
        });
    }
}
