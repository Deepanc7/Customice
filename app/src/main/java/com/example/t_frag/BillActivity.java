package com.example.t_frag;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class BillActivity extends AppCompatActivity {

    String a,b;
    TextView rcv,address;
    private static final int PERMISSION_REQUEST_CODE = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        Bundle bundle=getIntent().getBundleExtra("a");
        a=bundle.getString("data");
        Bundle bundle1=getIntent().getBundleExtra("b");
        b=bundle.getString("data1");
        rcv = (TextView) findViewById(R.id.textView8);
        rcv = (TextView) findViewById(R.id.textView14);
        rcv.setText("Table No:"+a);
        address.setText("Address:"+b);
    }
}