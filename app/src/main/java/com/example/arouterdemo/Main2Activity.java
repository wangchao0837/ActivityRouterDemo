package com.example.arouterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.github.mzule.activityrouter.annotation.Router;

@Router(value = "main2activity", intParams = {"aa"}, stringParams = {"bb"}, transfer = "aa=>cc")
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String bb = getIntent().getStringExtra("bb");
        int cc = getIntent().getIntExtra("cc", -1);
        TextView viewById = findViewById(R.id.tv_text);
        viewById.setText("bb = " + bb + ",cc = " + cc);
    }
}
