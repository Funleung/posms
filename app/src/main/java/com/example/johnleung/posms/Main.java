package com.example.johnleung.posms;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    private static final String TAG = "junk";
    private static final String CLICK = "clicks";

    private static Toast toast;
    private static Context context;

    private static float price = 0.00f;
    private static String priceAmt = "";

    private static String countAmt = "";

    private static int count1 = 0;
    private static int count2 = 0;
    private static int count3 = 0;
    private static int count4 = 0;

    private static int countD1 = 0;
    private static int countD2 = 0;
    private static int countD3 = 0;
    private static int countD4 = 0;

    private static float common_qty = 1.0f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        context = this;

        setContentView(R.layout.item_latest);

//        setContentView(R.layout.pg_latest);

//        setContentView(R.layout.pg_drink);

/**/


        //Drink scView Elements

        Button drinkIns1 = findViewById(R.id.btnInsD1);
        Button drinkIns2 = findViewById(R.id.btnInsD2);
        Button drinkIns3 = findViewById(R.id.btnInsD3);
        Button drinkIns4 = findViewById(R.id.btnInsD4);

        Button drinkMin1 = findViewById(R.id.btnMinD1);
        Button drinkMin2 = findViewById(R.id.btnMinD2);
        Button drinkMin3 = findViewById(R.id.btnMinD3);
        Button drinkMin4 = findViewById(R.id.btnMinD4);

        final TextView qtyD1 = findViewById(R.id.tvQtyD1);
        final TextView qtyD2 = findViewById(R.id.tvQtyD2);
        final TextView qtyD3 = findViewById(R.id.tvQtyD3);
        final TextView qtyD4 = findViewById(R.id.tvQtyD4);

        final CheckBox cbCoffeeHot = findViewById(R.id.cbCoffeeHot);
        final CheckBox cbBCoffeeHot = findViewById(R.id.cbBCoffeeHot);
        final CheckBox cbMilkTeaHot = findViewById(R.id.cbMilkTeaHot);
        final CheckBox cbMilkCoffeeHot = findViewById(R.id.cbMilkCoffeeHot);

        final CheckBox cbCoffeeCold = findViewById(R.id.cbCoffeeCold);
        final CheckBox cbBCoffeeCold = findViewById(R.id.cbBCoffeeCold);
        final CheckBox cbMilkTeaCold = findViewById(R.id.cbMilkTeaCold);
        final CheckBox cbMilkCoffeeCold = findViewById(R.id.cbMilkCoffeeCold);

        final TextView qtyCoffeeHot = findViewById(R.id.qtyCoffeeHot);
        final TextView qtyBCoffeeHot = findViewById(R.id.qtyBCoffeeHot);
        final TextView qtyMilkTeaHot = findViewById(R.id.qtyMilkTeaHot);
        final TextView qtyMilkCoffeeHot = findViewById(R.id.qtyMilkCoffeeHot);

        final TextView qtyCoffeeCold = findViewById(R.id.qtyCoffeeCold);
        final TextView qtyBCoffeeCold = findViewById(R.id.qtyBCoffeeCold);
        final TextView qtyMilkTeaCold = findViewById(R.id.qtyMilkTeaCold);
        final TextView qtyMilkCoffeeCold = findViewById(R.id.qtyMilkCoffeeCold);

        //----------------------------------------//
/**/
        Button btnDrink = findViewById(R.id.btnDrink);
        Button btnLatest = findViewById(R.id.btnLatest);

        Button itemIns1 = findViewById(R.id.btnInsL1);
        Button itemIns2 = findViewById(R.id.btnInsL2);
        Button itemIns3 = findViewById(R.id.btnInsL3);
        Button itemIns4 = findViewById(R.id.btnInsL4);

        Button itemMin1 = findViewById(R.id.btnMinL1);
        Button itemMin2 = findViewById(R.id.btnMinL2);
        Button itemMin3 = findViewById(R.id.btnMinL3);
        Button itemMin4 = findViewById(R.id.btnMinL4);

        FloatingActionButton fabCart = findViewById(R.id.fabCart);

        final ScrollView latest = findViewById(R.id.scViewLatest);
        final ScrollView drink = findViewById(R.id.scViewDrink);


        latest.setVisibility(View.VISIBLE);
        drink.setVisibility(View.GONE);

