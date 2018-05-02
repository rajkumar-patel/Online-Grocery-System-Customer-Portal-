package com.huerta.victoria.shoppinglist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {
    //instance methods for the main activity
    ArrayList<String> shoppingList = null;
    ArrayAdapter<String> adapter = null;
    ListView lv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //set new instance of array list
        shoppingList = new ArrayList<>();
        //populate shoppingList
        Collections.addAll(shoppingList, "Fruit", "Meat", "Dairy", "Snacks", "Veggies", "Condiments");
        //adding more elements to the list
      //  shoppingList.addAll(Arrays.asList("Napkins", "Dog food", "Chapstick", "Bread"));
        //also adding single elements to the shopping list
     //   shoppingList.add("Sunscreen");
     //   shoppingList.add("Toothpaste");
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, shoppingList);
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent appinfo = new Intent(MainActivity.this,Condiments.class);
                        startActivity(appinfo);
                        break;
                    case 1:
                        Intent appinfo1 = new Intent(MainActivity.this,Dairy.class);
                        startActivity(appinfo1);
                        break;

                    case 2:
                        Intent appinfo2 = new Intent(MainActivity.this,Fruit.class);
                        startActivity(appinfo2);
                        break;

                    case 3:
                        Intent appinfo3 = new Intent(MainActivity.this,Meat.class);
                        startActivity(appinfo3);
                        break;

                    case 4:
                        Intent appinfo4 = new Intent(MainActivity.this,Snacks.class);
                        startActivity(appinfo4);
                        break;

                    case 5:
                        Intent appinfo5 = new Intent(MainActivity.this,Vegetables.class);
                        startActivity(appinfo5);
                        break;
                        }
            }
        });

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    Intent appinfo = new Intent(MainActivity.this, apple.class);
                    startActivity(appinfo);
                }
            }
        });
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent appinfo = new Intent(MainActivity.this,apple.class);
            startActivity(appinfo);
            return true;
        }
        if (id == R.id.action_sort) {
            Collections.sort(shoppingList); //sorted the shoppinglist (our array list of elements)
            lv.setAdapter(adapter); //refreshes the screen with the sorted elements


            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
