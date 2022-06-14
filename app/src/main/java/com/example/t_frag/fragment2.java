package com.example.t_frag;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

public class fragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.fragment_fragment2, container, false);
        return fragview;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final String[] a = {new String()};

        getParentFragmentManager().setFragmentResultListener("requestKey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result = bundle.getString("bundleKey");
                if(result=="2") {
                    a[0] ="Cone";
                }
                else
                {
                    a[0] ="Cup";
                }
                TextView textview6 = view.findViewById(R.id.textView6);
                textview6.setText(a[0]);
            }
        });

        ImageView imgView=(ImageView)view.findViewById(R.id.imageView);

        ImageView scoop_view = (ImageView)view.findViewById(R.id.scoop_display);

        ImageButton strawberry = (ImageButton)view.findViewById(R.id.berry);
        ImageButton current = (ImageButton)view.findViewById(R.id.current);
        ImageButton choco = (ImageButton)view.findViewById(R.id.chocolate);
        ImageButton vanilla = (ImageButton)view.findViewById(R.id.vanilla);
        //Button set1=(Button)view.findViewById(R.id.button);

        TextView textview2 = view.findViewById(R.id.textView2);
        //TextView textview6 = view.findViewById(R.id.textView6);

        //textview6.setText(a[0]);

        //set1.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //textview6.setText(a[0]);
            //}
        //});
        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.berry_scoop);
                textview2.setText("Strawberry");
            }
        });

        current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.current_scoop);
                textview2.setText("Black Current");
            }
        });

        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.chocolate_scoop);
                textview2.setText("Chocolate");
            }
        });

        vanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.vanilla_scoop);
                textview2.setText("Vanilla");
            }
        });

    }
}
