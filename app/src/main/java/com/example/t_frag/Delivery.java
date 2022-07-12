package com.example.t_frag;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Delivery extends AppCompatActivity {

    private Spinner dynamicSpinner3;
    private Spinner dynamicSpinner4;
    EditText e;
    String storeSelector, citySelector;
    String[] items1;

    //String[] items1 = new String[]{"Indiranagar", "Orion Mall", "Kanakapura"};
    String[] items = new String[]{"Bangalore", "Delhi", "Mumbai", "Kolkata"};
    String[] itemsBangalore = new String[]{"Indiranagar", "Orion Mall", "Kanakapura"};
    String[] itemsDelhi = new String[]{"Hauz Khas", "Vasant Vihar", "RK Puram"};
    String[] itemsMumbai = new String[]{"Bandra", "Juhu", "Worli"};
    String[] itemsKolkata = new String[]{"Jadavpur", "Beniapukur", "NewTown"};
    ArrayAdapter<String> adapterBangalore, adapterMumbai, adapterDelhi, adapterKolkata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        dynamicSpinner3 = (Spinner) findViewById(R.id.dynamic_spinner3);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);

        dynamicSpinner3.setAdapter(adapter);

        dynamicSpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                Log.v("item", (String) parent.getItemAtPosition(position));
                citySelector =(String)parent.getItemAtPosition(position);
                if (position == 0) {
                    items1 = new String[]{"Indiranagar", "Orion Mall", "Kanakapura"};

                    dynamicSpinner4.setAdapter(adapterBangalore);
                } else if (position == 1) {
                    items1 = new String[]{"Hauz Khas", "Vasant Vihar", "RK Puram"};
                    dynamicSpinner4.setAdapter(adapterDelhi);
                } else if (position == 2) {
                    items1 = new String[]{"Bandra", "Juhu", "Worli"};
                    dynamicSpinner4.setAdapter(adapterMumbai);
                }else {
                    items1 = new String[]{"Jadavpur", "Beniapukur", "NewTown"};
                    dynamicSpinner4.setAdapter(adapterKolkata);
                }




            }

            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        dynamicSpinner4 = (Spinner) findViewById(R.id.dynamic_spinner4);

        adapterBangalore = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, itemsBangalore);
        adapterDelhi = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, itemsDelhi);
        adapterMumbai = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, itemsMumbai);
        adapterKolkata = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, itemsKolkata);


        dynamicSpinner4.setAdapter(adapterBangalore);

        dynamicSpinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Log.v("item1", (String) parent.getItemAtPosition(position));
                storeSelector =(String)parent.getItemAtPosition(position);

            }

            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        e=(EditText)findViewById(R.id.edit);

        Button button = (Button)findViewById(R.id.next_button3);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String address=e.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("data", citySelector);
                bundle.putString("data1", storeSelector);
                bundle.putString("data2",address);
                Intent it=new Intent(getBaseContext(),BillActivity.class);
                it.putExtra("topping",bundle);
                startActivity(it);
            }
        });

    }
}