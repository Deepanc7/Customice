package com.example.t_frag;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

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

        ImageButton strawberry = (ImageButton)view.findViewById(R.id.berry);
        ImageButton current = (ImageButton)view.findViewById(R.id.current);
        ImageButton choco = (ImageButton)view.findViewById(R.id.chocolate);
        ImageButton vanilla = (ImageButton)view.findViewById(R.id.vanilla);

        TextView textview2 = view.findViewById(R.id.textView2);

        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText("Strawberry");
            }
        });

        current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText("Black Current");
            }
        });

        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText("Chocolate");
            }
        });

        vanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText("Vanilla");
            }
        });

    }
}
