package com.awwhome.disorderlybroadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2017/3/3 0003.
 */
public class ReceiverCustomBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = "ReceiverCustomBroadcast";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: 当接收到我们自定义的广播时，此方法被执行了");

        String broadcast = intent.getStringExtra("name");

        Log.d(TAG, "onReceive: broadcast:" + broadcast);

    }
}
