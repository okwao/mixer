package com.okwao.mixer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

/**
 * Created by eit on 4/29/15.
 */
public class BrandyActivity extends Activity{
    GridView gv;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brandy_layout);
    }

    public void brandybutton(View view) {
        Intent brandy = new Intent(BrandyActivity.this, BrandyTypeActivity.class);
        startActivity(brandy);
    }
}
