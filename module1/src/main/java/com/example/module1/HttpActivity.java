package com.example.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mzule.activityrouter.annotation.Router;

@Router("https://module/http")
public class HttpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);
    }
}
