package com.chx.hcss;

/**
 * Created by Admin on 2018/3/19.
 */

public class ElderInfo {
    private long id;                //姓名
    private String name;                //姓名
    private int age;                   //年龄
    private String gender;             //性别
    private String address;            //住址
    private String extInfo;            //其他信息

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
