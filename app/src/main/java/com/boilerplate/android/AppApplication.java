package com.boilerplate.android;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // NOTE: Remove comment from line below to enable Fabric/ Crashytics
         Fabric.with(this, new Crashlytics());
    }
}
