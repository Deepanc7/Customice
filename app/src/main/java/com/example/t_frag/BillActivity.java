package com.example.t_frag;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class BillActivity extends AppCompatActivity {

    String a,b,name,t;
    TextView rcv,rcv1,address,icecream,price;
    private static final int PERMISSION_REQUEST_CODE = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        Bundle bundle=getIntent().getBundleExtra("a");
        a=bundle.getString("data");
        b=bundle.getString("data1");
        rcv = (TextView) findViewById(R.id.textView8);
        rcv1 = (TextView) findViewById(R.id.textView2);
        rcv.setText(a);
        rcv1.setText(b);
        SharedPreferences sharedPref = getSharedPreferences("preferences",0);
        String s1 = sharedPref.getString("icecream","");
        int a = sharedPref.getInt("total", 0);

        icecream = (TextView) findViewById(R.id.textView34);
        price = (TextView) findViewById(R.id.textView35);
// We can then use the data
        icecream.setText(s1);
        price.setText(String.valueOf(a));

    }
}