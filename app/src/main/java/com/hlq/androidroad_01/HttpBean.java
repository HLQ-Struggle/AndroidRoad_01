package com.hlq.androidroad_01;

import java.util.List;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/06/15
 * desc   :
 * version: 1.0
 */
public class HttpBean {

    /**
     * group_id : 001
     * group_name : 河北省
     * group_info : [{"child_id":"1","child_name":"张家口"},{"child_id":"1","child_name":"尚义"},{"child_id":"1","child_name":"红土梁"}]
     */

    private String group_id;
    private String group_name;
    private List<GroupInfoBean> group_info;

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public List<GroupInfoBean> getGroup_info() {
        return group_info;
    }

    public void setGroup_info(List<GroupInfoBean> group_info) {
        this.group_info = group_info;
    }

    public static class GroupInfoBean {
        /**
         * child_id : 1
         * child_name : 张家口
         */

        private String child_id;
        private String child_name;

        public String getChild_id() {
            return child_id;
        }

        public void setChild_id(String child_id) {
            this.child_id = child_id;
        }

        public String getChild_name() {
            return child_name;
        }

        public void setChild_name(String child_name) {
            this.child_name = child_name;
        }
    }
}
