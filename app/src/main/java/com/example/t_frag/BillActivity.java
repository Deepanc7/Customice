package com.example.t_frag;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class BillActivity extends AppCompatActivity {

    String a;
    TextView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        Bundle bundle=getIntent().getBundleExtra("a");
        a=bundle.getString("data");
        rcv = (TextView) findViewById(R.id.textView);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                rcv.setText("Table No:"+a);
            }
        },800);
    }
}