package com.example.t_frag;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class BillActivity extends AppCompatActivity {

    String a,b;
    TextView rcv,rcv1,address;
    private static final int PERMISSION_REQUEST_CODE = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        Bundle bundle=getIntent().getBundleExtra("a");
        a=bundle.getString("data");
        b=bundle.getString("data1");
        //a = "Test String";
        rcv = (TextView) findViewById(R.id.textView8);
        rcv1 = (TextView) findViewById(R.id.textView2);
        rcv.setText(a);
        rcv1.setText(b);

    }
}