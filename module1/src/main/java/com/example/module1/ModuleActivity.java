package com.example.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.github.mzule.activityrouter.annotation.Module;
import com.github.mzule.activityrouter.annotation.Router;
import com.github.mzule.activityrouter.router.RouterActivity;
import com.github.mzule.activityrouter.router.Routers;

@Router(value = "module/main/222", intParams = "age", stringParams = {"name", "sex"}, longParams = "score")
@Module("module1")
public class ModuleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
        Intent intent = getIntent();
        int age = intent.getIntExtra("age", -1);
        long score = intent.getLongExtra("score", -1L);
        String name = intent.getStringExtra("name");
        String sex = intent.getStringExtra("sex");

        Log.e("AAAA", "age:" + age + ",score:" + score + ",name:" + name + ",sex:" + sex);
    }

    public void callFunc(View view) {
        Routers.open(this, "aaa://download");
    }

    public void jumpActivity(View view) {
        Routers.open(this, "vvv://main2activity?aa=10&bb=20");
    }
}
