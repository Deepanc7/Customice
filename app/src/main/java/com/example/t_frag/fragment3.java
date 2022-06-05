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

public class fragment3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View frag = inflater.inflate(R.layout.fragment3, container, false);
        return frag;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageButton sprinkle_btn = (ImageButton)view.findViewById(R.id.sprinkle_img_btn);
        ImageButton choco_chip_btn = (ImageButton)view.findViewById(R.id.choco_chip_img_btn);
        TextView textview3 = view.findViewById(R.id.textView3);
        ImageView toppings = (ImageView)view.findViewById(R.id.topping_img);

        sprinkle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.sprinkles);
                textview3.setText("Sprinkles");
            }
        });

        choco_chip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.choco_chip);
                textview3.setText("Choco chips");
            }
        });

    }
}
