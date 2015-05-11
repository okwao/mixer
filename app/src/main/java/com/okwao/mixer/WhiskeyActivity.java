package com.okwao.mixer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by eit on 4/29/15.
 */
public class WhiskeyActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whiskey_layout);
    }
    public void whiskeybutton(View view) {
        Intent whiskey = new Intent(WhiskeyActivity.this, WhiskeyTypeActivity.class);
        startActivity(whiskey);
    }

}
