package com.example.shen.yhkj;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
                public void run() {
                    Intent intent=new Intent(WelcomActivity.this, MainActivity.class);
                    startActivity(intent);
                    System.exit(0);
                       }
     }, 1500);// 设定指定的时间time,此处为2000毫秒

    }
}
