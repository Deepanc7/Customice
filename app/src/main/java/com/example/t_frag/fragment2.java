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
    int total =0, flavorPrice =50, basePrice =60;
    //String result = "2";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.fragment_fragment2, container, false);
        return fragview;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getParentFragmentManager().setFragmentResultListener("requestKeyBase", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKeyBase, @NonNull Bundle bundle) {
                // We use topping String here, but any type that can be put in topping Bundle is supported
                ImageView typeImg = (ImageView)view.findViewById(R.id.imageView3);

                String baseType = bundle.getString("bundleKeyBase");

                if(baseType == "cone") {
                    typeImg.setImageResource(R.drawable.cone_plain);
                    TextView totalFrag2 = view.findViewById(R.id.total_price_frag2);

                    basePrice =60;
                    totalFrag2.setText("Total: Rs." + (basePrice + flavorPrice));
                }
                else
                {
                    typeImg.setImageResource(R.drawable.cup_plain);
                    basePrice =30;
                    TextView totalFrag2 = view.findViewById(R.id.total_price_frag2);
                    totalFrag2.setText("Total: Rs." + (basePrice + flavorPrice));
                }
                Bundle result1 = new Bundle();
                result1.putString("bundleKeyType", baseType);
                getParentFragmentManager().setFragmentResult("requestKeyType", result1);


            }
        });

        ImageView imgView=(ImageView)view.findViewById(R.id.imageView);
        TextView textview6 = view.findViewById(R.id.total_text_frag2);
        TextView totalFrag2 = view.findViewById(R.id.total_price_frag2);
        totalFrag2.setText("Total: Rs." + (basePrice + 50));

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
                flavorPrice =110;

                textview6.setText("Cotton Candy");
                totalFrag2.setText("Total: Rs." + (basePrice + flavorPrice));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Cottoncandy");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });
        bluemoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.bluemoon_scoop);
                flavorPrice =100;
                textview6.setText("Bluemoon");
                totalFrag2.setText("Total: Rs." + (basePrice + flavorPrice));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Bluemoon");
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });
        mintchoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.mintchoco_scoop);
                flavorPrice =90;
                textview6.setText("Mint Choco-Chip");
                totalFrag2.setText("Total: Rs." + (basePrice + flavorPrice));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Mintchoco");
                result.putInt("firstTwoPrice", (basePrice + flavorPrice));
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.mango_scoop);
                flavorPrice =70;
                textview6.setText("Mango");
                totalFrag2.setText("Total: Rs." + (basePrice + flavorPrice));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Mango");
                result.putInt("firstTwoPrice", (basePrice + flavorPrice));
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });
        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.strawberry_scoop);
                flavorPrice =60;
                textview6.setText("Strawberry");
                totalFrag2.setText("Total: Rs." + (basePrice + flavorPrice));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Strawberry");
                result.putInt("firstTwoPrice", (basePrice + flavorPrice));
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

        blueberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.blueberry_scoop);
                flavorPrice =80;
                textview6.setText("Blueberry");
                totalFrag2.setText("Total: Rs." + (basePrice + flavorPrice));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Blueberry");
                result.putInt("firstTwoPrice", (basePrice + flavorPrice));
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.chocolate_scoop);
                flavorPrice =70;
                textview6.setText("Chocolate");
                totalFrag2.setText("Total: Rs." + (basePrice + flavorPrice));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Chocolate");
                result.putInt("firstTwoPrice", (basePrice + flavorPrice));
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

        vanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoop_view.setImageResource(R.drawable.vanilla_scoop);
                flavorPrice =50;
                textview6.setText("Vanilla");
                totalFrag2.setText("Total: Rs." + (basePrice + flavorPrice));
                Bundle result = new Bundle();
                result.putString("bundleKeyFlavour", "Vanilla");
                result.putInt("firstTwoPrice", (basePrice + flavorPrice));
                getParentFragmentManager().setFragmentResult("requestKeyFlavour", result);
            }
        });

    }
}
