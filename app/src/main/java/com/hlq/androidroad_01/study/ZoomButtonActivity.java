package com.hlq.androidroad_01.study;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hlq.androidroad_01.R;
import com.hlq.androidroad_01.databinding.ActivityZoomButtonBinding;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/06/13
 * desc   : ZoomButton了解
 * version: 1.0
 */
public class ZoomButtonActivity extends AppCompatActivity {

    private ActivityZoomButtonBinding mZoomDind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mZoomDind = DataBindingUtil.setContentView(this, R.layout.activity_zoom_button);
    }

}
