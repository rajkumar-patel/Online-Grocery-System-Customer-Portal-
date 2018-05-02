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

public class Snacks extends AppCompatActivity {
    //new
    //instance methods for the main activity
    ArrayList<String> Snacks = null;
    ArrayAdapter<String> adapter = null;
    ListView lv = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

        //set new instance of array list
        Snacks = new ArrayList<>();
        //populate shoppingList
        Collections.addAll(Snacks, "Doritos", "Oreos", "Granola Bars", "Chex Mix", "Popcorn");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Snacks);
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent appinfo = new Intent(Snacks.this,Doritos.class);
                        startActivity(appinfo);
                        break;
                    case 1:
                        Intent appinfo1 = new Intent(Snacks.this,Oreos.class);
                        startActivity(appinfo1);
                        break;
                    case 2:
                        Intent appinfo2 = new Intent(Snacks.this,GranolaBars.class);
                        startActivity(appinfo2);
                        break;
                    case 3:
                        Intent appinfo3 = new Intent(Snacks.this,ChexMix.class);
                        startActivity(appinfo3);
                        break;
                    case 4:
                        Intent appinfo4 = new Intent(Snacks.this,PopCorn.class);
                        startActivity(appinfo4);
                        break;

                }
            }
        });



    }
}
