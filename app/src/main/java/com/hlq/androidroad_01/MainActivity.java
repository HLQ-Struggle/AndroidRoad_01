package com.hlq.androidroad_01;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hlq.androidroad_01.databinding.ActivityMainBinding;
import com.hlq.androidroad_01.egg.Egg1Activity;
import com.hlq.androidroad_01.study.AdapterViewFlipperActivity;
import com.hlq.androidroad_01.study.ButtonActivity;
import com.hlq.androidroad_01.study.ExpandableListViewActivity;
import com.hlq.androidroad_01.study.StackViewActivity;
import com.hlq.androidroad_01.study.SwitchActivity;
import com.hlq.androidroad_01.study.TableLayoutActivity;
import com.hlq.androidroad_01.study.ToggleButtonActivity;
import com.hlq.androidroad_01.study.ZoomButtonActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding mMainDataBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainDataBind = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initEvent();
    }

    private void initEvent() {
        mMainDataBind.tableLayout.setOnClickListener(this);
        mMainDataBind.button.setOnClickListener(this);
        mMainDataBind.adapterViewFlipper.setOnClickListener(this);
        mMainDataBind.stackView.setOnClickListener(this);
        mMainDataBind.zoomButton.setOnClickListener(this);
        mMainDataBind.toggleButton.setOnClickListener(this);
        mMainDataBind.btnSwitch.setOnClickListener(this);
        mMainDataBind.btnExpandableListView.setOnClickListener(this);
        mMainDataBind.egg1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.table_layout:
                startActivity(new Intent(this, TableLayoutActivity.class));
                break;
            case R.id.button:
                startActivity(new Intent(this, ButtonActivity.class));
                break;
            case R.id.adapterViewFlipper:
                startActivity(new Intent(this, AdapterViewFlipperActivity.class));
                break;
            case R.id.stackView:
                startActivity(new Intent(this, StackViewActivity.class));
                break;
            case R.id.zoomButton:
                startActivity(new Intent(this, ZoomButtonActivity.class));
                break;
            case R.id.toggleButton:
                startActivity(new Intent(this, ToggleButtonActivity.class));
                break;
            case R.id.btn_switch:
                startActivity(new Intent(this, SwitchActivity.class));
                break;
            case R.id.btn_expandableListView:
                startActivity(new Intent(this, ExpandableListViewActivity.class));
                break;
            case R.id.egg_1:
                startActivity(new Intent(this, Egg1Activity.class));
                break;
        }
    }
}
