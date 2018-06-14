package com.hlq.androidroad_01.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hlq.androidroad_01.HttpBean;
import com.hlq.androidroad_01.R;

import java.util.List;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/06/14
 * desc   :
 * version: 1.0
 */
public class ExpandableListViewAdapter extends BaseExpandableListAdapter {

    private Context mContext;
    private List<HttpBean> mGroupBeanList;

    public ExpandableListViewAdapter(Context mContext, List<HttpBean> mGroupBeanList) {
        this.mContext = mContext;
        this.mGroupBeanList = mGroupBeanList;
    }

    @Override
    public int getGroupCount() {
        return mGroupBeanList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mGroupBeanList.get(groupPosition).getGroup_info().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return mGroupBeanList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mGroupBeanList.get(groupPosition).getGroup_info().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_layout, null);
        }
        LinearLayout group = convertView.findViewById(R.id.group);
        group.setBackgroundColor(Color.GRAY);
        View view = convertView.findViewById(R.id.view_group);
        TextView tvTitle = convertView.findViewById(R.id.tv_group_title);
        if (groupPosition % 2 == 0) {
            view.setBackgroundColor(Color.RED);
        } else {
            view.setBackgroundColor(Color.GREEN);
        }
        tvTitle.setText(mGroupBeanList.get(groupPosition).getGroup_name());
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_layout, null);
        }
        View view = convertView.findViewById(R.id.view_group);
        TextView tvTitle = convertView.findViewById(R.id.tv_group_title);
        if (childPosition % 2 == 0) {
            view.setBackgroundColor(Color.RED);
        } else {
            view.setBackgroundColor(Color.GREEN);
        }
        tvTitle.setText(mGroupBeanList.get(groupPosition).getGroup_info().get(childPosition).getChild_name());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
