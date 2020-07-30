package com.example.arouterdemo;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.github.mzule.activityrouter.annotation.Router;

public class DownLoadService {

    @Router(value = "download")
    public static final void downloadHeader(final Context context, Bundle bundle){
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(context, "下载头像成功", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
