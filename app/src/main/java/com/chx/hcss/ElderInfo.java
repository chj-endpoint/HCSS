package com.chx.hcss;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Admin on 2018/3/19.
 */

public class ElderInfo extends BaseObservable {
    private long id;                //姓名
    private String name;                //姓名
    private int age;                   //年龄
    private String gender;             //性别
    private String address;            //住址
    private String extInfo;            //其他信息
    private Boolean checkedMli;           //是否抽烟
    private Boolean isSmok;           //是否抽烟
    private boolean isMale;           //是否抽烟
    private boolean isFemale;           //是否抽烟

    private String culture_degree;


    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        notifyPropertyChanged(BR.gender);
    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(BR.address);
    }

    @Bindable
    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        notifyPropertyChanged(BR.extInfo);
    }

    @Bindable
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
        notifyPropertyChanged(BR.male);
    }

    @Bindable
    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
        notifyPropertyChanged(BR.female);
    }

    @Bindable
    public Boolean getCheckedMli() {
        return checkedMli;
    }

    public void setCheckedMli(Boolean checkedMli) {
        this.checkedMli = checkedMli;
        notifyPropertyChanged(BR.checkedMli);
    }

    @Bindable
    public Boolean getSmok() {
        return isSmok;
    }

    public void setSmok(Boolean smok) {
        isSmok = smok;
        notifyPropertyChanged(BR.smok);
    }

    public String getCulture_degree() {
        return culture_degree;
    }

    public void setCulture_degree(String culture_degree) {
        this.culture_degree = culture_degree;
    }
}
