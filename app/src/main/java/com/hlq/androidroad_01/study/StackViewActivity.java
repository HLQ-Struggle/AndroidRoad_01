package com.hlq.androidroad_01.study;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SimpleAdapter;

import com.hlq.androidroad_01.R;
import com.hlq.androidroad_01.databinding.ActivityStackViewBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/03/12
 * desc   : StackView学习
 * version: 1.0
 */
public class StackViewActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityStackViewBinding mStackBind;

    private int[] mImgRes = {
            R.drawable.img_01, R.drawable.img_02, R.drawable.img_03,
            R.drawable.img_04, R.drawable.img_05, R.drawable.img_06
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mStackBind = DataBindingUtil.setContentView(this, R.layout.activity_stack_view);
        initView();
        initEvent();
    }

    private void initEvent() {
        mStackBind.preBtn.setOnClickListener(this);
        mStackBind.nextBtn.setOnClickListener(this);
    }

    private void initView() {
        SimpleAdapter adapter = new SimpleAdapter(
                this, getImageData(), R.layout.item_image_view,
                new String[]{"img"},
                new int[]{R.id.item_img});
        mStackBind.stackView.setAdapter(adapter);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pre_btn:
                mStackBind.stackView.showPrevious();
                break;
            case R.id.next_btn:
                mStackBind.stackView.showNext();
                break;
        }
    }
}
