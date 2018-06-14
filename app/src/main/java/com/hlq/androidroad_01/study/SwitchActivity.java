package com.hlq.androidroad_01.study;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hlq.androidroad_01.R;
import com.hlq.androidroad_01.databinding.ActivitySwitchBinding;

public class SwitchActivity extends AppCompatActivity {

    private ActivitySwitchBinding mDind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDind = DataBindingUtil.setContentView(this, R.layout.activity_switch);
    }
}
