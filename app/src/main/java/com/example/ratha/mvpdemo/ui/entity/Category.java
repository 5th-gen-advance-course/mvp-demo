package com.example.ratha.mvpdemo.ui.entity;

/**
 * Created by ratha on 12/15/2017.
 */

public class Category {
    String name;
    String desc;
    String phone;
    String url;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Category() {  }

    public Category(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public Category(String name,String Phn, String desc) {
        this.name = name;
        this.desc = desc;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
