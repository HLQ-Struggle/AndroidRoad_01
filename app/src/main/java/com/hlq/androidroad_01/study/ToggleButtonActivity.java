package com.hlq.androidroad_01.study;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;

import com.hlq.androidroad_01.R;
import com.hlq.androidroad_01.databinding.ActivityToggleButtonBinding;

public class ToggleButtonActivity extends AppCompatActivity {

    private ActivityToggleButtonBinding mBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBind = DataBindingUtil.setContentView(this, R.layout.activity_toggle_button);
        initEvent();
    }

    private void initEvent() {
        mBind.tbtnOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mBind.tbtnOff.setTextOff("开启");
                } else {
                    mBind.tbtnOff.setTextOff("关闭");
                }
            }
        });
    }
}
