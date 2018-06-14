package com.hlq.androidroad_01.study;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SimpleAdapter;

import com.hlq.androidroad_01.R;
import com.hlq.androidroad_01.databinding.ActivityAdapterViewFlipperBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/06/13
 * desc   : AdapterViewFlipper学习
 * version: 1.0
 */
public class AdapterViewFlipperActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityAdapterViewFlipperBinding mFlipperBind;

    private int[] mImgRes = {
            R.drawable.img_01, R.drawable.img_02, R.drawable.img_03,
            R.drawable.img_04, R.drawable.img_05, R.drawable.img_06
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFlipperBind = DataBindingUtil.setContentView(this, R.layout.activity_adapter_view_flipper);
        initView();
        initEvent();
    }

    private void initEvent() {
        mFlipperBind.btnPre.setOnClickListener(this);
        mFlipperBind.btnAuto.setOnClickListener(this);
        mFlipperBind.btnNext.setOnClickListener(this);
    }

    private List<Map<String, Integer>> getImageData() {
        List<Map<String, Integer>> imageResList = new ArrayList<>();
        for (int i = 0; i < mImgRes.length; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("img", mImgRes[i]);
            imageResList.add(map);
        }
        return imageResList;
    }

    private void initView() {
        SimpleAdapter adapter = new SimpleAdapter(this, getImageData(),
                R.layout.item_image_view,
                new String[]{"img"},
                new int[]{R.id.item_img});
        mFlipperBind.vfShow.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pre:
                mFlipperBind.vfShow.showPrevious();
                if (mFlipperBind.vfShow.isFlipping()) {
                    mFlipperBind.vfShow.stopFlipping();
                }
                break;
            case R.id.btn_auto:
                mFlipperBind.vfShow.setFlipInterval(1500);
                mFlipperBind.vfShow.startFlipping();
                break;
            case R.id.btn_next:
                mFlipperBind.vfShow.showNext();
                if (mFlipperBind.vfShow.isFlipping()) {
                    mFlipperBind.vfShow.stopFlipping();
                }
                break;
        }
    }
}
