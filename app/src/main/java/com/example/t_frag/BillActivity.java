package com.example.t_frag;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class BillActivity extends AppCompatActivity {

    String a,b,name,t,add;
    TextView rcv,rcv1,address,icecream,price,qty;
    private static final int PERMISSION_REQUEST_CODE = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        Bundle bundle=getIntent().getBundleExtra("a");
        a=bundle.getString("data");
        b=bundle.getString("data1");
        add=bundle.getString("data2");
        rcv = (TextView) findViewById(R.id.textView8);
        rcv1 = (TextView) findViewById(R.id.textView2);
        address = (TextView) findViewById(R.id.textView52);
        address.setText(add);
        rcv.setText(a);
        rcv1.setText(b);
        SharedPreferences sharedPref = getSharedPreferences("preferences",0);
        String s1 = sharedPref.getString("icecream","");
        int a = sharedPref.getInt("total", 0);
        int c = sharedPref.getInt("quantity", 0);

        float t1=c*a;
        qty = (TextView) findViewById(R.id.textView36);
        qty.setText(String.valueOf(c));
        icecream = (TextView) findViewById(R.id.textView34);
        price = (TextView) findViewById(R.id.textView35);
        icecream.setText(s1);
        price.setText(String.valueOf(t1));


    }
}