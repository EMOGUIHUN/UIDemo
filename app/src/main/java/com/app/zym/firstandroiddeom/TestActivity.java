package com.app.zym.firstandroiddeom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/11/28.
 */

public class TestActivity extends AppCompatActivity {

    private TextView tvReturn;
    private final String TAG = "mDemo";

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        Log.i(TAG, "onCreate Activity创建.");
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test);
//
//        tvReturn = (TextView) findViewById(R.id.tv_return);
//        tvReturn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TestActivity.this.finish();
//            }
//        });
//    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart Activity创建或者从后台重新回到前台");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume Activity创建或者从被覆盖、后台重新回到前台时被调用");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause Activity被覆盖到下面或者锁屏时被调用");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop 退出当前Activity或者跳转到新Activity时被调用");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart Activity从后台重新回到前台时被调用");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy 退出当前Activity时被调用,调用之后Activity就结束了");
    }
}
