package com.example.ankit.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    String[] forLight ={"kingfiher","budwiser"};
    String[] forAmber ={"cocacola","fanta"};
    String[] forBrown ={"thumbsup","dew"};
    Spinner color;
    TextView brand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
        color = (Spinner) findViewById(R.id.color);
        brand = (TextView) findViewById(R.id.brands);
    }

    public void beerSearch(View view) throws Exception {

    String beerType = String.valueOf(color.getSelectedItem());
        String[] beerArray;

        if (beerType.equals("Light")) {
            beerArray = forLight;
        } else if (beerType.equals("Amber")) {
            beerArray=forAmber;
        } else if (beerType.equals("Brown")) {
            beerArray=forBrown;
        } else {
            throw new Exception();
        }

        brand.setText(String.valueOf(beerArray));
    }






}
