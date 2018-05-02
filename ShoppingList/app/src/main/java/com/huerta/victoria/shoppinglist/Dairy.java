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

public class Dairy extends AppCompatActivity {

    //new
    //instance methods for the main activity
    ArrayList<String> Dairy = null;
    ArrayAdapter<String> adapter = null;
    ListView lv = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        //set new instance of array list
        Dairy = new ArrayList<>();
        //populate shoppingList
        Collections.addAll(Dairy, "Butter", "Cheese", "Milk", "Yogurt", "Ice-Cream");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Dairy);
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent appinfo = new Intent(Dairy.this,Butter.class);
                        startActivity(appinfo);
                        break;
                    case 1:
                        Intent appinfo1 = new Intent(Dairy.this,Cheese.class);
                        startActivity(appinfo1);
                        break;
                    case 2:
                        Intent appinfo2 = new Intent(Dairy.this,Milk.class);
                        startActivity(appinfo2);
                        break;


                    case 3:
                        Intent appinfo3 = new Intent(Dairy.this,Yogurt.class);
                        startActivity(appinfo3);
                        break;
                    case 4:
                        Intent appinfo4 = new Intent(Dairy.this,IceCream.class);
                        startActivity(appinfo4);
                        break;



                }
            }
        });


    }
}
