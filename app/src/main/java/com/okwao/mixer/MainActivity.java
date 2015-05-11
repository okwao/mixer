package com.okwao.mixer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class MainActivity extends ActionBarActivity {

    GridView gv;
    Context context;
    public static String[] mixerList = {"Brandy Cocktails", "Whiskey Cocktails", "Tequila Cocktails", "Gin Cocktails", "Rum Cocktails", "Non-Alcoholic Cocktails"};
    public static int[] mixerIcons = {R.drawable.brandy, R.drawable.whiskey, R.drawable.tequila, R.drawable.gin, R.drawable.rum, R.drawable.nonalcoholic};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv = (GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new MyAdapter(this, mixerList, mixerIcons));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                switch (position) {
                    case 0:
                        //intent for brandy cocktail page
                        Intent brandyCocktail = new Intent(getApplicationContext(),BrandyActivity.class);
                        startActivity(brandyCocktail);
                        break;

                    case 1:
                        //intent for whiskey cocktail page
                        Intent whiskeyCocktail = new Intent(getApplicationContext(),WhiskeyActivity.class);
                        startActivity(whiskeyCocktail);
                        break;

                    case 2:
                        //intent for tequila cocktail page
                        Intent tequilaCocktail = new Intent(getApplicationContext(),TequilaActivity.class);
                        startActivity(tequilaCocktail);
                        break;

                    case 3:
                        //intent for gin page
                        Intent ginCocktail = new Intent(getApplicationContext(),GinActivity.class);
                        startActivity(ginCocktail);
                        break;

                    case 4:
                        //intent for rum page
                        Intent rumCocktail = new Intent(getApplicationContext(),RumActivity.class);
                        startActivity(rumCocktail);
                        break;

                    case 5:
                        //intent for non alcoholic pge
                        Intent nonalcoholicCocktail = new Intent(getApplicationContext(),NonalcoholicActivity.class);
                        startActivity(nonalcoholicCocktail);
                        break;


                    default:
                        break;
                }
            }
        });

    }
}
