package com.example.t_frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton simpleImageButtonCup = (ImageButton)view.findViewById(R.id.imageButton2);
        ImageButton simpleImageButtonCone = (ImageButton)view.findViewById(R.id.imageButton3);
        ImageButton simpleImageButtonCandy = (ImageButton)view.findViewById(R.id.imageButton);
        ImageButton simpleImageButtonParfait = (ImageButton)view.findViewById(R.id.imageButton4);

        TextView textview4 = view.findViewById(R.id.textView4);

        simpleImageButtonCup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview4.setText("Cup");
            }
        });
        simpleImageButtonCone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview4.setText("Cone");
            }
        });
        simpleImageButtonCandy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview4.setText("Candy");
            }
        });
        simpleImageButtonParfait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview4.setText("Parfait");
            }
        });



    }
}
