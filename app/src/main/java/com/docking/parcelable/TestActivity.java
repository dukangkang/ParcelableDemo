package com.docking.parcelable;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by docking on 15/9/17.
 */
public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        setContentView(tv);

        Bundle bun = this.getIntent().getExtras();
        InfoEntity mInfoEntity = bun.getParcelable("KEY_PARCEL");
        Log.e("info", "mInfoEntity = " + mInfoEntity.toString());
        tv.setText("传递内容: \n" +  mInfoEntity.toString());
    }
}
