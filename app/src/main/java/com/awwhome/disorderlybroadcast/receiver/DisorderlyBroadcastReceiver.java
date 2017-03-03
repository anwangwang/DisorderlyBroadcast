package com.awwhome.disorderlybroadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2017/3/3 0003.
 */
public class DisorderlyBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = "DisorderlyBroadcastRece";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: 此方法被执行了");


    }
}
