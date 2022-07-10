package com.example.t_frag;


import android.content.Intent;
import android.content.SharedPreferences;
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
    int total3=0,j=0;
    int defaultVal = 0;
    String d="";
    String b = " vanilla";
    String a = " ";
    String c= " cone";
    String resultFlavour;
    String result1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View frag = inflater.inflate(R.layout.fragment3, container, false);
        return frag;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getParentFragmentManager().setFragmentResultListener("requestKeyFlavour", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKeyBase, @NonNull Bundle bundle) {
                ImageView FlavourImg = (ImageView) view.findViewById(R.id.flavour_img);
                resultFlavour = bundle.getString("bundleKeyFlavour");

                switch (resultFlavour) {

                    case "Strawberry":
                        FlavourImg.setImageResource(R.drawable.strawberry_scoop);
                        total3+=60;
                        b=" strawberry";
                        break;
                    case "Blueberry":
                        FlavourImg.setImageResource(R.drawable.blueberry_scoop);
                        total3+=80;
                        b=" black current";
                        break;
                    case "Chocolate":
                        FlavourImg.setImageResource(R.drawable.chocolate_scoop);
                        total3+=70;
                        b=" chocolate";
                        break;
                    case "Vanilla":
                        FlavourImg.setImageResource(R.drawable.vanilla_scoop);
                        total3+=50;
                        b=" vanilla";
                        break;
                    case "Mango":
                        FlavourImg.setImageResource(R.drawable.mango_scoop);
                        total3+=70;
                        b=" mango";
                        break;
                    case "Bluemoon":
                        FlavourImg.setImageResource(R.drawable.bluemoon_scoop);
                        total3+=100;
                        b=" bluemoon";
                        break;
                    case "Cottoncandy":
                        FlavourImg.setImageResource(R.drawable.cottoncandy_scoop);
                        b=" cottoncandy";
                        total3+=110;
                        break;
                    case "Mintchoco":
                        FlavourImg.setImageResource(R.drawable.mintchoco_scoop);
                        b="mintchoco";
                        total3+=90;
                        break;
                    default:
                        total3+=50;
                        break;

                }
            }
        });


        getParentFragmentManager().setFragmentResultListener("requestKeyType", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKeyType, @NonNull Bundle bundle) {
                // We use a String here, but any type that can be put in a Bundle is supported
                ImageView typeImg = (ImageView) view.findViewById(R.id.typeimg);
                //String result1 = "2";
                result1 = bundle.getString("bundleKeyType");
                if (result1 == null) {
                    result1 = "2";
                }


                if (result1 == "2") {
                    typeImg.setImageResource(R.drawable.cone_plain);

                    total3+=60;
                    c=" cone";
                } else if(result1 == "1"){
                    typeImg.setImageResource(R.drawable.cup_plain);
                    total3+=30;
                    c=" cup";
                }
            }
        });
        //if (result1 == null) {

           // total3 += 60;
        //}
        //if (resultFlavour == null) {
          //  total3 += 50;
        //}
        ImageButton sprinkle_btn = (ImageButton) view.findViewById(R.id.sprinkle_img_btn);
        ImageButton choco_chip_btn = (ImageButton) view.findViewById(R.id.choco_chip_img_btn);
        ImageButton coconut = (ImageButton) view.findViewById(R.id.cherry_plus_whipping_cream);
        ImageButton caramel = (ImageButton) view.findViewById(R.id.caramel);
        ImageButton strawberrytopping = (ImageButton) view.findViewById(R.id.strawberry);
        ImageButton chocolatetopping = (ImageButton) view.findViewById(R.id.chocolate);
        ImageButton notopping = (ImageButton) view.findViewById(R.id.no_topping);

        TextView textview3 = view.findViewById(R.id.textView3);
        ImageView toppings = (ImageView) view.findViewById(R.id.topping_img);



        chocolatetopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.chocolate_topping);
                j=36;
                textview3.setText("Total: Rs."+(total3+j));
                a="Chocolate Sauce";
            }

        });

        strawberrytopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.strawberry_topping);
                j=36;
                textview3.setText("Total: Rs."+(total3+j));
                a="Strawberry Sauce";
            }

        });
        caramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.caramel_topping);
                j=49;
                textview3.setText("Total: Rs."+(total3+j));
                a="Caramel sauce";
            }

        });
        coconut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.coconut_topping);
                j=33;
                textview3.setText("Total: Rs."+(total3+j));
                a="Coconut Shavings";
            }

        });
        sprinkle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.sprinkles_topping);
                j=29;
                textview3.setText("Total: Rs."+(total3+j));
                a="Sprinkled";
            }

        });

        choco_chip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.choco_chip_topping);
                j=55;
                textview3.setText("Total: Rs."+(total3+j));
                a="Choco chip";
            }
        });

        notopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.empty);
                textview3.setText("Total: Rs."+(total3));
                a=" ";
            }

        });
        Button button = (Button) view.findViewById(R.id.next_button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                SharedPreferences pref = getActivity().getSharedPreferences("preferences",0);
                SharedPreferences.Editor editor = pref.edit();
                d=a+" "+b+" "+c;
                editor.putString("icecream", d);
                editor.putInt("total", (total3+j));
                editor.commit();
                Intent intent = new Intent(getActivity(), Store.class);
                startActivity(intent);
            }
        });

    }

}
