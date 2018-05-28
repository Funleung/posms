package com.example.johnleung.posms;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Toast;

/**
 * Created by johnleung on 15/5/2018.
 */

public class Drink extends AppCompatActivity{

    private static final String TAG = "junk";
    private static final String CLICK = "clicks";

    private static Toast toast;
    private static Context context;

    private static float price = 0.00f;
    private static String priceAmt = "";

    private static int count1 = 0;
    private static int count2 = 0;
    private static int count3 = 0;
    private static int count4 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        context = this;

        setContentView(R.layout.pg_drink);


    }

}
