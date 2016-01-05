package com.docking.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ParcelableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        init();
    }

    private void init() {
        this.findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity();
            }
        });
    }

    private void startActivity() {
        int age = 10;
        long time = System.currentTimeMillis();
        String name = "hello";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(""+i);
        }

        TestObj mTestObj = new TestObj();
        mTestObj.setObjInt(33);
        mTestObj.setObjStr("testObj");

        TestB mTestB = new TestB();
        mTestB.setNum(50);
        mTestB.setAddress("www.baidu.com");

        InfoEntity mInfoEntity = new InfoEntity();
        mInfoEntity.setAge(age);
        mInfoEntity.setTime(time);
        mInfoEntity.setName(name);
        mInfoEntity.setInfo(list);
        mInfoEntity.setTestObj(mTestObj);
        mInfoEntity.setTestB(mTestB);

        Intent intent = new Intent(this, TestActivity.class);
        Bundle bun = new Bundle();
        bun.putParcelable("KEY_PARCEL", mInfoEntity);
        intent.putExtras(bun);
        startActivity(intent);

    }


}

