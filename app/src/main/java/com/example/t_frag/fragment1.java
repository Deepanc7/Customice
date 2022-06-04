package com.example.t_frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
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
        ImageButton simpleImageButtonCup = (ImageButton)view.findViewById(R.id.cup_button);
        ImageButton simpleImageButtonCandy = (ImageButton)view.findViewById(R.id.cone_button);

        TextView textview4 = view.findViewById(R.id.icecream_type);

        simpleImageButtonCup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview4.setText("Ice-Cream Cup");
            }
        });
        simpleImageButtonCandy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview4.setText("Ice-Cream Cone");
            }
        });

    }
}
