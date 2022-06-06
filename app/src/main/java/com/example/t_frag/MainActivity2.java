package com.example.t_frag;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    Button next_btn;
    String data;
    TextView rcv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        next_btn = (Button) findViewById(R.id.next_button);

        next_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),Frag.class);
                startActivity(intent);
            }
        });
        //data=MainActivity3.getActivityInstance().getData();

        //rcv = (TextView) findViewById(R.id.textView5);
        //Intent intent = getIntent();
        //String str = intent.getStringExtra("data");
        //rcv.setText("Welcome to ", TextView.BufferType.valueOf(str));

    }
    }
