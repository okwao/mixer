package com.okwao.mixer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.GridView;

/**
 * Created by eit on 4/29/15.
 */
public class WhiskeyTypeActivity extends Activity{
    GridView gv1;
    Context context;
    public static String[] mixerList = {"Champagne Cocktail", "Brandy Alexander", "Brandy Crusta", "Sidecar", "Between-the-sheets", "Brandy Daisy"};
    public static int[] mixerIcons = {R.drawable.champ, R.drawable.whiskey, R.drawable.tequila, R.drawable.gin, R.drawable.rum, R.drawable.nonalcoholic};
    //    public static String[] mixerDetails = {"Cognac Bitters, Sugar Cube(White), Champagne, Orange"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whiskeytype_layout);
        gv1 = (GridView) findViewById(R.id.gridView1);
        gv1.setAdapter((android.widget.ListAdapter) new WhiskeyAdapter(this, mixerList, mixerIcons));

    }
}
