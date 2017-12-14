package com.archie.nettest2.bean;

import java.util.List;

/**
 * 项目名:   NetTest2
 * 包名:     com.archie.nettest2.bean
 * 文件名:   TestModel
 * 创建者:   Jarchie
 * 创建时间: 17/12/13 下午9:54
 * 描述:     数据实体
 */

public class TestModel {


    /**
     * ecode : 0
     * emsg :
     * data : {"list":[{"id":1,"uname":"纪安奇\u2014\u2014\u2014\u2014Android开发的一个小学生","age":"24","sex":"男","address":"杭州"},{"id":2,"uname":"小李子\u2014\u2014\u2014\u2014搞金融的一个高材生","age":"24","sex":"男","address":"广州"}]}
     */

    private String ecode;
    private String emsg;
    private DataBean data;

    public String getEcode() {
        return ecode;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode;
    }

    public String getEmsg() {
        return emsg;
    }

    public void setEmsg(String emsg) {
        this.emsg = emsg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : 1
             * uname : 纪安奇————Android开发的一个小学生
             * age : 24
             * sex : 男
             * address : 杭州
             */

            private int id;
            private String uname;
            private String age;
            private String sex;
            private String address;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUname() {
                return uname;
            }

            public void setUname(String uname) {
                this.uname = uname;
            }

            public String getAge() {
                return age;
            }

            public void setAge(String age) {
                this.age = age;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }
        }
    }
}
