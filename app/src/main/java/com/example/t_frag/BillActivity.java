package com.example.t_frag;
import java.io.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import java.io.File;
import java.util.Date;
import java.io.FileOutputStream;
import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import android.Manifest;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class BillActivity extends AppCompatActivity {

    String a,b,name,t,add;
    Button button;
    TextView rcv,rcv1,address,icecream,price,qty;
    private static final int PERMISSION_REQUEST_CODE = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        button = findViewById(R.id.button2);
        verifyStoragePermission(BillActivity.this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takeScreenShot(getWindow().getDecorView());
            }
        });
        Bundle bundle=getIntent().getBundleExtra("topping");
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
    private void takeScreenShot(View view) {
        Date date = new Date();
        CharSequence format = DateFormat.format("MM-dd-yyyy_hh:mm:ss", date);

        try {
            File mainDir = new File(
                    this.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "FilShare");
            if (!mainDir.exists()) {
                boolean mkdir = mainDir.mkdir();
            }

            String path = mainDir + "/" + "TrendOceans" + "-" + format + ".jpeg";
            view.setDrawingCacheEnabled(true);
            Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
            view.setDrawingCacheEnabled(false);

            File imageFile = new File(path);
            FileOutputStream fileOutputStream = new FileOutputStream(imageFile);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            shareScreenShot(imageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Share ScreenShot
    private void shareScreenShot(File imageFile) {
        //Uri uri = FileProvider.getUriForFile(
                //this,
                //BuildConfig.APPLICATION_ID + "." + getLocalClassName() + ".provider",
                //imageFile);
        Uri uri = FileProvider.getUriForFile(Objects.requireNonNull(getApplicationContext()),
                BuildConfig.APPLICATION_ID + ".provider", imageFile);

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("image/*");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "Download Application from Instagram");
        intent.putExtra(Intent.EXTRA_STREAM, uri);

        try {
            this.startActivity(Intent.createChooser(intent, "Share With"));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No App Available", Toast.LENGTH_SHORT).show();
        }
    }

    //Permissions Check

    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static final String[] PERMISSION_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
    };

    public static void verifyStoragePermission(Activity activity) {
        int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSION_STORAGE,
                    REQUEST_EXTERNAL_STORAGE);
        }
    }


}