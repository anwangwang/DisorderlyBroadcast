package com.awwhome.disorderlybroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcast(View view) {

        Log.d(TAG, "sendBroadcast: 发送了一条无序广播");

        Intent intent = new Intent();
        intent.setAction("com.awwhome.custombroadcast");
        intent.putExtra("name", "新闻联播在晚上七点钟准时开整！！！");

        sendBroadcast(intent);

    }
}