//        Button cart = findViewById(R.id.btnCart);

        final TextView tPrice = findViewById(R.id.txtPrice);

        btnDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drink.setVisibility(View.VISIBLE);
                latest.setVisibility(View.GONE);
//                food.setVisibility(View.INVISIBLE);
            }
        });

        btnLatest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drink.setVisibility(View.GONE);
                latest.setVisibility(View.VISIBLE);
//                food.setVisibility(View.INVISIBLE);

                Log.i(CLICK,"You Clicked \"Latest Item\"");

            }
        });

        itemIns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //12
                price += 12;
                setPrice(price, tPrice);
                count1++;

            }
        });

        itemIns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //15
                price += 15;
                setPrice(price, tPrice);
                count2++;

            }
        });

        itemIns3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //18
                price += 18;
                setPrice(price, tPrice);
                count3++;

            }
        });

        itemIns4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //20
                price += 20;
                setPrice(price, tPrice);
                count4++;

            }
        });

        itemMin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //12
                if(price!=0 && count1!=0) {
                    price -= 12;
                    setPrice(price, tPrice);
                    count1--;
                }
            }
        });

        itemMin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //15
                if(price!=0 && count2!=0) {
                    price -= 15;
                    setPrice(price, tPrice);
                    count2--;
                }

            }
        });

        itemMin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //18
            if(price!=0 && count3!=0) {
                price -= 18;
                setPrice(price, tPrice);
                count3--;
            }

            }
        });

        itemMin4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //20
                if(price!=0 && count4!=0) {
                    price -= 20;
                    setPrice(price, tPrice);
                    count4--;
                }

            }
        });

        fabCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                makeTextAndShow(context, "test", 1000);
            }
        });

