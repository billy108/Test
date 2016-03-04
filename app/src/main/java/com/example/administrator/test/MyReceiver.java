package com.example.administrator.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2016/2/2 0002.
 */
public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "MyReceiver" ;

    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getStringExtra("msg");
        Log.i(TAG, msg);
    }
}
