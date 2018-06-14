package com.hlq.androidroad_01.egg;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hlq.androidroad_01.R;
import com.hlq.androidroad_01.databinding.ActivityEgg1Binding;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/06/07
 * desc   : 彩蛋之来个霓虹灯玩玩
 * version: 1.0
 */
public class Egg1Activity extends AppCompatActivity {

    private ActivityEgg1Binding mEggBind;

    private View[] mViews;

    private int[] mColors = {
            Color.BLUE,
            Color.GRAY,
            Color.YELLOW
    };

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0x000) {
                for (int i = 0; i < mViews.length; i++) {
                    mViews[i].setBackgroundColor(mColors[new Random().nextInt(3)]);
                }
            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mEggBind = DataBindingUtil.setContentView(this, R.layout.activity_egg1);
        mViews = new View[]{
                mEggBind.view0, mEggBind.view1, mEggBind.view2
        };
        initTimer();
    }

    private void initTimer() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                mHandler.sendEmptyMessage(0x000);
            }
        }, 0, 300);
    }
}
