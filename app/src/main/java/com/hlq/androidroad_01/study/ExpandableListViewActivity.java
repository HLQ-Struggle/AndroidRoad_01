package com.hlq.androidroad_01.study;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hlq.androidroad_01.HttpBean;
import com.hlq.androidroad_01.R;
import com.hlq.androidroad_01.adapter.ExpandableListViewAdapter;
import com.hlq.androidroad_01.databinding.ActivityExpandableListViewBinding;

import java.util.List;

public class ExpandableListViewActivity extends AppCompatActivity {

    private ActivityExpandableListViewBinding mBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBind = DataBindingUtil.setContentView(this, R.layout.activity_expandable_list_view);
        initView();
    }

    private void initView() {
        ExpandableListViewAdapter adapter = new ExpandableListViewAdapter(this, getHttpBeanList());
        mBind.elvShow.setAdapter(adapter);
    }

    public List<HttpBean> getHttpBeanList() {
        String jsonStr = "[{\"group_id\":\"001\",\"group_name\":\"河北省\",\"group_info\":[{\"child_id\":\"1\",\"child_name\":\"张家口\"},{\"child_id\":\"1\",\"child_name\":\"尚义\"},{\"child_id\":\"1\",\"child_name\":\"红土梁\"}]},{\"group_id\":\"001\",\"group_name\":\"北京市\",\"group_info\":[{\"child_id\":\"1\",\"child_name\":\"昌平\"},{\"child_id\":\"1\",\"child_name\":\"海淀\"}]},{\"group_id\":\"001\",\"group_name\":\"上海\",\"group_info\":[{\"child_id\":\"1\",\"child_name\":\"金山\"},{\"child_id\":\"1\",\"child_name\":\"浦东\"},{\"child_id\":\"1\",\"child_name\":\"浦西\"}]},{\"group_id\":\"001\",\"group_name\":\"搞个妹子\",\"group_info\":[]},{\"group_id\":\"001\",\"group_name\":\"哇咔咔\",\"group_info\":[{\"child_id\":\"1\",\"child_name\":\"嘻嘻嘻\"},{\"child_id\":\"1\",\"child_name\":\"嗷呜呜\"},{\"child_id\":\"1\",\"child_name\":\"嘿嘿嘿\"}]}]";
        List<HttpBean> httpBeanList = new Gson().fromJson(jsonStr, new TypeToken<List<HttpBean>>() {
        }.getType());
        return httpBeanList;
    }
}
