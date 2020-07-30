package com.example.arouterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.mzule.activityrouter.annotation.Router;
import com.github.mzule.activityrouter.router.Routers;

@Router(value = "mainactivity", intParams = {"aa"}, stringParams = {"bb"}, transfer = "aa=>cc")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void jumpModule(View view) {
//        Uri uri = Uri.parse("axx://module/main/222?age=10&name=wang&sex=男&score=99");
//        Routers.open(this,uri);
        Routers.open(this,"abc://module/main/222?age=10&name=wang&sex=男&score=99");
    }

    public void jumpModuleHost(View view) {
        Routers.open(this,"qwetwq://aaa/module/main/222?age=10&name=wang&sex=男&score=99");
    }

    public void jumpHttpModule(View view) {
        Routers.open(this,"https://module/http");
    }
}
