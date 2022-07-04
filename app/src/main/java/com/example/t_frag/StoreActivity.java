package com.example.t_frag;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class StoreActivity extends AppCompatActivity {

    Button next_btn;
    private Spinner dynamicSpinner3;
    private Spinner dynamicSpinner4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store2);
        next_btn = (Button) findViewById(R.id.button3);

        next_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),BillActivity.class);
                startActivity(intent);
            }
        });
        dynamicSpinner3 = (Spinner) findViewById(R.id.dynamic_spinner3);

        String[] items = new String[]{"Store 1", "Store 2", "Store 3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);

        dynamicSpinner3.setAdapter(adapter);

        dynamicSpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        dynamicSpinner4 = (Spinner) findViewById(R.id.dynamic_spinner4);

        String[] items1 = new String[]{"Bangalore", "Mangalore", "Mysore"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items1);

        dynamicSpinner4.setAdapter(adapter1);

        dynamicSpinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Log.v("item1", (String) parent.getItemAtPosition(position));

            }

            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

    }
}