/**/
        drinkIns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countD1++;

                qtyD1.setText(String.valueOf(countD1));

                cbCoffeeHot.setVisibility(View.VISIBLE);
                cbCoffeeCold.setVisibility(View.VISIBLE);

                if(countD1>=2){
                    qtyCoffeeHot.setVisibility(View.VISIBLE);
                    qtyCoffeeCold.setVisibility(View.VISIBLE);

                }

            }

        });

        cbCoffeeHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countD1 == 1 && cbCoffeeHot.isChecked()) {
                    cbCoffeeCold.setEnabled(false);
                    price+=12;
                    setPrice(price, tPrice);
                }
                else {
                    cbCoffeeCold.setEnabled(true);
                    price-=12;
                }
            }
        });

        cbCoffeeCold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(countD1==1 && cbCoffeeCold.isChecked()){
                    cbCoffeeHot.setEnabled(false);
                    price+=14;
                }

                else {
                    cbCoffeeHot.setEnabled(true);
                    price-=14;
                }
            }
        });



        drinkIns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countD2++;

                qtyD2.setText(String.valueOf(countD2));

                cbBCoffeeHot.setVisibility(View.VISIBLE);
                cbBCoffeeCold.setVisibility(View.VISIBLE);

                if(countD2>=2){
                    qtyBCoffeeHot.setVisibility(View.VISIBLE);
                    qtyBCoffeeCold.setVisibility(View.VISIBLE);
                }

            }
        });

        cbBCoffeeHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(countD2==1 && cbBCoffeeHot.isChecked())
                    cbBCoffeeCold.setEnabled(false);
                else
                    cbBCoffeeCold.setEnabled(true);
            }
        });

        cbBCoffeeCold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(countD2==1 && cbBCoffeeCold.isChecked())
                    cbBCoffeeHot.setEnabled(false);
                else
                    cbBCoffeeHot.setEnabled(true);
            }
        });

        drinkIns3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countD3++;

                qtyD3.setText(String.valueOf(countD3));

                cbMilkTeaHot.setVisibility(View.VISIBLE);
                cbMilkTeaCold.setVisibility(View.VISIBLE);
                if(countD3>=2){
                    qtyMilkTeaHot.setVisibility(View.VISIBLE);
                    qtyMilkTeaCold.setVisibility(View.VISIBLE);
                }
            }
        });

        cbMilkTeaHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(countD3==1 && cbMilkTeaHot.isChecked())
                    cbMilkTeaCold.setEnabled(false);
                else
                    cbMilkTeaCold.setEnabled(true);
            }
        });

        cbMilkTeaCold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(countD3==1 && cbMilkTeaCold.isChecked())
                    cbMilkTeaHot.setEnabled(false);
                else
                    cbMilkTeaHot.setEnabled(true);
            }
        });

        drinkIns4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countD4++;

                qtyD4.setText(String.valueOf(countD4));

                cbMilkCoffeeHot.setVisibility(View.VISIBLE);
                cbMilkCoffeeCold.setVisibility(View.VISIBLE);
                if(countD4>=2){
                    qtyMilkCoffeeHot.setVisibility(View.VISIBLE);
                    qtyMilkCoffeeCold.setVisibility(View.VISIBLE);
                }
            }
        });

        cbMilkCoffeeHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(countD4==1 && cbMilkCoffeeHot.isChecked())
                    cbMilkCoffeeCold.setEnabled(false);
                else
                    cbMilkCoffeeCold.setEnabled(true);
            }
        });

        cbMilkCoffeeCold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(countD4==1 && cbMilkCoffeeCold.isChecked())
                    cbMilkCoffeeHot.setEnabled(false);
                else
                    cbMilkCoffeeHot.setEnabled(true);
            }
        });

        drinkMin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(countD1==0)) {
                    countD1--;

                    qtyD1.setText(String.valueOf(countD1));
                }

                if(countD1==1) {
                    qtyCoffeeHot.setVisibility(View.INVISIBLE);
                    qtyCoffeeCold.setVisibility(View.INVISIBLE);
                }

                if(countD1==0) {
                    cbCoffeeHot.setVisibility(View.INVISIBLE);
                    cbCoffeeCold.setVisibility(View.INVISIBLE);
                    qtyCoffeeHot.setVisibility(View.INVISIBLE);
                    qtyCoffeeCold.setVisibility(View.INVISIBLE);
                }
            }
        });

        drinkMin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(countD2==0)) {
                    countD2--;

                    qtyD2.setText(String.valueOf(countD2));
                }

                if(countD2==1) {
                    qtyBCoffeeHot.setVisibility(View.INVISIBLE);
                    qtyBCoffeeCold.setVisibility(View.INVISIBLE);
                }

                if(countD2==0) {
                    cbBCoffeeHot.setVisibility(View.INVISIBLE);
                    cbBCoffeeCold.setVisibility(View.INVISIBLE);
                    qtyBCoffeeHot.setVisibility(View.INVISIBLE);
                    qtyBCoffeeCold.setVisibility(View.INVISIBLE);
                }
            }
        });

        drinkMin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(countD3==0)) {
                    countD3--;

                    qtyD3.setText(String.valueOf(countD3));
                }

                if(countD3==1) {
                    qtyMilkTeaHot.setVisibility(View.INVISIBLE);
                    qtyMilkTeaCold.setVisibility(View.INVISIBLE);
                }

                if(countD3==0) {
                    cbMilkTeaHot.setVisibility(View.INVISIBLE);
                    cbMilkTeaCold.setVisibility(View.INVISIBLE);
                    qtyMilkTeaHot.setVisibility(View.INVISIBLE);
                    qtyMilkTeaCold.setVisibility(View.INVISIBLE);
                }
            }
        });

        drinkMin4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(countD4==0)) {
                    countD4--;

                    qtyD4.setText(String.valueOf(countD4));
                }

                if(countD4==1) {
                    qtyMilkCoffeeHot.setVisibility(View.INVISIBLE);
                    qtyMilkCoffeeCold.setVisibility(View.INVISIBLE);
                }

                if(countD4==0) {
                    cbMilkCoffeeHot.setVisibility(View.INVISIBLE);
                    cbMilkCoffeeCold.setVisibility(View.INVISIBLE);
                    qtyMilkCoffeeHot.setVisibility(View.INVISIBLE);
                    qtyMilkCoffeeCold.setVisibility(View.INVISIBLE);
                }
            }
        });




/**/



    }

    private void setPrice(float price, TextView tPrice){
        priceAmt = String.valueOf(price);
        tPrice.setText(priceAmt);
    }
/**/
    //}//

    private static void makeTextAndShow(final Context context, final String text, final int duration) {
        if (toast == null) {

            toast = android.widget.Toast.makeText(context, text, duration);
        } else {
            toast.setText(text);
            toast.setDuration(duration);
        }
        toast.show();
    }

}
