package com.example.cjcu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] fruit = {"Apple","Pineapple","Banana","Kiwi","A","B","C","D","E","F","berry","mango","ooo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = (ListView) findViewById(R.id.list);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,fruit);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,list.getItemAtPosition(position).toString() , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
