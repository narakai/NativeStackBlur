package com.commit451.nativestackblur.sample;

import android.app.Application;

import io.alterac.blurkit.BlurKit;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        BlurKit.init(this);
    }
}
