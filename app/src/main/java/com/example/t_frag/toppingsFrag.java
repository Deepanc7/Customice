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

public class toppingsFrag extends Fragment {

    Button next_btn;
    int flavorPrice =50, toppingPrice =0, basePrice = 60;

    String iceName ="";
    String flavor = " vanilla";
    String topping = " ";
    String base = " cone";
    String resultFlavour;
    String result1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View frag = inflater.inflate(R.layout.fragment_toppingsfrag, container, false);
        return frag;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getParentFragmentManager().setFragmentResultListener("requestKeyFlavour", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKeyFlavor, @NonNull Bundle bundle) {
                ImageView FlavourImg = (ImageView) view.findViewById(R.id.flavour_img);
                resultFlavour = bundle.getString("bundleKeyFlavour");
                TextView textview3 = view.findViewById(R.id.textView3);

                switch (resultFlavour) {

                    case "Strawberry":
                        FlavourImg.setImageResource(R.drawable.strawberry_scoop);
                        flavorPrice =60;
                        flavor =" strawberry";

                        textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                        break;
                    case "Blueberry":
                        FlavourImg.setImageResource(R.drawable.blueberry_scoop);
                        flavorPrice =80;
                        flavor =" black current";

                        textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                        break;
                    case "Chocolate":
                        FlavourImg.setImageResource(R.drawable.chocolate_scoop);
                        flavorPrice =70;
                        flavor =" chocolate";
                        textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                        break;
                    case "Vanilla":
                        FlavourImg.setImageResource(R.drawable.vanilla_scoop);
                        flavorPrice =50;
                        flavor =" vanilla";
                        textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                        break;
                    case "Mango":
                        FlavourImg.setImageResource(R.drawable.mango_scoop);
                        flavorPrice =70;
                        flavor =" mango";
                        textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                        break;
                    case "Bluemoon":
                        FlavourImg.setImageResource(R.drawable.bluemoon_scoop);
                        flavorPrice =100;
                        flavor =" bluemoon";
                        textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                        break;
                    case "Cottoncandy":
                        FlavourImg.setImageResource(R.drawable.cottoncandy_scoop);
                        flavor =" cottoncandy";
                        flavorPrice =110;
                        textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                        break;
                    case "Mintchoco":
                        FlavourImg.setImageResource(R.drawable.mintchoco_scoop);
                        flavor ="mintchoco";
                        flavorPrice =90;
                        textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                        break;
                    default:
                        flavorPrice =50;
                        textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                        break;

                }
            }
        });


        getParentFragmentManager().setFragmentResultListener("requestKeyType", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKeyType, @NonNull Bundle bundle) {
                // We use topping String here, but any type that can be put in topping Bundle is supported
                ImageView typeImg = (ImageView) view.findViewById(R.id.typeimg);

                String baseResult = bundle.getString("bundleKeyType");


                if (baseResult == "cone") {
                    typeImg.setImageResource(R.drawable.cone_plain);

                    basePrice = 60;
                    TextView textview3 = view.findViewById(R.id.textView3);
                    textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                    base =" cone";
                } else {
                    typeImg.setImageResource(R.drawable.cup_plain);
                    basePrice = 30;
                    TextView textview3 = view.findViewById(R.id.textView3);
                    textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                    base =" cup";
                }
            }
        });

        ImageButton sprinkle_btn = (ImageButton) view.findViewById(R.id.sprinkle_img_btn);
        ImageButton choco_chip_btn = (ImageButton) view.findViewById(R.id.choco_chip_img_btn);
        ImageButton coconut = (ImageButton) view.findViewById(R.id.cherry_plus_whipping_cream);
        ImageButton caramel = (ImageButton) view.findViewById(R.id.caramel);
        ImageButton strawberrytopping = (ImageButton) view.findViewById(R.id.strawberry);
        ImageButton chocolatetopping = (ImageButton) view.findViewById(R.id.chocolate);
        ImageButton notopping = (ImageButton) view.findViewById(R.id.no_topping);

        TextView textview3 = view.findViewById(R.id.textView3);
        textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
        TextView textview5 = view.findViewById(R.id.textView5);
        ImageView toppings = (ImageView) view.findViewById(R.id.topping_img);



        chocolatetopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.chocolate_topping);
                toppingPrice =36;
                textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                topping ="Chocolate Sauce";
                textview5.setText(topping);
            }

        });

        strawberrytopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.strawberry_topping);
                toppingPrice =36;
                textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                topping ="Strawberry Sauce";
                textview5.setText(topping);
            }

        });
        caramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.caramel_topping);
                toppingPrice =49;
                textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                topping ="Caramel sauce";
                textview5.setText(topping);
            }

        });
        coconut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.coconut_topping);
                toppingPrice =33;
                textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                topping ="Coconut Shavings";
                textview5.setText(topping);
            }

        });
        sprinkle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.sprinkles_topping);
                toppingPrice =29;
                textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                topping ="Sprinkled";
                textview5.setText(topping);
            }

        });

        choco_chip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.choco_chip_topping);
                toppingPrice =55;
                textview3.setText("Total: Rs."+(flavorPrice + toppingPrice + basePrice));
                topping ="Choco chip";
                textview5.setText(topping);
            }
        });

        notopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppings.setImageResource(R.drawable.empty);
                toppingPrice = 0;
                textview3.setText("Total: Rs."+(flavorPrice + basePrice));
                topping =" ";
                textview5.setText("No Topping Selected");
            }

        });
        Button button = (Button) view.findViewById(R.id.next_button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                SharedPreferences pref = getActivity().getSharedPreferences("preferences",0);
                SharedPreferences.Editor editor = pref.edit();
                iceName = topping +" "+ flavor +" "+ base;
                editor.putString("icecream", iceName);
                editor.putInt("total", (flavorPrice + toppingPrice + basePrice));
                editor.commit();
                Intent intent = new Intent(getActivity(), Store.class);
                startActivity(intent);
            }
        });

    }

}
