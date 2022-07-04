package com.example.t_frag;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Store extends AppCompatActivity {

    private Spinner dynamicSpinner1;
    private Spinner dynamicSpinner2;
    TextView rcv;
    String c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        dynamicSpinner1 = (Spinner) findViewById(R.id.dynamic_spinner1);

        String[] items = new String[]{"1", "2", "3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);

        dynamicSpinner1.setAdapter(adapter);

        dynamicSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        dynamicSpinner2 = (Spinner) findViewById(R.id.dynamic_spinner2);

        String[] items2 = new String[]{"In Store", "Home Delivery"};

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items2);

        dynamicSpinner2.setAdapter(adapter2);

        dynamicSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Log.v("item2", (String) parent.getItemAtPosition(position));
                c = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        Button button = (Button) findViewById(R.id.next_button2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(c=="Home Delivery") {
                    Intent intent = new Intent(Store.this, Delivery.class);
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(Store.this, MainActivity3.class);
                    startActivity(intent);
                }
            }
        });

    }
}