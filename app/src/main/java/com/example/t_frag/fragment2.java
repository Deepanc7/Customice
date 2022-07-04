package com.example.t_frag;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        getParentFragmentManager().setFragmentResultListener("requestKey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                // We use a String here, but any type that can be put in a Bundle is supported
                ImageView typeImg = (ImageView)view.findViewById(R.id.imageView3);

                String result = bundle.getString("bundleKey");

                if(result=="2") {
                    typeImg.setImageResource(R.drawable.cone_plain);
                }
                else
                {
                    typeImg.setImageResource(R.drawable.cup_plain);
                }
                Bundle result1 = new Bundle();
                result1.putString("bundleKeyType", result);
                getParentFragmentManager().setFragmentResult("requestKeyType", result1);

            }
        });

        ImageView imgView=(ImageView)view.findViewById(R.id.imageView);
        TextView textview6 = view.findViewById(R.id.textView6);

        ImageView scoop_view = (ImageView)view.findViewById(R.id.flavour_img2);

        ImageButton strawberry = (ImageButton)view.findViewById(R.id.berry);
        ImageButton current = (ImageButton)view.findViewById(R.id.current);
        ImageButton choco = (ImageButton)view.findViewById(R.id.chocolate);
        ImageButton vanilla = (ImageButton)view.findViewById(R.id.vanilla);




        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.berry_scoop);
                textview6.setText("Flavor: Strawberry");
                String ch="Strawberry";
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Strawberry");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

        current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.current_scoop);
                textview6.setText("Flavor: Black Current");
                String ch="BlackCurrent";
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "BlackCurrent");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.chocolate_scoop);
                textview6.setText("Flavor: Chocolate");
                String ch="Chocolate";
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Chocolate");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

        vanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.vanilla_scoop);
                textview6.setText("Flavor: Vanilla");
                String ch="Vanilla";
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Vanilla");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

    }
}
