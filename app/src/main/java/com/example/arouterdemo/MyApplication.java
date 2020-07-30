package com.example.arouterdemo;

import android.app.Application;

import com.github.mzule.activityrouter.annotation.Modules;

@Modules({"app","module1"})
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
