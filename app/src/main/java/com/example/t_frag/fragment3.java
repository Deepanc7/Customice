package com.example.t_frag;


import android.content.Intent;
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

public class fragment3 extends Fragment {

    Button next_btn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View frag = inflater.inflate(R.layout.fragment3, container, false);
        return frag;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        final String[] a = {new String()};

        //final String[] a = {new String()};
        getParentFragmentManager().setFragmentResultListener("requestKeyFlavour", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                // We use a String here, but any type that can be put in a Bundle is supported
                ImageView FlavourImg = (ImageView) view.findViewById(R.id.flavour_img);

                //String resultType = bundle.getString("bundleKey");
                String resultFlavour = bundle.getString("bundleKeyFlavour");

                switch (resultFlavour){
                    case "Strawberry": FlavourImg.setImageResource(R.drawable.strawberry_scoop); break;
                    case "Blueberry": FlavourImg.setImageResource(R.drawable.blueberry_scoop); break;
                    case "Chocolate": FlavourImg.setImageResource(R.drawable.chocolate_scoop); break;
                    case "Vanilla": FlavourImg.setImageResource(R.drawable.vanilla_scoop); break;
                    case "Mango": FlavourImg.setImageResource(R.drawable.mango_scoop); break;
                    case "Bluemoon": FlavourImg.setImageResource(R.drawable.bluemoon_scoop); break;
                    case "Cottoncandy": FlavourImg.setImageResource(R.drawable.cottoncandy_scoop); break;
                    case "Mintchoco": FlavourImg.setImageResource(R.drawable.mintchoco_scoop); break;
                }
            }
        });

        getParentFragmentManager().setFragmentResultListener("requestKeyType", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKeyType, @NonNull Bundle bundle) {
                // We use a String here, but any type that can be put in a Bundle is supported
                ImageView typeImg = (ImageView)view.findViewById(R.id.typeimg);

                String result1 = bundle.getString("bundleKeyType");

                if(result1=="2") {
                    typeImg.setImageResource(R.drawable.cone_plain);
                }
                else
                {
                    typeImg.setImageResource(R.drawable.cup_plain);
                }
            }
        });
        ImageButton sprinkle_btn = (ImageButton)view.findViewById(R.id.sprinkle_img_btn);
        ImageButton choco_chip_btn = (ImageButton)view.findViewById(R.id.choco_chip_img_btn);
        TextView textview3 = view.findViewById(R.id.textView3);
        //TextView textview12 = view.findViewById(R.id.textView12);
        ImageView toppings = (ImageView)view.findViewById(R.id.topping_img);

        sprinkle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.sprinkles);
                textview3.setText("Topping: Sprinkles");
            }

        });

        choco_chip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.choco_chip);
                textview3.setText("Topping: Choco Chips");
            }
        });
        Button button = (Button) view.findViewById(R.id.next_button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Store.class);
                startActivity(intent);
            }
        });


    }
}
