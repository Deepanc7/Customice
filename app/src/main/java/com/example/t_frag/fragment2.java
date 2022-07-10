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
    int total =0,i=50,b=60;
    String result = "2";
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

                result = bundle.getString("bundleKey");

                if(result=="2") {
                    b=60;
                    typeImg.setImageResource(R.drawable.cone_plain);
                }
                else
                {
                    b=30;
                    typeImg.setImageResource(R.drawable.cup_plain);
                }

                Bundle result1 = new Bundle();
                result1.putString("bundleKeyType", result);
                getParentFragmentManager().setFragmentResult("requestKeyType", result1);

            }
        });

        ImageView imgView=(ImageView)view.findViewById(R.id.imageView);
        TextView textview6 = view.findViewById(R.id.total_text_frag2);
        TextView totalFrag2 = view.findViewById(R.id.total_price_frag2);

        ImageView scoop_view = (ImageView)view.findViewById(R.id.flavour_img2);

        ImageButton strawberry = (ImageButton)view.findViewById(R.id.strawberry);
        ImageButton blueberry = (ImageButton)view.findViewById(R.id.blueberry);
        ImageButton choco = (ImageButton)view.findViewById(R.id.chocolate);
        ImageButton vanilla = (ImageButton)view.findViewById(R.id.vanilla);
        ImageButton mango = (ImageButton)view.findViewById(R.id.mango);
        ImageButton mintchoco = (ImageButton)view.findViewById(R.id.mintchoco);
        ImageButton cottoncandy = (ImageButton)view.findViewById(R.id.cottoncandy);
        ImageButton bluemoon = (ImageButton)view.findViewById(R.id.bluemoon);

        cottoncandy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.cottoncandy_scoop);
                i=110;

                textview6.setText("Cotton Candy");
                totalFrag2.setText("Total: Rs." + (b+i));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Cottoncandy");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });
        bluemoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.bluemoon_scoop);
                i=100;
                textview6.setText("Bluemoon");
                totalFrag2.setText("Total: Rs." + (b+i));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Bluemoon");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });
        mintchoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.mintchoco_scoop);
                i=90;
                textview6.setText("Mint Choco-Chip");
                totalFrag2.setText("Total: Rs." + (b+i));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Mintchoco");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.mango_scoop);
                i=70;
                textview6.setText("Mango");
                totalFrag2.setText("Total: Rs." + (b+i));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Mango");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });
        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.strawberry_scoop);
                i=60;
                textview6.setText("Strawberry");
                totalFrag2.setText("Total: Rs." + (b+i));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Strawberry");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

        blueberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.blueberry_scoop);
                i=80;
                textview6.setText("Blueberry");
                totalFrag2.setText("Total: Rs." + (b+i));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Blueberry");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.chocolate_scoop);
                i=70;
                textview6.setText("Chocolate");
                totalFrag2.setText("Total: Rs." + (b+i));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Chocolate");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

        vanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.vanilla_scoop);
                i=50;
                textview6.setText("Vanilla");
                totalFrag2.setText("Total: Rs." + (b+i));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Vanilla");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

    }
}
