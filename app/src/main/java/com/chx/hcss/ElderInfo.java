package com.chx.hcss;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Admin on 2018/3/19.
 */

public class ElderInfo extends BaseObservable {
    private long id;                //id
    private String extInfo;            //其他信息
    private String local_address;
    private String vallage;
    private String name;
    private String nation;
    private String id_number;
    private String register_address;
    private String culture_degree;
    private String birthday;
    private String contact;
    private String height;
    private String txt_economic_other;
    private String children;
    private String first_children;
    private String second_children;
    private String txt_type_other;
    private String txt_live_other;
    private String txt_pension_other;
    private String txt_drink_other;
    private String txt_fuel_other;
    private String specialty;
    private String txt_hobby_other;
    private String txt_pet_other;
    private String txt_compensate_standard_other;
    private String blood;
    private String medical_history;
    private String txt_drug_allergy_other;
    private String medical;
    private String medical_one_number;
    private String medical_one_time;
    private String medical_one_mode;
    private String medical_two_number;
    private String medical_twoe_time;
    private String medical_two_mode;
    private String medical_threee_number;
    private String medical_three_time;
    private String medical_three_mode;
    private String txt_psychological_feature_other;
    private String txt_now_feature_other;
    private String txt_pre_silly_other;
    private String txt_family_history_other;
    private String txt_chronic_disease_other;
    private String txt_exercise_other;
    private String txt_online_type_other;
    private String txt_online_goal_other;
    private String txt_housekeeping_other;
    private String txt_life_request_other;
    private String txt_medicine_request_other;
    private String txt_other_message;
    private String txt_summary;
    private boolean helpage_member1;
    private boolean helpage_member2;
    private boolean helpage_member3;
    private boolean helpage_member4;
    private boolean helpage_member5;
    private boolean radioMale;
    private boolean radioFemale;
    private boolean radioUnmarried;
    private boolean radioMarried;
    private boolean radioDivorce;
    private boolean radioRemarried;
    private boolean radioWidowed;
    private boolean radioRetireYes;
    private boolean radioRetireNo;
    private boolean radioExtroversion;
    private boolean radioIntrovert;
    private boolean economic_self;
    private boolean economic_children;
    private boolean economic_pension;
    private boolean economic_government;
    private boolean economic_social;
    private boolean economic_other;
    private boolean type_self;
    private boolean type_threeno;
    private boolean type_alone;
    private boolean type_empty_nest;
    private boolean type_healthy;
    private boolean type_disease;
    private boolean type_special_sick;
    private boolean type_other;
    private boolean live_children;
    private boolean live_spouse;
    private boolean live_nurse;
    private boolean live_alone;
    private boolean live_other;
    private boolean pension_home;
    private boolean pension_community;
    private boolean pension_company;
    private boolean pension_other;
    private boolean drink_tap_water;
    private boolean drink_filter_water;
    private boolean drink_well;
    private boolean drink_river;
    private boolean drink_other;
    private boolean fuel_liquid_gas;
    private boolean fuel_coal;
    private boolean fuel_gas;
    private boolean fuel_other;
    private boolean kitchen_no;
    private boolean kitchen_machine;
    private boolean kitchen_fan;
    private boolean kitchen_window;
    private boolean hobby_sing;
    private boolean hobby_dance;
    private boolean hobby_internet;
    private boolean hobby_cook;
    private boolean hobby_travel;
    private boolean hobby_chess;
    private boolean hobby_pet;
    private boolean hobby_fishing;
    private boolean hobby_no;
    private boolean hobby_other;
    private boolean pet_birds;
    private boolean pet_cat;
    private boolean pet_dog;
    private boolean pet_no;
    private boolean pet_other;
    private boolean compensate_low;
    private boolean compensate_no;
    private boolean compensate_paid;
    private boolean compensate_standard_no;
    private boolean compensate_standard_threeno;
    private boolean compensate_standard_eight;
    private boolean compensate_standard_ninty;
    private boolean compensate_standard_sigle_child;
    private boolean compensate_standard_special_diffcult;
    private boolean compensate_standard_five;
    private boolean compensate_standard_care;
    private boolean compensate_standard_disable;
    private boolean compensate_standard_other;
    private boolean government_grant_no;
    private boolean government_grant_one;
    private boolean government_grant_three;
    private boolean government_grant_thousand;
    private boolean radio_have_medical;
    private boolean radio_no_medical;
    private boolean drug_allergy_no;
    private boolean drug_allergy_qingmeisu;
    private boolean drug_allergy_huangan;
    private boolean drug_allergy_lianmeisu;
    private boolean drug_allergy_other;
    private boolean radio_day_sleep_three;
    private boolean radio_day_sleep_five;
    private boolean radio_day_sleep_seven;
    private boolean radio_day_sleep_nine;
    private boolean psychological_feature__lonely;
    private boolean psychological_feature_rely;
    private boolean psychological_feature_angry;
    private boolean psychological_feature_fear;
    private boolean psychological_feature_anxious;
    private boolean psychological_feature_other;
    private boolean radio_occupation_one;
    private boolean radio_occupation_two;
    private boolean radio_occupation_three;
    private boolean radio_occupation_four;
    private boolean radio_occupation_five;
    private boolean radio_occupation_six;
    private boolean radio_occupation_seven;
    private boolean radio_occupation_eight;
    private boolean now_feature_no;
    private boolean now_feature_headice;
    private boolean now_feature_dizzy;
    private boolean now_feature_xinji;
    private boolean now_feature_xiongmen;
    private boolean now_feature_kesou;
    private boolean now_feature_ketan;
    private boolean now_feature_huxikunnan;
    private boolean now_feature_duoyin;
    private boolean now_feature_duoniao;
    private boolean now_feature_tizhongxiajiang;
    private boolean now_feature_fali;
    private boolean now_feature_guanjie;
    private boolean now_feature_shili;
    private boolean now_feature_shoujiao;
    private boolean now_feature_niaoji;
    private boolean now_feature_niaotong;
    private boolean now_feature_bianmi;
    private boolean now_feature_fuxie;
    private boolean now_feature_exin;
    private boolean now_feature_yanhua;
    private boolean now_feature_erming;
    private boolean now_feature_other;
    private boolean pre_silly_no;
    private boolean pre_silly_xingweiyichang;
    private boolean pre_silly_panduankunnan;
    private boolean pre_silly_nenglijiantui;
    private boolean pre_silly_jiyizhangai;
    private boolean pre_silly_daizuo;
    private boolean pre_silly_waichu;
    private boolean pre_silly_lost;
    private boolean pre_silly_other;
    private boolean family_history_no;
    private boolean family_history_gaoxueya;
    private boolean family_history_tangniaobing;
    private boolean family_history_guanxinbing;
    private boolean family_history_manxingzuse;
    private boolean family_history_xinfeijibing;
    private boolean family_history_exingzhongliu;
    private boolean family_history_naozuzhong;
    private boolean family_history_jingshenbing;
    private boolean family_history_jiehebing;
    private boolean family_history_ganyan;
    private boolean family_history_jixing;
    private boolean family_history_other;
    private boolean radio_dinck_wine_one;
    private boolean radio_dinck_wine_two;
    private boolean radio_dinck_wine_three;
    private boolean radio_eating_history_one;
    private boolean radio_eating_history_two;
    private boolean radio_eating_history_three;
    private boolean radio_smoking_one;
    private boolean radio_smoking_two;
    private boolean radio_smoking_three;
    private boolean radio_smoking_four;
    private boolean radio_smoking_five;
    private boolean radio_smoking_six;
    private boolean radio_smoking_seven;
    private boolean radio_smoking_eight;
    private boolean physical_condition_zili;
    private boolean physical_condition_banzili;
    private boolean physical_condition_banshineng;
    private boolean physical_condition_shineng;
    private boolean physical_condition_bantan;
    private boolean physical_condition_tanhuan;
    private boolean physical_condition_jingshencanji;
    private boolean physical_condition_zhiticanji;
    private boolean physical_condition_zhilicanji;
    private boolean physical_condition_shilicanji;
    private boolean physical_condition_tinglicanji;
    private boolean physical_condition_yuyancanji;
    private boolean physical_condition_duochongcanji;
    private boolean physical_condition_other;
    private boolean radio_health_self_one;
    private boolean radio_health_self_two;
    private boolean radio_health_self_three;
    private boolean radio_health_self_four;
    private boolean radio_health_self_five;
    private boolean radio_care_self_one;
    private boolean radio_care_self_two;
    private boolean radio_care_self_three;
    private boolean radio_care_self_four;
    private boolean chronic_disease_no;
    private boolean chronic_disease_gaoxueya;
    private boolean chronic_disease_tangniaobing;
    private boolean chronic_disease_guanxinbing;
    private boolean chronic_disease_xinjigengse;
    private boolean chronic_disease_xinjibing;
    private boolean chronic_disease_zhongfeng;
    private boolean chronic_disease_guzhishusong;
    private boolean chronic_disease_xinlishuaijie;
    private boolean chronic_disease_other;
    private boolean exercise_no;
    private boolean exercise_jujiaduanlian;
    private boolean exercise_sanbu;
    private boolean exercise_taijiquan;
    private boolean exercise_menqiu;
    private boolean exercise_manpao;
    private boolean exercise_youyong;
    private boolean exercise_jianshen;
    private boolean exercise_other;
    private boolean online_type__no;
    private boolean online_type_diannao;
    private boolean online_type_shouji;
    private boolean online_type_pingban;
    private boolean online_type_other;
    private boolean online_goal_youxi;
    private boolean online_goal_shipin;
    private boolean online_goal_liaotian;
    private boolean online_goal_yule;
    private boolean online_goal_ruanjian;
    private boolean online_goal_xiazai;
    private boolean online_goal_xiangguanzixun;
    private boolean online_goal_other;
    private boolean housekeeping_dasaoweisheng;
    private boolean housekeeping_banjia;
    private boolean housekeeping_baomu;
    private boolean housekeeping_qingxijiaju;
    private boolean housekeeping_shutongxiashuidao;
    private boolean housekeeping_wuxuqiu;
    private boolean housekeeping_other;
    private boolean life_request_no;
    private boolean life_request_yaopinpeisong;
    private boolean life_request_ruyongpinpeisong;
    private boolean life_request_niuyangnai;
    private boolean life_request_dangao;
    private boolean life_request_lifa;
    private boolean life_request_canyinpeisong;
    private boolean life_request_other;
    private boolean medicine_request_peizhen;
    private boolean medicine_request_tijian;
    private boolean medicine_request_shangmenkangfu;
    private boolean medicine_request_shangmenhuli;
    private boolean medicine_request_shangmenliliao;
    private boolean medicine_request_wuxuqiu;
    private boolean medicine_request_other;
    private boolean radio_phone_call_yes;
    private boolean radiophone_call_no;

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
    public String getLocal_address()
    {
        return local_address;
    }
    public void setLocal_address(String local_address)
    {
        this.local_address = local_address;
        notifyPropertyChanged(BR.local_address);
    }
    @Bindable
    public String getVallage()
    {
        return vallage;
    }
    public void setVallage(String vallage)
    {
        this.vallage = vallage;
        notifyPropertyChanged(BR.vallage);
    }
    @Bindable
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public String getNation()
    {
        return nation;
    }
    public void setNation(String nation)
    {
        this.nation = nation;
        notifyPropertyChanged(BR.nation);
    }
    @Bindable
    public String getId_number()
    {
        return id_number;
    }
    public void setId_number(String id_number)
    {
        this.id_number = id_number;
        notifyPropertyChanged(BR.id_number);
    }
    @Bindable
    public String getRegister_address()
    {
        return register_address;
    }
    public void setRegister_address(String register_address)
    {
        this.register_address = register_address;
        notifyPropertyChanged(BR.register_address);
    }
    @Bindable
    public String getCulture_degree()
    {
        return culture_degree;
    }
    public void setCulture_degree(String culture_degree)
    {
        this.culture_degree = culture_degree;
        notifyPropertyChanged(BR.culture_degree);
    }
    @Bindable
    public String getBirthday()
    {
        return birthday;
    }
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
        notifyPropertyChanged(BR.birthday);
    }
    @Bindable
    public String getContact()
    {
        return contact;
    }
    public void setContact(String contact)
    {
        this.contact = contact;
        notifyPropertyChanged(BR.contact);
    }
    @Bindable
    public String getHeight()
    {
        return height;
    }
    public void setHeight(String height)
    {
        this.height = height;
        notifyPropertyChanged(BR.height);
    }
    @Bindable
    public String getTxt_economic_other()
    {
        return txt_economic_other;
    }
    public void setTxt_economic_other(String txt_economic_other)
    {
        this.txt_economic_other = txt_economic_other;
        notifyPropertyChanged(BR.txt_economic_other);
    }
    @Bindable
    public String getChildren()
    {
        return children;
    }
    public void setChildren(String children)
    {
        this.children = children;
        notifyPropertyChanged(BR.children);
    }
    @Bindable
    public String getFirst_children()
    {
        return first_children;
    }
    public void setFirst_children(String first_children)
    {
        this.first_children = first_children;
        notifyPropertyChanged(BR.first_children);
    }
    @Bindable
    public String getSecond_children()
    {
        return second_children;
    }
    public void setSecond_children(String second_children)
    {
        this.second_children = second_children;
        notifyPropertyChanged(BR.second_children);
    }
    @Bindable
    public String getTxt_type_other()
    {
        return txt_type_other;
    }
    public void setTxt_type_other(String txt_type_other)
    {
        this.txt_type_other = txt_type_other;
        notifyPropertyChanged(BR.txt_type_other);
    }
    @Bindable
    public String getTxt_live_other()
    {
        return txt_live_other;
    }
    public void setTxt_live_other(String txt_live_other)
    {
        this.txt_live_other = txt_live_other;
        notifyPropertyChanged(BR.txt_live_other);
    }
    @Bindable
    public String getTxt_pension_other()
    {
        return txt_pension_other;
    }
    public void setTxt_pension_other(String txt_pension_other)
    {
        this.txt_pension_other = txt_pension_other;
        notifyPropertyChanged(BR.txt_pension_other);
    }
    @Bindable
    public String getTxt_drink_other()
    {
        return txt_drink_other;
    }
    public void setTxt_drink_other(String txt_drink_other)
    {
        this.txt_drink_other = txt_drink_other;
        notifyPropertyChanged(BR.txt_drink_other);
    }
    @Bindable
    public String getTxt_fuel_other()
    {
        return txt_fuel_other;
    }
    public void setTxt_fuel_other(String txt_fuel_other)
    {
        this.txt_fuel_other = txt_fuel_other;
        notifyPropertyChanged(BR.txt_fuel_other);
    }
    @Bindable
    public String getSpecialty()
    {
        return specialty;
    }
    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
        notifyPropertyChanged(BR.specialty);
    }
    @Bindable
    public String getTxt_hobby_other()
    {
        return txt_hobby_other;
    }
    public void setTxt_hobby_other(String txt_hobby_other)
    {
        this.txt_hobby_other = txt_hobby_other;
        notifyPropertyChanged(BR.txt_hobby_other);
    }
    @Bindable
    public String getTxt_pet_other()
    {
        return txt_pet_other;
    }
    public void setTxt_pet_other(String txt_pet_other)
    {
        this.txt_pet_other = txt_pet_other;
        notifyPropertyChanged(BR.txt_pet_other);
    }
    @Bindable
    public String getTxt_compensate_standard_other()
    {
        return txt_compensate_standard_other;
    }
    public void setTxt_compensate_standard_other(String txt_compensate_standard_other)
    {
        this.txt_compensate_standard_other = txt_compensate_standard_other;
        notifyPropertyChanged(BR.txt_compensate_standard_other);
    }
    @Bindable
    public String getBlood()
    {
        return blood;
    }
    public void setBlood(String blood)
    {
        this.blood = blood;
        notifyPropertyChanged(BR.blood);
    }
    @Bindable
    public String getMedical_history()
    {
        return medical_history;
    }
    public void setMedical_history(String medical_history)
    {
        this.medical_history = medical_history;
        notifyPropertyChanged(BR.medical_history);
    }
    @Bindable
    public String getTxt_drug_allergy_other()
    {
        return txt_drug_allergy_other;
    }
    public void setTxt_drug_allergy_other(String txt_drug_allergy_other)
    {
        this.txt_drug_allergy_other = txt_drug_allergy_other;
        notifyPropertyChanged(BR.txt_drug_allergy_other);
    }
    @Bindable
    public String getMedical()
    {
        return medical;
    }
    public void setMedical(String medical)
    {
        this.medical = medical;
        notifyPropertyChanged(BR.medical);
    }
    @Bindable
    public String getMedical_one_number()
    {
        return medical_one_number;
    }
    public void setMedical_one_number(String medical_one_number)
    {
        this.medical_one_number = medical_one_number;
        notifyPropertyChanged(BR.medical_one_number);
    }
    @Bindable
    public String getMedical_one_time()
    {
        return medical_one_time;
    }
    public void setMedical_one_time(String medical_one_time)
    {
        this.medical_one_time = medical_one_time;
        notifyPropertyChanged(BR.medical_one_time);
    }
    @Bindable
    public String getMedical_one_mode()
    {
        return medical_one_mode;
    }
    public void setMedical_one_mode(String medical_one_mode)
    {
        this.medical_one_mode = medical_one_mode;
        notifyPropertyChanged(BR.medical_one_mode);
    }
    @Bindable
    public String getMedical_two_number()
    {
        return medical_two_number;
    }
    public void setMedical_two_number(String medical_two_number)
    {
        this.medical_two_number = medical_two_number;
        notifyPropertyChanged(BR.medical_two_number);
    }
    @Bindable
    public String getMedical_twoe_time()
    {
        return medical_twoe_time;
    }
    public void setMedical_twoe_time(String medical_twoe_time)
    {
        this.medical_twoe_time = medical_twoe_time;
        notifyPropertyChanged(BR.medical_twoe_time);
    }
    @Bindable
    public String getMedical_two_mode()
    {
        return medical_two_mode;
    }
    public void setMedical_two_mode(String medical_two_mode)
    {
        this.medical_two_mode = medical_two_mode;
        notifyPropertyChanged(BR.medical_two_mode);
    }
    @Bindable
    public String getMedical_threee_number()
    {
        return medical_threee_number;
    }
    public void setMedical_threee_number(String medical_threee_number)
    {
        this.medical_threee_number = medical_threee_number;
        notifyPropertyChanged(BR.medical_threee_number);
    }
    @Bindable
    public String getMedical_three_time()
    {
        return medical_three_time;
    }
    public void setMedical_three_time(String medical_three_time)
    {
        this.medical_three_time = medical_three_time;
        notifyPropertyChanged(BR.medical_three_time);
    }
    @Bindable
    public String getMedical_three_mode()
    {
        return medical_three_mode;
    }
    public void setMedical_three_mode(String medical_three_mode)
    {
        this.medical_three_mode = medical_three_mode;
        notifyPropertyChanged(BR.medical_three_mode);
    }
    @Bindable
    public String getTxt_psychological_feature_other()
    {
        return txt_psychological_feature_other;
    }
    public void setTxt_psychological_feature_other(String txt_psychological_feature_other)
    {
        this.txt_psychological_feature_other = txt_psychological_feature_other;
        notifyPropertyChanged(BR.txt_psychological_feature_other);
    }
    @Bindable
    public String getTxt_now_feature_other()
    {
        return txt_now_feature_other;
    }
    public void setTxt_now_feature_other(String txt_now_feature_other)
    {
        this.txt_now_feature_other = txt_now_feature_other;
        notifyPropertyChanged(BR.txt_now_feature_other);
    }
    @Bindable
    public String getTxt_pre_silly_other()
    {
        return txt_pre_silly_other;
    }
    public void setTxt_pre_silly_other(String txt_pre_silly_other)
    {
        this.txt_pre_silly_other = txt_pre_silly_other;
        notifyPropertyChanged(BR.txt_pre_silly_other);
    }
    @Bindable
    public String getTxt_family_history_other()
    {
        return txt_family_history_other;
    }
    public void setTxt_family_history_other(String txt_family_history_other)
    {
        this.txt_family_history_other = txt_family_history_other;
        notifyPropertyChanged(BR.txt_family_history_other);
    }
    @Bindable
    public String getTxt_chronic_disease_other()
    {
        return txt_chronic_disease_other;
    }
    public void setTxt_chronic_disease_other(String txt_chronic_disease_other)
    {
        this.txt_chronic_disease_other = txt_chronic_disease_other;
        notifyPropertyChanged(BR.txt_chronic_disease_other);
    }
    @Bindable
    public String getTxt_exercise_other()
    {
        return txt_exercise_other;
    }
    public void setTxt_exercise_other(String txt_exercise_other)
    {
        this.txt_exercise_other = txt_exercise_other;
        notifyPropertyChanged(BR.txt_exercise_other);
    }
    @Bindable
    public String getTxt_online_type_other()
    {
        return txt_online_type_other;
    }
    public void setTxt_online_type_other(String txt_online_type_other)
    {
        this.txt_online_type_other = txt_online_type_other;
        notifyPropertyChanged(BR.txt_online_type_other);
    }
    @Bindable
    public String getTxt_online_goal_other()
    {
        return txt_online_goal_other;
    }
    public void setTxt_online_goal_other(String txt_online_goal_other)
    {
        this.txt_online_goal_other = txt_online_goal_other;
        notifyPropertyChanged(BR.txt_online_goal_other);
    }
    @Bindable
    public String getTxt_housekeeping_other()
    {
        return txt_housekeeping_other;
    }
    public void setTxt_housekeeping_other(String txt_housekeeping_other)
    {
        this.txt_housekeeping_other = txt_housekeeping_other;
        notifyPropertyChanged(BR.txt_housekeeping_other);
    }
    @Bindable
    public String getTxt_life_request_other()
    {
        return txt_life_request_other;
    }
    public void setTxt_life_request_other(String txt_life_request_other)
    {
        this.txt_life_request_other = txt_life_request_other;
        notifyPropertyChanged(BR.txt_life_request_other);
    }
    @Bindable
    public String getTxt_medicine_request_other()
    {
        return txt_medicine_request_other;
    }
    public void setTxt_medicine_request_other(String txt_medicine_request_other)
    {
        this.txt_medicine_request_other = txt_medicine_request_other;
        notifyPropertyChanged(BR.txt_medicine_request_other);
    }
    @Bindable
    public String getTxt_other_message()
    {
        return txt_other_message;
    }
    public void setTxt_other_message(String txt_other_message)
    {
        this.txt_other_message = txt_other_message;
        notifyPropertyChanged(BR.txt_other_message);
    }
    @Bindable
    public String getTxt_summary()
    {
        return txt_summary;
    }
    public void setTxt_summary(String txt_summary)
    {
        this.txt_summary = txt_summary;
        notifyPropertyChanged(BR.txt_summary);
    }
    @Bindable
    public boolean getHelpage_member1()
    {
        return helpage_member1;
    }
    public void setHelpage_member1(boolean helpage_member1)
    {
        this.helpage_member1 = helpage_member1;
        notifyPropertyChanged(BR.helpage_member1);
    }
    @Bindable
    public boolean getHelpage_member2()
    {
        return helpage_member2;
    }
    public void setHelpage_member2(boolean helpage_member2)
    {
        this.helpage_member2 = helpage_member2;
        notifyPropertyChanged(BR.helpage_member2);
    }
    @Bindable
    public boolean getHelpage_member3()
    {
        return helpage_member3;
    }
    public void setHelpage_member3(boolean helpage_member3)
    {
        this.helpage_member3 = helpage_member3;
        notifyPropertyChanged(BR.helpage_member3);
    }
    @Bindable
    public boolean getHelpage_member4()
    {
        return helpage_member4;
    }
    public void setHelpage_member4(boolean helpage_member4)
    {
        this.helpage_member4 = helpage_member4;
        notifyPropertyChanged(BR.helpage_member4);
    }
    @Bindable
    public boolean getHelpage_member5()
    {
        return helpage_member5;
    }
    public void setHelpage_member5(boolean helpage_member5)
    {
        this.helpage_member5 = helpage_member5;
        notifyPropertyChanged(BR.helpage_member5);
    }
    @Bindable
    public boolean getRadioMale()
    {
        return radioMale;
    }
    public void setRadioMale(boolean radioMale)
    {
        this.radioMale = radioMale;
        notifyPropertyChanged(BR.radioMale);
    }
    @Bindable
    public boolean getRadioFemale()
    {
        return radioFemale;
    }
    public void setRadioFemale(boolean radioFemale)
    {
        this.radioFemale = radioFemale;
        notifyPropertyChanged(BR.radioFemale);
    }
    @Bindable
    public boolean getRadioUnmarried()
    {
        return radioUnmarried;
    }
    public void setRadioUnmarried(boolean radioUnmarried)
    {
        this.radioUnmarried = radioUnmarried;
        notifyPropertyChanged(BR.radioUnmarried);
    }
    @Bindable
    public boolean getRadioMarried()
    {
        return radioMarried;
    }
    public void setRadioMarried(boolean radioMarried)
    {
        this.radioMarried = radioMarried;
        notifyPropertyChanged(BR.radioMarried);
    }
    @Bindable
    public boolean getRadioDivorce()
    {
        return radioDivorce;
    }
    public void setRadioDivorce(boolean radioDivorce)
    {
        this.radioDivorce = radioDivorce;
        notifyPropertyChanged(BR.radioDivorce);
    }
    @Bindable
    public boolean getRadioRemarried()
    {
        return radioRemarried;
    }
    public void setRadioRemarried(boolean radioRemarried)
    {
        this.radioRemarried = radioRemarried;
        notifyPropertyChanged(BR.radioRemarried);
    }
    @Bindable
    public boolean getRadioWidowed()
    {
        return radioWidowed;
    }
    public void setRadioWidowed(boolean radioWidowed)
    {
        this.radioWidowed = radioWidowed;
        notifyPropertyChanged(BR.radioWidowed);
    }
    @Bindable
    public boolean getRadioRetireYes()
    {
        return radioRetireYes;
    }
    public void setRadioRetireYes(boolean radioRetireYes)
    {
        this.radioRetireYes = radioRetireYes;
        notifyPropertyChanged(BR.radioRetireYes);
    }
    @Bindable
    public boolean getRadioRetireNo()
    {
        return radioRetireNo;
    }
    public void setRadioRetireNo(boolean radioRetireNo)
    {
        this.radioRetireNo = radioRetireNo;
        notifyPropertyChanged(BR.radioRetireNo);
    }
    @Bindable
    public boolean getRadioExtroversion()
    {
        return radioExtroversion;
    }
    public void setRadioExtroversion(boolean radioExtroversion)
    {
        this.radioExtroversion = radioExtroversion;
        notifyPropertyChanged(BR.radioExtroversion);
    }
    @Bindable
    public boolean getRadioIntrovert()
    {
        return radioIntrovert;
    }
    public void setRadioIntrovert(boolean radioIntrovert)
    {
        this.radioIntrovert = radioIntrovert;
        notifyPropertyChanged(BR.radioIntrovert);
    }
    @Bindable
    public boolean getEconomic_self()
    {
        return economic_self;
    }
    public void setEconomic_self(boolean economic_self)
    {
        this.economic_self = economic_self;
        notifyPropertyChanged(BR.economic_self);
    }
    @Bindable
    public boolean getEconomic_children()
    {
        return economic_children;
    }
    public void setEconomic_children(boolean economic_children)
    {
        this.economic_children = economic_children;
        notifyPropertyChanged(BR.economic_children);
    }
    @Bindable
    public boolean getEconomic_pension()
    {
        return economic_pension;
    }
    public void setEconomic_pension(boolean economic_pension)
    {
        this.economic_pension = economic_pension;
        notifyPropertyChanged(BR.economic_pension);
    }
    @Bindable
    public boolean getEconomic_government()
    {
        return economic_government;
    }
    public void setEconomic_government(boolean economic_government)
    {
        this.economic_government = economic_government;
        notifyPropertyChanged(BR.economic_government);
    }
    @Bindable
    public boolean getEconomic_social()
    {
        return economic_social;
    }
    public void setEconomic_social(boolean economic_social)
    {
        this.economic_social = economic_social;
        notifyPropertyChanged(BR.economic_social);
    }
    @Bindable
    public boolean getEconomic_other()
    {
        return economic_other;
    }
    public void setEconomic_other(boolean economic_other)
    {
        this.economic_other = economic_other;
        notifyPropertyChanged(BR.economic_other);
    }
    @Bindable
    public boolean getType_self()
    {
        return type_self;
    }
    public void setType_self(boolean type_self)
    {
        this.type_self = type_self;
        notifyPropertyChanged(BR.type_self);
    }
    @Bindable
    public boolean getType_threeno()
    {
        return type_threeno;
    }
    public void setType_threeno(boolean type_threeno)
    {
        this.type_threeno = type_threeno;
        notifyPropertyChanged(BR.type_threeno);
    }
    @Bindable
    public boolean getType_alone()
    {
        return type_alone;
    }
    public void setType_alone(boolean type_alone)
    {
        this.type_alone = type_alone;
        notifyPropertyChanged(BR.type_alone);
    }
    @Bindable
    public boolean getType_empty_nest()
    {
        return type_empty_nest;
    }
    public void setType_empty_nest(boolean type_empty_nest)
    {
        this.type_empty_nest = type_empty_nest;
        notifyPropertyChanged(BR.type_empty_nest);
    }
    @Bindable
    public boolean getType_healthy()
    {
        return type_healthy;
    }
    public void setType_healthy(boolean type_healthy)
    {
        this.type_healthy = type_healthy;
        notifyPropertyChanged(BR.type_healthy);
    }
    @Bindable
    public boolean getType_disease()
    {
        return type_disease;
    }
    public void setType_disease(boolean type_disease)
    {
        this.type_disease = type_disease;
        notifyPropertyChanged(BR.type_disease);
    }
    @Bindable
    public boolean getType_special_sick()
    {
        return type_special_sick;
    }
    public void setType_special_sick(boolean type_special_sick)
    {
        this.type_special_sick = type_special_sick;
        notifyPropertyChanged(BR.type_special_sick);
    }
    @Bindable
    public boolean getType_other()
    {
        return type_other;
    }
    public void setType_other(boolean type_other)
    {
        this.type_other = type_other;
        notifyPropertyChanged(BR.type_other);
    }
    @Bindable
    public boolean getLive_children()
    {
        return live_children;
    }
    public void setLive_children(boolean live_children)
    {
        this.live_children = live_children;
        notifyPropertyChanged(BR.live_children);
    }
    @Bindable
    public boolean getLive_spouse()
    {
        return live_spouse;
    }
    public void setLive_spouse(boolean live_spouse)
    {
        this.live_spouse = live_spouse;
        notifyPropertyChanged(BR.live_spouse);
    }
    @Bindable
    public boolean getLive_nurse()
    {
        return live_nurse;
    }
    public void setLive_nurse(boolean live_nurse)
    {
        this.live_nurse = live_nurse;
        notifyPropertyChanged(BR.live_nurse);
    }
    @Bindable
    public boolean getLive_alone()
    {
        return live_alone;
    }
    public void setLive_alone(boolean live_alone)
    {
        this.live_alone = live_alone;
        notifyPropertyChanged(BR.live_alone);
    }
    @Bindable
    public boolean getLive_other()
    {
        return live_other;
    }
    public void setLive_other(boolean live_other)
    {
        this.live_other = live_other;
        notifyPropertyChanged(BR.live_other);
    }
    @Bindable
    public boolean getPension_home()
    {
        return pension_home;
    }
    public void setPension_home(boolean pension_home)
    {
        this.pension_home = pension_home;
        notifyPropertyChanged(BR.pension_home);
    }
    @Bindable
    public boolean getPension_community()
    {
        return pension_community;
    }
    public void setPension_community(boolean pension_community)
    {
        this.pension_community = pension_community;
        notifyPropertyChanged(BR.pension_community);
    }
    @Bindable
    public boolean getPension_company()
    {
        return pension_company;
    }
    public void setPension_company(boolean pension_company)
    {
        this.pension_company = pension_company;
        notifyPropertyChanged(BR.pension_company);
    }
    @Bindable
    public boolean getPension_other()
    {
        return pension_other;
    }
    public void setPension_other(boolean pension_other)
    {
        this.pension_other = pension_other;
        notifyPropertyChanged(BR.pension_other);
    }
    @Bindable
    public boolean getDrink_tap_water()
    {
        return drink_tap_water;
    }
    public void setDrink_tap_water(boolean drink_tap_water)
    {
        this.drink_tap_water = drink_tap_water;
        notifyPropertyChanged(BR.drink_tap_water);
    }
    @Bindable
    public boolean getDrink_filter_water()
    {
        return drink_filter_water;
    }
    public void setDrink_filter_water(boolean drink_filter_water)
    {
        this.drink_filter_water = drink_filter_water;
        notifyPropertyChanged(BR.drink_filter_water);
    }
    @Bindable
    public boolean getDrink_well()
    {
        return drink_well;
    }
    public void setDrink_well(boolean drink_well)
    {
        this.drink_well = drink_well;
        notifyPropertyChanged(BR.drink_well);
    }
    @Bindable
    public boolean getDrink_river()
    {
        return drink_river;
    }
    public void setDrink_river(boolean drink_river)
    {
        this.drink_river = drink_river;
        notifyPropertyChanged(BR.drink_river);
    }
    @Bindable
    public boolean getDrink_other()
    {
        return drink_other;
    }
    public void setDrink_other(boolean drink_other)
    {
        this.drink_other = drink_other;
        notifyPropertyChanged(BR.drink_other);
    }
    @Bindable
    public boolean getFuel_liquid_gas()
    {
        return fuel_liquid_gas;
    }
    public void setFuel_liquid_gas(boolean fuel_liquid_gas)
    {
        this.fuel_liquid_gas = fuel_liquid_gas;
        notifyPropertyChanged(BR.fuel_liquid_gas);
    }
    @Bindable
    public boolean getFuel_coal()
    {
        return fuel_coal;
    }
    public void setFuel_coal(boolean fuel_coal)
    {
        this.fuel_coal = fuel_coal;
        notifyPropertyChanged(BR.fuel_coal);
    }
    @Bindable
    public boolean getFuel_gas()
    {
        return fuel_gas;
    }
    public void setFuel_gas(boolean fuel_gas)
    {
        this.fuel_gas = fuel_gas;
        notifyPropertyChanged(BR.fuel_gas);
    }
    @Bindable
    public boolean getFuel_other()
    {
        return fuel_other;
    }
    public void setFuel_other(boolean fuel_other)
    {
        this.fuel_other = fuel_other;
        notifyPropertyChanged(BR.fuel_other);
    }
    @Bindable
    public boolean getKitchen_no()
    {
        return kitchen_no;
    }
    public void setKitchen_no(boolean kitchen_no)
    {
        this.kitchen_no = kitchen_no;
        notifyPropertyChanged(BR.kitchen_no);
    }
    @Bindable
    public boolean getKitchen_machine()
    {
        return kitchen_machine;
    }
    public void setKitchen_machine(boolean kitchen_machine)
    {
        this.kitchen_machine = kitchen_machine;
        notifyPropertyChanged(BR.kitchen_machine);
    }
    @Bindable
    public boolean getKitchen_fan()
    {
        return kitchen_fan;
    }
    public void setKitchen_fan(boolean kitchen_fan)
    {
        this.kitchen_fan = kitchen_fan;
        notifyPropertyChanged(BR.kitchen_fan);
    }
    @Bindable
    public boolean getKitchen_window()
    {
        return kitchen_window;
    }
    public void setKitchen_window(boolean kitchen_window)
    {
        this.kitchen_window = kitchen_window;
        notifyPropertyChanged(BR.kitchen_window);
    }
    @Bindable
    public boolean getHobby_sing()
    {
        return hobby_sing;
    }
    public void setHobby_sing(boolean hobby_sing)
    {
        this.hobby_sing = hobby_sing;
        notifyPropertyChanged(BR.hobby_sing);
    }
    @Bindable
    public boolean getHobby_dance()
    {
        return hobby_dance;
    }
    public void setHobby_dance(boolean hobby_dance)
    {
        this.hobby_dance = hobby_dance;
        notifyPropertyChanged(BR.hobby_dance);
    }
    @Bindable
    public boolean getHobby_internet()
    {
        return hobby_internet;
    }
    public void setHobby_internet(boolean hobby_internet)
    {
        this.hobby_internet = hobby_internet;
        notifyPropertyChanged(BR.hobby_internet);
    }
    @Bindable
    public boolean getHobby_cook()
    {
        return hobby_cook;
    }
    public void setHobby_cook(boolean hobby_cook)
    {
        this.hobby_cook = hobby_cook;
        notifyPropertyChanged(BR.hobby_cook);
    }
    @Bindable
    public boolean getHobby_travel()
    {
        return hobby_travel;
    }
    public void setHobby_travel(boolean hobby_travel)
    {
        this.hobby_travel = hobby_travel;
        notifyPropertyChanged(BR.hobby_travel);
    }
    @Bindable
    public boolean getHobby_chess()
    {
        return hobby_chess;
    }
    public void setHobby_chess(boolean hobby_chess)
    {
        this.hobby_chess = hobby_chess;
        notifyPropertyChanged(BR.hobby_chess);
    }
    @Bindable
    public boolean getHobby_pet()
    {
        return hobby_pet;
    }
    public void setHobby_pet(boolean hobby_pet)
    {
        this.hobby_pet = hobby_pet;
        notifyPropertyChanged(BR.hobby_pet);
    }
    @Bindable
    public boolean getHobby_fishing()
    {
        return hobby_fishing;
    }
    public void setHobby_fishing(boolean hobby_fishing)
    {
        this.hobby_fishing = hobby_fishing;
        notifyPropertyChanged(BR.hobby_fishing);
    }
    @Bindable
    public boolean getHobby_no()
    {
        return hobby_no;
    }
    public void setHobby_no(boolean hobby_no)
    {
        this.hobby_no = hobby_no;
        notifyPropertyChanged(BR.hobby_no);
    }
    @Bindable
    public boolean getHobby_other()
    {
        return hobby_other;
    }
    public void setHobby_other(boolean hobby_other)
    {
        this.hobby_other = hobby_other;
        notifyPropertyChanged(BR.hobby_other);
    }
    @Bindable
    public boolean getPet_birds()
    {
        return pet_birds;
    }
    public void setPet_birds(boolean pet_birds)
    {
        this.pet_birds = pet_birds;
        notifyPropertyChanged(BR.pet_birds);
    }
    @Bindable
    public boolean getPet_cat()
    {
        return pet_cat;
    }
    public void setPet_cat(boolean pet_cat)
    {
        this.pet_cat = pet_cat;
        notifyPropertyChanged(BR.pet_cat);
    }
    @Bindable
    public boolean getPet_dog()
    {
        return pet_dog;
    }
    public void setPet_dog(boolean pet_dog)
    {
        this.pet_dog = pet_dog;
        notifyPropertyChanged(BR.pet_dog);
    }
    @Bindable
    public boolean getPet_no()
    {
        return pet_no;
    }
    public void setPet_no(boolean pet_no)
    {
        this.pet_no = pet_no;
        notifyPropertyChanged(BR.pet_no);
    }
    @Bindable
    public boolean getPet_other()
    {
        return pet_other;
    }
    public void setPet_other(boolean pet_other)
    {
        this.pet_other = pet_other;
        notifyPropertyChanged(BR.pet_other);
    }
    @Bindable
    public boolean getCompensate_low()
    {
        return compensate_low;
    }
    public void setCompensate_low(boolean compensate_low)
    {
        this.compensate_low = compensate_low;
        notifyPropertyChanged(BR.compensate_low);
    }
    @Bindable
    public boolean getCompensate_no()
    {
        return compensate_no;
    }
    public void setCompensate_no(boolean compensate_no)
    {
        this.compensate_no = compensate_no;
        notifyPropertyChanged(BR.compensate_no);
    }
    @Bindable
    public boolean getCompensate_paid()
    {
        return compensate_paid;
    }
    public void setCompensate_paid(boolean compensate_paid)
    {
        this.compensate_paid = compensate_paid;
        notifyPropertyChanged(BR.compensate_paid);
    }
    @Bindable
    public boolean getCompensate_standard_no()
    {
        return compensate_standard_no;
    }
    public void setCompensate_standard_no(boolean compensate_standard_no)
    {
        this.compensate_standard_no = compensate_standard_no;
        notifyPropertyChanged(BR.compensate_standard_no);
    }
    @Bindable
    public boolean getCompensate_standard_threeno()
    {
        return compensate_standard_threeno;
    }
    public void setCompensate_standard_threeno(boolean compensate_standard_threeno)
    {
        this.compensate_standard_threeno = compensate_standard_threeno;
        notifyPropertyChanged(BR.compensate_standard_threeno);
    }
    @Bindable
    public boolean getCompensate_standard_eight()
    {
        return compensate_standard_eight;
    }
    public void setCompensate_standard_eight(boolean compensate_standard_eight)
    {
        this.compensate_standard_eight = compensate_standard_eight;
        notifyPropertyChanged(BR.compensate_standard_eight);
    }
    @Bindable
    public boolean getCompensate_standard_ninty()
    {
        return compensate_standard_ninty;
    }
    public void setCompensate_standard_ninty(boolean compensate_standard_ninty)
    {
        this.compensate_standard_ninty = compensate_standard_ninty;
        notifyPropertyChanged(BR.compensate_standard_ninty);
    }
    @Bindable
    public boolean getCompensate_standard_sigle_child()
    {
        return compensate_standard_sigle_child;
    }
    public void setCompensate_standard_sigle_child(boolean compensate_standard_sigle_child)
    {
        this.compensate_standard_sigle_child = compensate_standard_sigle_child;
        notifyPropertyChanged(BR.compensate_standard_sigle_child);
    }
    @Bindable
    public boolean getCompensate_standard_special_diffcult()
    {
        return compensate_standard_special_diffcult;
    }
    public void setCompensate_standard_special_diffcult(boolean compensate_standard_special_diffcult)
    {
        this.compensate_standard_special_diffcult = compensate_standard_special_diffcult;
        notifyPropertyChanged(BR.compensate_standard_special_diffcult);
    }
    @Bindable
    public boolean getCompensate_standard_five()
    {
        return compensate_standard_five;
    }
    public void setCompensate_standard_five(boolean compensate_standard_five)
    {
        this.compensate_standard_five = compensate_standard_five;
        notifyPropertyChanged(BR.compensate_standard_five);
    }
    @Bindable
    public boolean getCompensate_standard_care()
    {
        return compensate_standard_care;
    }
    public void setCompensate_standard_care(boolean compensate_standard_care)
    {
        this.compensate_standard_care = compensate_standard_care;
        notifyPropertyChanged(BR.compensate_standard_care);
    }
    @Bindable
    public boolean getCompensate_standard_disable()
    {
        return compensate_standard_disable;
    }
    public void setCompensate_standard_disable(boolean compensate_standard_disable)
    {
        this.compensate_standard_disable = compensate_standard_disable;
        notifyPropertyChanged(BR.compensate_standard_disable);
    }
    @Bindable
    public boolean getCompensate_standard_other()
    {
        return compensate_standard_other;
    }
    public void setCompensate_standard_other(boolean compensate_standard_other)
    {
        this.compensate_standard_other = compensate_standard_other;
        notifyPropertyChanged(BR.compensate_standard_other);
    }
    @Bindable
    public boolean getGovernment_grant_no()
    {
        return government_grant_no;
    }
    public void setGovernment_grant_no(boolean government_grant_no)
    {
        this.government_grant_no = government_grant_no;
        notifyPropertyChanged(BR.government_grant_no);
    }
    @Bindable
    public boolean getGovernment_grant_one()
    {
        return government_grant_one;
    }
    public void setGovernment_grant_one(boolean government_grant_one)
    {
        this.government_grant_one = government_grant_one;
        notifyPropertyChanged(BR.government_grant_one);
    }
    @Bindable
    public boolean getGovernment_grant_three()
    {
        return government_grant_three;
    }
    public void setGovernment_grant_three(boolean government_grant_three)
    {
        this.government_grant_three = government_grant_three;
        notifyPropertyChanged(BR.government_grant_three);
    }
    @Bindable
    public boolean getGovernment_grant_thousand()
    {
        return government_grant_thousand;
    }
    public void setGovernment_grant_thousand(boolean government_grant_thousand)
    {
        this.government_grant_thousand = government_grant_thousand;
        notifyPropertyChanged(BR.government_grant_thousand);
    }
    @Bindable
    public boolean getRadio_have_medical()
    {
        return radio_have_medical;
    }
    public void setRadio_have_medical(boolean radio_have_medical)
    {
        this.radio_have_medical = radio_have_medical;
        notifyPropertyChanged(BR.radio_have_medical);
    }
    @Bindable
    public boolean getRadio_no_medical()
    {
        return radio_no_medical;
    }
    public void setRadio_no_medical(boolean radio_no_medical)
    {
        this.radio_no_medical = radio_no_medical;
        notifyPropertyChanged(BR.radio_no_medical);
    }
    @Bindable
    public boolean getDrug_allergy_no()
    {
        return drug_allergy_no;
    }
    public void setDrug_allergy_no(boolean drug_allergy_no)
    {
        this.drug_allergy_no = drug_allergy_no;
        notifyPropertyChanged(BR.drug_allergy_no);
    }
    @Bindable
    public boolean getDrug_allergy_qingmeisu()
    {
        return drug_allergy_qingmeisu;
    }
    public void setDrug_allergy_qingmeisu(boolean drug_allergy_qingmeisu)
    {
        this.drug_allergy_qingmeisu = drug_allergy_qingmeisu;
        notifyPropertyChanged(BR.drug_allergy_qingmeisu);
    }
    @Bindable
    public boolean getDrug_allergy_huangan()
    {
        return drug_allergy_huangan;
    }
    public void setDrug_allergy_huangan(boolean drug_allergy_huangan)
    {
        this.drug_allergy_huangan = drug_allergy_huangan;
        notifyPropertyChanged(BR.drug_allergy_huangan);
    }
    @Bindable
    public boolean getDrug_allergy_lianmeisu()
    {
        return drug_allergy_lianmeisu;
    }
    public void setDrug_allergy_lianmeisu(boolean drug_allergy_lianmeisu)
    {
        this.drug_allergy_lianmeisu = drug_allergy_lianmeisu;
        notifyPropertyChanged(BR.drug_allergy_lianmeisu);
    }
    @Bindable
    public boolean getDrug_allergy_other()
    {
        return drug_allergy_other;
    }
    public void setDrug_allergy_other(boolean drug_allergy_other)
    {
        this.drug_allergy_other = drug_allergy_other;
        notifyPropertyChanged(BR.drug_allergy_other);
    }
    @Bindable
    public boolean getRadio_day_sleep_three()
    {
        return radio_day_sleep_three;
    }
    public void setRadio_day_sleep_three(boolean radio_day_sleep_three)
    {
        this.radio_day_sleep_three = radio_day_sleep_three;
        notifyPropertyChanged(BR.radio_day_sleep_three);
    }
    @Bindable
    public boolean getRadio_day_sleep_five()
    {
        return radio_day_sleep_five;
    }
    public void setRadio_day_sleep_five(boolean radio_day_sleep_five)
    {
        this.radio_day_sleep_five = radio_day_sleep_five;
        notifyPropertyChanged(BR.radio_day_sleep_five);
    }
    @Bindable
    public boolean getRadio_day_sleep_seven()
    {
        return radio_day_sleep_seven;
    }
    public void setRadio_day_sleep_seven(boolean radio_day_sleep_seven)
    {
        this.radio_day_sleep_seven = radio_day_sleep_seven;
        notifyPropertyChanged(BR.radio_day_sleep_seven);
    }
    @Bindable
    public boolean getRadio_day_sleep_nine()
    {
        return radio_day_sleep_nine;
    }
    public void setRadio_day_sleep_nine(boolean radio_day_sleep_nine)
    {
        this.radio_day_sleep_nine = radio_day_sleep_nine;
        notifyPropertyChanged(BR.radio_day_sleep_nine);
    }
    @Bindable
    public boolean getPsychological_feature__lonely()
    {
        return psychological_feature__lonely;
    }
    public void setPsychological_feature__lonely(boolean psychological_feature__lonely)
    {
        this.psychological_feature__lonely = psychological_feature__lonely;
        notifyPropertyChanged(BR.psychological_feature__lonely);
    }
    @Bindable
    public boolean getPsychological_feature_rely()
    {
        return psychological_feature_rely;
    }
    public void setPsychological_feature_rely(boolean psychological_feature_rely)
    {
        this.psychological_feature_rely = psychological_feature_rely;
        notifyPropertyChanged(BR.psychological_feature_rely);
    }
    @Bindable
    public boolean getPsychological_feature_angry()
    {
        return psychological_feature_angry;
    }
    public void setPsychological_feature_angry(boolean psychological_feature_angry)
    {
        this.psychological_feature_angry = psychological_feature_angry;
        notifyPropertyChanged(BR.psychological_feature_angry);
    }
    @Bindable
    public boolean getPsychological_feature_fear()
    {
        return psychological_feature_fear;
    }
    public void setPsychological_feature_fear(boolean psychological_feature_fear)
    {
        this.psychological_feature_fear = psychological_feature_fear;
        notifyPropertyChanged(BR.psychological_feature_fear);
    }
    @Bindable
    public boolean getPsychological_feature_anxious()
    {
        return psychological_feature_anxious;
    }
    public void setPsychological_feature_anxious(boolean psychological_feature_anxious)
    {
        this.psychological_feature_anxious = psychological_feature_anxious;
        notifyPropertyChanged(BR.psychological_feature_anxious);
    }
    @Bindable
    public boolean getPsychological_feature_other()
    {
        return psychological_feature_other;
    }
    public void setPsychological_feature_other(boolean psychological_feature_other)
    {
        this.psychological_feature_other = psychological_feature_other;
        notifyPropertyChanged(BR.psychological_feature_other);
    }
    @Bindable
    public boolean getRadio_occupation_one()
    {
        return radio_occupation_one;
    }
    public void setRadio_occupation_one(boolean radio_occupation_one)
    {
        this.radio_occupation_one = radio_occupation_one;
        notifyPropertyChanged(BR.radio_occupation_one);
    }
    @Bindable
    public boolean getRadio_occupation_two()
    {
        return radio_occupation_two;
    }
    public void setRadio_occupation_two(boolean radio_occupation_two)
    {
        this.radio_occupation_two = radio_occupation_two;
        notifyPropertyChanged(BR.radio_occupation_two);
    }
    @Bindable
    public boolean getRadio_occupation_three()
    {
        return radio_occupation_three;
    }
    public void setRadio_occupation_three(boolean radio_occupation_three)
    {
        this.radio_occupation_three = radio_occupation_three;
        notifyPropertyChanged(BR.radio_occupation_three);
    }
    @Bindable
    public boolean getRadio_occupation_four()
    {
        return radio_occupation_four;
    }
    public void setRadio_occupation_four(boolean radio_occupation_four)
    {
        this.radio_occupation_four = radio_occupation_four;
        notifyPropertyChanged(BR.radio_occupation_four);
    }
    @Bindable
    public boolean getRadio_occupation_five()
    {
        return radio_occupation_five;
    }
    public void setRadio_occupation_five(boolean radio_occupation_five)
    {
        this.radio_occupation_five = radio_occupation_five;
        notifyPropertyChanged(BR.radio_occupation_five);
    }
    @Bindable
    public boolean getRadio_occupation_six()
    {
        return radio_occupation_six;
    }
    public void setRadio_occupation_six(boolean radio_occupation_six)
    {
        this.radio_occupation_six = radio_occupation_six;
        notifyPropertyChanged(BR.radio_occupation_six);
    }
    @Bindable
    public boolean getRadio_occupation_seven()
    {
        return radio_occupation_seven;
    }
    public void setRadio_occupation_seven(boolean radio_occupation_seven)
    {
        this.radio_occupation_seven = radio_occupation_seven;
        notifyPropertyChanged(BR.radio_occupation_seven);
    }
    @Bindable
    public boolean getRadio_occupation_eight()
    {
        return radio_occupation_eight;
    }
    public void setRadio_occupation_eight(boolean radio_occupation_eight)
    {
        this.radio_occupation_eight = radio_occupation_eight;
        notifyPropertyChanged(BR.radio_occupation_eight);
    }
    @Bindable
    public boolean getNow_feature_no()
    {
        return now_feature_no;
    }
    public void setNow_feature_no(boolean now_feature_no)
    {
        this.now_feature_no = now_feature_no;
        notifyPropertyChanged(BR.now_feature_no);
    }
    @Bindable
    public boolean getNow_feature_headice()
    {
        return now_feature_headice;
    }
    public void setNow_feature_headice(boolean now_feature_headice)
    {
        this.now_feature_headice = now_feature_headice;
        notifyPropertyChanged(BR.now_feature_headice);
    }
    @Bindable
    public boolean getNow_feature_dizzy()
    {
        return now_feature_dizzy;
    }
    public void setNow_feature_dizzy(boolean now_feature_dizzy)
    {
        this.now_feature_dizzy = now_feature_dizzy;
        notifyPropertyChanged(BR.now_feature_dizzy);
    }
    @Bindable
    public boolean getNow_feature_xinji()
    {
        return now_feature_xinji;
    }
    public void setNow_feature_xinji(boolean now_feature_xinji)
    {
        this.now_feature_xinji = now_feature_xinji;
        notifyPropertyChanged(BR.now_feature_xinji);
    }
    @Bindable
    public boolean getNow_feature_xiongmen()
    {
        return now_feature_xiongmen;
    }
    public void setNow_feature_xiongmen(boolean now_feature_xiongmen)
    {
        this.now_feature_xiongmen = now_feature_xiongmen;
        notifyPropertyChanged(BR.now_feature_xiongmen);
    }
    @Bindable
    public boolean getNow_feature_kesou()
    {
        return now_feature_kesou;
    }
    public void setNow_feature_kesou(boolean now_feature_kesou)
    {
        this.now_feature_kesou = now_feature_kesou;
        notifyPropertyChanged(BR.now_feature_kesou);
    }
    @Bindable
    public boolean getNow_feature_ketan()
    {
        return now_feature_ketan;
    }
    public void setNow_feature_ketan(boolean now_feature_ketan)
    {
        this.now_feature_ketan = now_feature_ketan;
        notifyPropertyChanged(BR.now_feature_ketan);
    }
    @Bindable
    public boolean getNow_feature_huxikunnan()
    {
        return now_feature_huxikunnan;
    }
    public void setNow_feature_huxikunnan(boolean now_feature_huxikunnan)
    {
        this.now_feature_huxikunnan = now_feature_huxikunnan;
        notifyPropertyChanged(BR.now_feature_huxikunnan);
    }
    @Bindable
    public boolean getNow_feature_duoyin()
    {
        return now_feature_duoyin;
    }
    public void setNow_feature_duoyin(boolean now_feature_duoyin)
    {
        this.now_feature_duoyin = now_feature_duoyin;
        notifyPropertyChanged(BR.now_feature_duoyin);
    }
    @Bindable
    public boolean getNow_feature_duoniao()
    {
        return now_feature_duoniao;
    }
    public void setNow_feature_duoniao(boolean now_feature_duoniao)
    {
        this.now_feature_duoniao = now_feature_duoniao;
        notifyPropertyChanged(BR.now_feature_duoniao);
    }
    @Bindable
    public boolean getNow_feature_tizhongxiajiang()
    {
        return now_feature_tizhongxiajiang;
    }
    public void setNow_feature_tizhongxiajiang(boolean now_feature_tizhongxiajiang)
    {
        this.now_feature_tizhongxiajiang = now_feature_tizhongxiajiang;
        notifyPropertyChanged(BR.now_feature_tizhongxiajiang);
    }
    @Bindable
    public boolean getNow_feature_fali()
    {
        return now_feature_fali;
    }
    public void setNow_feature_fali(boolean now_feature_fali)
    {
        this.now_feature_fali = now_feature_fali;
        notifyPropertyChanged(BR.now_feature_fali);
    }
    @Bindable
    public boolean getNow_feature_guanjie()
    {
        return now_feature_guanjie;
    }
    public void setNow_feature_guanjie(boolean now_feature_guanjie)
    {
        this.now_feature_guanjie = now_feature_guanjie;
        notifyPropertyChanged(BR.now_feature_guanjie);
    }
    @Bindable
    public boolean getNow_feature_shili()
    {
        return now_feature_shili;
    }
    public void setNow_feature_shili(boolean now_feature_shili)
    {
        this.now_feature_shili = now_feature_shili;
        notifyPropertyChanged(BR.now_feature_shili);
    }
    @Bindable
    public boolean getNow_feature_shoujiao()
    {
        return now_feature_shoujiao;
    }
    public void setNow_feature_shoujiao(boolean now_feature_shoujiao)
    {
        this.now_feature_shoujiao = now_feature_shoujiao;
        notifyPropertyChanged(BR.now_feature_shoujiao);
    }
    @Bindable
    public boolean getNow_feature_niaoji()
    {
        return now_feature_niaoji;
    }
    public void setNow_feature_niaoji(boolean now_feature_niaoji)
    {
        this.now_feature_niaoji = now_feature_niaoji;
        notifyPropertyChanged(BR.now_feature_niaoji);
    }
    @Bindable
    public boolean getNow_feature_niaotong()
    {
        return now_feature_niaotong;
    }
    public void setNow_feature_niaotong(boolean now_feature_niaotong)
    {
        this.now_feature_niaotong = now_feature_niaotong;
        notifyPropertyChanged(BR.now_feature_niaotong);
    }
    @Bindable
    public boolean getNow_feature_bianmi()
    {
        return now_feature_bianmi;
    }
    public void setNow_feature_bianmi(boolean now_feature_bianmi)
    {
        this.now_feature_bianmi = now_feature_bianmi;
        notifyPropertyChanged(BR.now_feature_bianmi);
    }
    @Bindable
    public boolean getNow_feature_fuxie()
    {
        return now_feature_fuxie;
    }
    public void setNow_feature_fuxie(boolean now_feature_fuxie)
    {
        this.now_feature_fuxie = now_feature_fuxie;
        notifyPropertyChanged(BR.now_feature_fuxie);
    }
    @Bindable
    public boolean getNow_feature_exin()
    {
        return now_feature_exin;
    }
    public void setNow_feature_exin(boolean now_feature_exin)
    {
        this.now_feature_exin = now_feature_exin;
        notifyPropertyChanged(BR.now_feature_exin);
    }
    @Bindable
    public boolean getNow_feature_yanhua()
    {
        return now_feature_yanhua;
    }
    public void setNow_feature_yanhua(boolean now_feature_yanhua)
    {
        this.now_feature_yanhua = now_feature_yanhua;
        notifyPropertyChanged(BR.now_feature_yanhua);
    }
    @Bindable
    public boolean getNow_feature_erming()
    {
        return now_feature_erming;
    }
    public void setNow_feature_erming(boolean now_feature_erming)
    {
        this.now_feature_erming = now_feature_erming;
        notifyPropertyChanged(BR.now_feature_erming);
    }
    @Bindable
    public boolean getNow_feature_other()
    {
        return now_feature_other;
    }
    public void setNow_feature_other(boolean now_feature_other)
    {
        this.now_feature_other = now_feature_other;
        notifyPropertyChanged(BR.now_feature_other);
    }
    @Bindable
    public boolean getPre_silly_no()
    {
        return pre_silly_no;
    }
    public void setPre_silly_no(boolean pre_silly_no)
    {
        this.pre_silly_no = pre_silly_no;
        notifyPropertyChanged(BR.pre_silly_no);
    }
    @Bindable
    public boolean getPre_silly_xingweiyichang()
    {
        return pre_silly_xingweiyichang;
    }
    public void setPre_silly_xingweiyichang(boolean pre_silly_xingweiyichang)
    {
        this.pre_silly_xingweiyichang = pre_silly_xingweiyichang;
        notifyPropertyChanged(BR.pre_silly_xingweiyichang);
    }
    @Bindable
    public boolean getPre_silly_panduankunnan()
    {
        return pre_silly_panduankunnan;
    }
    public void setPre_silly_panduankunnan(boolean pre_silly_panduankunnan)
    {
        this.pre_silly_panduankunnan = pre_silly_panduankunnan;
        notifyPropertyChanged(BR.pre_silly_panduankunnan);
    }
    @Bindable
    public boolean getPre_silly_nenglijiantui()
    {
        return pre_silly_nenglijiantui;
    }
    public void setPre_silly_nenglijiantui(boolean pre_silly_nenglijiantui)
    {
        this.pre_silly_nenglijiantui = pre_silly_nenglijiantui;
        notifyPropertyChanged(BR.pre_silly_nenglijiantui);
    }
    @Bindable
    public boolean getPre_silly_jiyizhangai()
    {
        return pre_silly_jiyizhangai;
    }
    public void setPre_silly_jiyizhangai(boolean pre_silly_jiyizhangai)
    {
        this.pre_silly_jiyizhangai = pre_silly_jiyizhangai;
        notifyPropertyChanged(BR.pre_silly_jiyizhangai);
    }
    @Bindable
    public boolean getPre_silly_daizuo()
    {
        return pre_silly_daizuo;
    }
    public void setPre_silly_daizuo(boolean pre_silly_daizuo)
    {
        this.pre_silly_daizuo = pre_silly_daizuo;
        notifyPropertyChanged(BR.pre_silly_daizuo);
    }
    @Bindable
    public boolean getPre_silly_waichu()
    {
        return pre_silly_waichu;
    }
    public void setPre_silly_waichu(boolean pre_silly_waichu)
    {
        this.pre_silly_waichu = pre_silly_waichu;
        notifyPropertyChanged(BR.pre_silly_waichu);
    }
    @Bindable
    public boolean getPre_silly_lost()
    {
        return pre_silly_lost;
    }
    public void setPre_silly_lost(boolean pre_silly_lost)
    {
        this.pre_silly_lost = pre_silly_lost;
        notifyPropertyChanged(BR.pre_silly_lost);
    }
    @Bindable
    public boolean getPre_silly_other()
    {
        return pre_silly_other;
    }
    public void setPre_silly_other(boolean pre_silly_other)
    {
        this.pre_silly_other = pre_silly_other;
        notifyPropertyChanged(BR.pre_silly_other);
    }
    @Bindable
    public boolean getFamily_history_no()
    {
        return family_history_no;
    }
    public void setFamily_history_no(boolean family_history_no)
    {
        this.family_history_no = family_history_no;
        notifyPropertyChanged(BR.family_history_no);
    }
    @Bindable
    public boolean getFamily_history_gaoxueya()
    {
        return family_history_gaoxueya;
    }
    public void setFamily_history_gaoxueya(boolean family_history_gaoxueya)
    {
        this.family_history_gaoxueya = family_history_gaoxueya;
        notifyPropertyChanged(BR.family_history_gaoxueya);
    }
    @Bindable
    public boolean getFamily_history_tangniaobing()
    {
        return family_history_tangniaobing;
    }
    public void setFamily_history_tangniaobing(boolean family_history_tangniaobing)
    {
        this.family_history_tangniaobing = family_history_tangniaobing;
        notifyPropertyChanged(BR.family_history_tangniaobing);
    }
    @Bindable
    public boolean getFamily_history_guanxinbing()
    {
        return family_history_guanxinbing;
    }
    public void setFamily_history_guanxinbing(boolean family_history_guanxinbing)
    {
        this.family_history_guanxinbing = family_history_guanxinbing;
        notifyPropertyChanged(BR.family_history_guanxinbing);
    }
    @Bindable
    public boolean getFamily_history_manxingzuse()
    {
        return family_history_manxingzuse;
    }
    public void setFamily_history_manxingzuse(boolean family_history_manxingzuse)
    {
        this.family_history_manxingzuse = family_history_manxingzuse;
        notifyPropertyChanged(BR.family_history_manxingzuse);
    }
    @Bindable
    public boolean getFamily_history_xinfeijibing()
    {
        return family_history_xinfeijibing;
    }
    public void setFamily_history_xinfeijibing(boolean family_history_xinfeijibing)
    {
        this.family_history_xinfeijibing = family_history_xinfeijibing;
        notifyPropertyChanged(BR.family_history_xinfeijibing);
    }
    @Bindable
    public boolean getFamily_history_exingzhongliu()
    {
        return family_history_exingzhongliu;
    }
    public void setFamily_history_exingzhongliu(boolean family_history_exingzhongliu)
    {
        this.family_history_exingzhongliu = family_history_exingzhongliu;
        notifyPropertyChanged(BR.family_history_exingzhongliu);
    }
    @Bindable
    public boolean getFamily_history_naozuzhong()
    {
        return family_history_naozuzhong;
    }
    public void setFamily_history_naozuzhong(boolean family_history_naozuzhong)
    {
        this.family_history_naozuzhong = family_history_naozuzhong;
        notifyPropertyChanged(BR.family_history_naozuzhong);
    }
    @Bindable
    public boolean getFamily_history_jingshenbing()
    {
        return family_history_jingshenbing;
    }
    public void setFamily_history_jingshenbing(boolean family_history_jingshenbing)
    {
        this.family_history_jingshenbing = family_history_jingshenbing;
        notifyPropertyChanged(BR.family_history_jingshenbing);
    }
    @Bindable
    public boolean getFamily_history_jiehebing()
    {
        return family_history_jiehebing;
    }
    public void setFamily_history_jiehebing(boolean family_history_jiehebing)
    {
        this.family_history_jiehebing = family_history_jiehebing;
        notifyPropertyChanged(BR.family_history_jiehebing);
    }
    @Bindable
    public boolean getFamily_history_ganyan()
    {
        return family_history_ganyan;
    }
    public void setFamily_history_ganyan(boolean family_history_ganyan)
    {
        this.family_history_ganyan = family_history_ganyan;
        notifyPropertyChanged(BR.family_history_ganyan);
    }
    @Bindable
    public boolean getFamily_history_jixing()
    {
        return family_history_jixing;
    }
    public void setFamily_history_jixing(boolean family_history_jixing)
    {
        this.family_history_jixing = family_history_jixing;
        notifyPropertyChanged(BR.family_history_jixing);
    }
    @Bindable
    public boolean getFamily_history_other()
    {
        return family_history_other;
    }
    public void setFamily_history_other(boolean family_history_other)
    {
        this.family_history_other = family_history_other;
        notifyPropertyChanged(BR.family_history_other);
    }
    @Bindable
    public boolean getRadio_dinck_wine_one()
    {
        return radio_dinck_wine_one;
    }
    public void setRadio_dinck_wine_one(boolean radio_dinck_wine_one)
    {
        this.radio_dinck_wine_one = radio_dinck_wine_one;
        notifyPropertyChanged(BR.radio_dinck_wine_one);
    }
    @Bindable
    public boolean getRadio_dinck_wine_two()
    {
        return radio_dinck_wine_two;
    }
    public void setRadio_dinck_wine_two(boolean radio_dinck_wine_two)
    {
        this.radio_dinck_wine_two = radio_dinck_wine_two;
        notifyPropertyChanged(BR.radio_dinck_wine_two);
    }
    @Bindable
    public boolean getRadio_dinck_wine_three()
    {
        return radio_dinck_wine_three;
    }
    public void setRadio_dinck_wine_three(boolean radio_dinck_wine_three)
    {
        this.radio_dinck_wine_three = radio_dinck_wine_three;
        notifyPropertyChanged(BR.radio_dinck_wine_three);
    }
    @Bindable
    public boolean getRadio_eating_history_one()
    {
        return radio_eating_history_one;
    }
    public void setRadio_eating_history_one(boolean radio_eating_history_one)
    {
        this.radio_eating_history_one = radio_eating_history_one;
        notifyPropertyChanged(BR.radio_eating_history_one);
    }
    @Bindable
    public boolean getRadio_eating_history_two()
    {
        return radio_eating_history_two;
    }
    public void setRadio_eating_history_two(boolean radio_eating_history_two)
    {
        this.radio_eating_history_two = radio_eating_history_two;
        notifyPropertyChanged(BR.radio_eating_history_two);
    }
    @Bindable
    public boolean getRadio_eating_history_three()
    {
        return radio_eating_history_three;
    }
    public void setRadio_eating_history_three(boolean radio_eating_history_three)
    {
        this.radio_eating_history_three = radio_eating_history_three;
        notifyPropertyChanged(BR.radio_eating_history_three);
    }
    @Bindable
    public boolean getRadio_smoking_one()
    {
        return radio_smoking_one;
    }
    public void setRadio_smoking_one(boolean radio_smoking_one)
    {
        this.radio_smoking_one = radio_smoking_one;
        notifyPropertyChanged(BR.radio_smoking_one);
    }
    @Bindable
    public boolean getRadio_smoking_two()
    {
        return radio_smoking_two;
    }
    public void setRadio_smoking_two(boolean radio_smoking_two)
    {
        this.radio_smoking_two = radio_smoking_two;
        notifyPropertyChanged(BR.radio_smoking_two);
    }
    @Bindable
    public boolean getRadio_smoking_three()
    {
        return radio_smoking_three;
    }
    public void setRadio_smoking_three(boolean radio_smoking_three)
    {
        this.radio_smoking_three = radio_smoking_three;
        notifyPropertyChanged(BR.radio_smoking_three);
    }
    @Bindable
    public boolean getRadio_smoking_four()
    {
        return radio_smoking_four;
    }
    public void setRadio_smoking_four(boolean radio_smoking_four)
    {
        this.radio_smoking_four = radio_smoking_four;
        notifyPropertyChanged(BR.radio_smoking_four);
    }
    @Bindable
    public boolean getRadio_smoking_five()
    {
        return radio_smoking_five;
    }
    public void setRadio_smoking_five(boolean radio_smoking_five)
    {
        this.radio_smoking_five = radio_smoking_five;
        notifyPropertyChanged(BR.radio_smoking_five);
    }
    @Bindable
    public boolean getRadio_smoking_six()
    {
        return radio_smoking_six;
    }
    public void setRadio_smoking_six(boolean radio_smoking_six)
    {
        this.radio_smoking_six = radio_smoking_six;
        notifyPropertyChanged(BR.radio_smoking_six);
    }
    @Bindable
    public boolean getRadio_smoking_seven()
    {
        return radio_smoking_seven;
    }
    public void setRadio_smoking_seven(boolean radio_smoking_seven)
    {
        this.radio_smoking_seven = radio_smoking_seven;
        notifyPropertyChanged(BR.radio_smoking_seven);
    }
    @Bindable
    public boolean getRadio_smoking_eight()
    {
        return radio_smoking_eight;
    }
    public void setRadio_smoking_eight(boolean radio_smoking_eight)
    {
        this.radio_smoking_eight = radio_smoking_eight;
        notifyPropertyChanged(BR.radio_smoking_eight);
    }
    @Bindable
    public boolean getPhysical_condition_zili()
    {
        return physical_condition_zili;
    }
    public void setPhysical_condition_zili(boolean physical_condition_zili)
    {
        this.physical_condition_zili = physical_condition_zili;
        notifyPropertyChanged(BR.physical_condition_zili);
    }
    @Bindable
    public boolean getPhysical_condition_banzili()
    {
        return physical_condition_banzili;
    }
    public void setPhysical_condition_banzili(boolean physical_condition_banzili)
    {
        this.physical_condition_banzili = physical_condition_banzili;
        notifyPropertyChanged(BR.physical_condition_banzili);
    }
    @Bindable
    public boolean getPhysical_condition_banshineng()
    {
        return physical_condition_banshineng;
    }
    public void setPhysical_condition_banshineng(boolean physical_condition_banshineng)
    {
        this.physical_condition_banshineng = physical_condition_banshineng;
        notifyPropertyChanged(BR.physical_condition_banshineng);
    }
    @Bindable
    public boolean getPhysical_condition_shineng()
    {
        return physical_condition_shineng;
    }
    public void setPhysical_condition_shineng(boolean physical_condition_shineng)
    {
        this.physical_condition_shineng = physical_condition_shineng;
        notifyPropertyChanged(BR.physical_condition_shineng);
    }
    @Bindable
    public boolean getPhysical_condition_bantan()
    {
        return physical_condition_bantan;
    }
    public void setPhysical_condition_bantan(boolean physical_condition_bantan)
    {
        this.physical_condition_bantan = physical_condition_bantan;
        notifyPropertyChanged(BR.physical_condition_bantan);
    }
    @Bindable
    public boolean getPhysical_condition_tanhuan()
    {
        return physical_condition_tanhuan;
    }
    public void setPhysical_condition_tanhuan(boolean physical_condition_tanhuan)
    {
        this.physical_condition_tanhuan = physical_condition_tanhuan;
        notifyPropertyChanged(BR.physical_condition_tanhuan);
    }
    @Bindable
    public boolean getPhysical_condition_jingshencanji()
    {
        return physical_condition_jingshencanji;
    }
    public void setPhysical_condition_jingshencanji(boolean physical_condition_jingshencanji)
    {
        this.physical_condition_jingshencanji = physical_condition_jingshencanji;
        notifyPropertyChanged(BR.physical_condition_jingshencanji);
    }
    @Bindable
    public boolean getPhysical_condition_zhiticanji()
    {
        return physical_condition_zhiticanji;
    }
    public void setPhysical_condition_zhiticanji(boolean physical_condition_zhiticanji)
    {
        this.physical_condition_zhiticanji = physical_condition_zhiticanji;
        notifyPropertyChanged(BR.physical_condition_zhiticanji);
    }
    @Bindable
    public boolean getPhysical_condition_zhilicanji()
    {
        return physical_condition_zhilicanji;
    }
    public void setPhysical_condition_zhilicanji(boolean physical_condition_zhilicanji)
    {
        this.physical_condition_zhilicanji = physical_condition_zhilicanji;
        notifyPropertyChanged(BR.physical_condition_zhilicanji);
    }
    @Bindable
    public boolean getPhysical_condition_shilicanji()
    {
        return physical_condition_shilicanji;
    }
    public void setPhysical_condition_shilicanji(boolean physical_condition_shilicanji)
    {
        this.physical_condition_shilicanji = physical_condition_shilicanji;
        notifyPropertyChanged(BR.physical_condition_shilicanji);
    }
    @Bindable
    public boolean getPhysical_condition_tinglicanji()
    {
        return physical_condition_tinglicanji;
    }
    public void setPhysical_condition_tinglicanji(boolean physical_condition_tinglicanji)
    {
        this.physical_condition_tinglicanji = physical_condition_tinglicanji;
        notifyPropertyChanged(BR.physical_condition_tinglicanji);
    }
    @Bindable
    public boolean getPhysical_condition_yuyancanji()
    {
        return physical_condition_yuyancanji;
    }
    public void setPhysical_condition_yuyancanji(boolean physical_condition_yuyancanji)
    {
        this.physical_condition_yuyancanji = physical_condition_yuyancanji;
        notifyPropertyChanged(BR.physical_condition_yuyancanji);
    }
    @Bindable
    public boolean getPhysical_condition_duochongcanji()
    {
        return physical_condition_duochongcanji;
    }
    public void setPhysical_condition_duochongcanji(boolean physical_condition_duochongcanji)
    {
        this.physical_condition_duochongcanji = physical_condition_duochongcanji;
        notifyPropertyChanged(BR.physical_condition_duochongcanji);
    }
    @Bindable
    public boolean getPhysical_condition_other()
    {
        return physical_condition_other;
    }
    public void setPhysical_condition_other(boolean physical_condition_other)
    {
        this.physical_condition_other = physical_condition_other;
        notifyPropertyChanged(BR.physical_condition_other);
    }
    @Bindable
    public boolean getRadio_health_self_one()
    {
        return radio_health_self_one;
    }
    public void setRadio_health_self_one(boolean radio_health_self_one)
    {
        this.radio_health_self_one = radio_health_self_one;
        notifyPropertyChanged(BR.radio_health_self_one);
    }
    @Bindable
    public boolean getRadio_health_self_two()
    {
        return radio_health_self_two;
    }
    public void setRadio_health_self_two(boolean radio_health_self_two)
    {
        this.radio_health_self_two = radio_health_self_two;
        notifyPropertyChanged(BR.radio_health_self_two);
    }
    @Bindable
    public boolean getRadio_health_self_three()
    {
        return radio_health_self_three;
    }
    public void setRadio_health_self_three(boolean radio_health_self_three)
    {
        this.radio_health_self_three = radio_health_self_three;
        notifyPropertyChanged(BR.radio_health_self_three);
    }
    @Bindable
    public boolean getRadio_health_self_four()
    {
        return radio_health_self_four;
    }
    public void setRadio_health_self_four(boolean radio_health_self_four)
    {
        this.radio_health_self_four = radio_health_self_four;
        notifyPropertyChanged(BR.radio_health_self_four);
    }
    @Bindable
    public boolean getRadio_health_self_five()
    {
        return radio_health_self_five;
    }
    public void setRadio_health_self_five(boolean radio_health_self_five)
    {
        this.radio_health_self_five = radio_health_self_five;
        notifyPropertyChanged(BR.radio_health_self_five);
    }
    @Bindable
    public boolean getRadio_care_self_one()
    {
        return radio_care_self_one;
    }
    public void setRadio_care_self_one(boolean radio_care_self_one)
    {
        this.radio_care_self_one = radio_care_self_one;
        notifyPropertyChanged(BR.radio_care_self_one);
    }
    @Bindable
    public boolean getRadio_care_self_two()
    {
        return radio_care_self_two;
    }
    public void setRadio_care_self_two(boolean radio_care_self_two)
    {
        this.radio_care_self_two = radio_care_self_two;
        notifyPropertyChanged(BR.radio_care_self_two);
    }
    @Bindable
    public boolean getRadio_care_self_three()
    {
        return radio_care_self_three;
    }
    public void setRadio_care_self_three(boolean radio_care_self_three)
    {
        this.radio_care_self_three = radio_care_self_three;
        notifyPropertyChanged(BR.radio_care_self_three);
    }
    @Bindable
    public boolean getRadio_care_self_four()
    {
        return radio_care_self_four;
    }
    public void setRadio_care_self_four(boolean radio_care_self_four)
    {
        this.radio_care_self_four = radio_care_self_four;
        notifyPropertyChanged(BR.radio_care_self_four);
    }
    @Bindable
    public boolean getChronic_disease_no()
    {
        return chronic_disease_no;
    }
    public void setChronic_disease_no(boolean chronic_disease_no)
    {
        this.chronic_disease_no = chronic_disease_no;
        notifyPropertyChanged(BR.chronic_disease_no);
    }
    @Bindable
    public boolean getChronic_disease_gaoxueya()
    {
        return chronic_disease_gaoxueya;
    }
    public void setChronic_disease_gaoxueya(boolean chronic_disease_gaoxueya)
    {
        this.chronic_disease_gaoxueya = chronic_disease_gaoxueya;
        notifyPropertyChanged(BR.chronic_disease_gaoxueya);
    }
    @Bindable
    public boolean getChronic_disease_tangniaobing()
    {
        return chronic_disease_tangniaobing;
    }
    public void setChronic_disease_tangniaobing(boolean chronic_disease_tangniaobing)
    {
        this.chronic_disease_tangniaobing = chronic_disease_tangniaobing;
        notifyPropertyChanged(BR.chronic_disease_tangniaobing);
    }
    @Bindable
    public boolean getChronic_disease_guanxinbing()
    {
        return chronic_disease_guanxinbing;
    }
    public void setChronic_disease_guanxinbing(boolean chronic_disease_guanxinbing)
    {
        this.chronic_disease_guanxinbing = chronic_disease_guanxinbing;
        notifyPropertyChanged(BR.chronic_disease_guanxinbing);
    }
    @Bindable
    public boolean getChronic_disease_xinjigengse()
    {
        return chronic_disease_xinjigengse;
    }
    public void setChronic_disease_xinjigengse(boolean chronic_disease_xinjigengse)
    {
        this.chronic_disease_xinjigengse = chronic_disease_xinjigengse;
        notifyPropertyChanged(BR.chronic_disease_xinjigengse);
    }
    @Bindable
    public boolean getChronic_disease_xinjibing()
    {
        return chronic_disease_xinjibing;
    }
    public void setChronic_disease_xinjibing(boolean chronic_disease_xinjibing)
    {
        this.chronic_disease_xinjibing = chronic_disease_xinjibing;
        notifyPropertyChanged(BR.chronic_disease_xinjibing);
    }
    @Bindable
    public boolean getChronic_disease_zhongfeng()
    {
        return chronic_disease_zhongfeng;
    }
    public void setChronic_disease_zhongfeng(boolean chronic_disease_zhongfeng)
    {
        this.chronic_disease_zhongfeng = chronic_disease_zhongfeng;
        notifyPropertyChanged(BR.chronic_disease_zhongfeng);
    }
    @Bindable
    public boolean getChronic_disease_guzhishusong()
    {
        return chronic_disease_guzhishusong;
    }
    public void setChronic_disease_guzhishusong(boolean chronic_disease_guzhishusong)
    {
        this.chronic_disease_guzhishusong = chronic_disease_guzhishusong;
        notifyPropertyChanged(BR.chronic_disease_guzhishusong);
    }
    @Bindable
    public boolean getChronic_disease_xinlishuaijie()
    {
        return chronic_disease_xinlishuaijie;
    }
    public void setChronic_disease_xinlishuaijie(boolean chronic_disease_xinlishuaijie)
    {
        this.chronic_disease_xinlishuaijie = chronic_disease_xinlishuaijie;
        notifyPropertyChanged(BR.chronic_disease_xinlishuaijie);
    }
    @Bindable
    public boolean getChronic_disease_other()
    {
        return chronic_disease_other;
    }
    public void setChronic_disease_other(boolean chronic_disease_other)
    {
        this.chronic_disease_other = chronic_disease_other;
        notifyPropertyChanged(BR.chronic_disease_other);
    }
    @Bindable
    public boolean getExercise_no()
    {
        return exercise_no;
    }
    public void setExercise_no(boolean exercise_no)
    {
        this.exercise_no = exercise_no;
        notifyPropertyChanged(BR.exercise_no);
    }
    @Bindable
    public boolean getExercise_jujiaduanlian()
    {
        return exercise_jujiaduanlian;
    }
    public void setExercise_jujiaduanlian(boolean exercise_jujiaduanlian)
    {
        this.exercise_jujiaduanlian = exercise_jujiaduanlian;
        notifyPropertyChanged(BR.exercise_jujiaduanlian);
    }
    @Bindable
    public boolean getExercise_sanbu()
    {
        return exercise_sanbu;
    }
    public void setExercise_sanbu(boolean exercise_sanbu)
    {
        this.exercise_sanbu = exercise_sanbu;
        notifyPropertyChanged(BR.exercise_sanbu);
    }
    @Bindable
    public boolean getExercise_taijiquan()
    {
        return exercise_taijiquan;
    }
    public void setExercise_taijiquan(boolean exercise_taijiquan)
    {
        this.exercise_taijiquan = exercise_taijiquan;
        notifyPropertyChanged(BR.exercise_taijiquan);
    }
    @Bindable
    public boolean getExercise_menqiu()
    {
        return exercise_menqiu;
    }
    public void setExercise_menqiu(boolean exercise_menqiu)
    {
        this.exercise_menqiu = exercise_menqiu;
        notifyPropertyChanged(BR.exercise_menqiu);
    }
    @Bindable
    public boolean getExercise_manpao()
    {
        return exercise_manpao;
    }
    public void setExercise_manpao(boolean exercise_manpao)
    {
        this.exercise_manpao = exercise_manpao;
        notifyPropertyChanged(BR.exercise_manpao);
    }
    @Bindable
    public boolean getExercise_youyong()
    {
        return exercise_youyong;
    }
    public void setExercise_youyong(boolean exercise_youyong)
    {
        this.exercise_youyong = exercise_youyong;
        notifyPropertyChanged(BR.exercise_youyong);
    }
    @Bindable
    public boolean getExercise_jianshen()
    {
        return exercise_jianshen;
    }
    public void setExercise_jianshen(boolean exercise_jianshen)
    {
        this.exercise_jianshen = exercise_jianshen;
        notifyPropertyChanged(BR.exercise_jianshen);
    }
    @Bindable
    public boolean getExercise_other()
    {
        return exercise_other;
    }
    public void setExercise_other(boolean exercise_other)
    {
        this.exercise_other = exercise_other;
        notifyPropertyChanged(BR.exercise_other);
    }
    @Bindable
    public boolean getOnline_type__no()
    {
        return online_type__no;
    }
    public void setOnline_type__no(boolean online_type__no)
    {
        this.online_type__no = online_type__no;
        notifyPropertyChanged(BR.online_type__no);
    }
    @Bindable
    public boolean getOnline_type_diannao()
    {
        return online_type_diannao;
    }
    public void setOnline_type_diannao(boolean online_type_diannao)
    {
        this.online_type_diannao = online_type_diannao;
        notifyPropertyChanged(BR.online_type_diannao);
    }
    @Bindable
    public boolean getOnline_type_shouji()
    {
        return online_type_shouji;
    }
    public void setOnline_type_shouji(boolean online_type_shouji)
    {
        this.online_type_shouji = online_type_shouji;
        notifyPropertyChanged(BR.online_type_shouji);
    }
    @Bindable
    public boolean getOnline_type_pingban()
    {
        return online_type_pingban;
    }
    public void setOnline_type_pingban(boolean online_type_pingban)
    {
        this.online_type_pingban = online_type_pingban;
        notifyPropertyChanged(BR.online_type_pingban);
    }
    @Bindable
    public boolean getOnline_type_other()
    {
        return online_type_other;
    }
    public void setOnline_type_other(boolean online_type_other)
    {
        this.online_type_other = online_type_other;
        notifyPropertyChanged(BR.online_type_other);
    }
    @Bindable
    public boolean getOnline_goal_youxi()
    {
        return online_goal_youxi;
    }
    public void setOnline_goal_youxi(boolean online_goal_youxi)
    {
        this.online_goal_youxi = online_goal_youxi;
        notifyPropertyChanged(BR.online_goal_youxi);
    }
    @Bindable
    public boolean getOnline_goal_shipin()
    {
        return online_goal_shipin;
    }
    public void setOnline_goal_shipin(boolean online_goal_shipin)
    {
        this.online_goal_shipin = online_goal_shipin;
        notifyPropertyChanged(BR.online_goal_shipin);
    }
    @Bindable
    public boolean getOnline_goal_liaotian()
    {
        return online_goal_liaotian;
    }
    public void setOnline_goal_liaotian(boolean online_goal_liaotian)
    {
        this.online_goal_liaotian = online_goal_liaotian;
        notifyPropertyChanged(BR.online_goal_liaotian);
    }
    @Bindable
    public boolean getOnline_goal_yule()
    {
        return online_goal_yule;
    }
    public void setOnline_goal_yule(boolean online_goal_yule)
    {
        this.online_goal_yule = online_goal_yule;
        notifyPropertyChanged(BR.online_goal_yule);
    }
    @Bindable
    public boolean getOnline_goal_ruanjian()
    {
        return online_goal_ruanjian;
    }
    public void setOnline_goal_ruanjian(boolean online_goal_ruanjian)
    {
        this.online_goal_ruanjian = online_goal_ruanjian;
        notifyPropertyChanged(BR.online_goal_ruanjian);
    }
    @Bindable
    public boolean getOnline_goal_xiazai()
    {
        return online_goal_xiazai;
    }
    public void setOnline_goal_xiazai(boolean online_goal_xiazai)
    {
        this.online_goal_xiazai = online_goal_xiazai;
        notifyPropertyChanged(BR.online_goal_xiazai);
    }
    @Bindable
    public boolean getOnline_goal_xiangguanzixun()
    {
        return online_goal_xiangguanzixun;
    }
    public void setOnline_goal_xiangguanzixun(boolean online_goal_xiangguanzixun)
    {
        this.online_goal_xiangguanzixun = online_goal_xiangguanzixun;
        notifyPropertyChanged(BR.online_goal_xiangguanzixun);
    }
    @Bindable
    public boolean getOnline_goal_other()
    {
        return online_goal_other;
    }
    public void setOnline_goal_other(boolean online_goal_other)
    {
        this.online_goal_other = online_goal_other;
        notifyPropertyChanged(BR.online_goal_other);
    }
    @Bindable
    public boolean getHousekeeping_dasaoweisheng()
    {
        return housekeeping_dasaoweisheng;
    }
    public void setHousekeeping_dasaoweisheng(boolean housekeeping_dasaoweisheng)
    {
        this.housekeeping_dasaoweisheng = housekeeping_dasaoweisheng;
        notifyPropertyChanged(BR.housekeeping_dasaoweisheng);
    }
    @Bindable
    public boolean getHousekeeping_banjia()
    {
        return housekeeping_banjia;
    }
    public void setHousekeeping_banjia(boolean housekeeping_banjia)
    {
        this.housekeeping_banjia = housekeeping_banjia;
        notifyPropertyChanged(BR.housekeeping_banjia);
    }
    @Bindable
    public boolean getHousekeeping_baomu()
    {
        return housekeeping_baomu;
    }
    public void setHousekeeping_baomu(boolean housekeeping_baomu)
    {
        this.housekeeping_baomu = housekeeping_baomu;
        notifyPropertyChanged(BR.housekeeping_baomu);
    }
    @Bindable
    public boolean getHousekeeping_qingxijiaju()
    {
        return housekeeping_qingxijiaju;
    }
    public void setHousekeeping_qingxijiaju(boolean housekeeping_qingxijiaju)
    {
        this.housekeeping_qingxijiaju = housekeeping_qingxijiaju;
        notifyPropertyChanged(BR.housekeeping_qingxijiaju);
    }
    @Bindable
    public boolean getHousekeeping_shutongxiashuidao()
    {
        return housekeeping_shutongxiashuidao;
    }
    public void setHousekeeping_shutongxiashuidao(boolean housekeeping_shutongxiashuidao)
    {
        this.housekeeping_shutongxiashuidao = housekeeping_shutongxiashuidao;
        notifyPropertyChanged(BR.housekeeping_shutongxiashuidao);
    }
    @Bindable
    public boolean getHousekeeping_wuxuqiu()
    {
        return housekeeping_wuxuqiu;
    }
    public void setHousekeeping_wuxuqiu(boolean housekeeping_wuxuqiu)
    {
        this.housekeeping_wuxuqiu = housekeeping_wuxuqiu;
        notifyPropertyChanged(BR.housekeeping_wuxuqiu);
    }
    @Bindable
    public boolean getHousekeeping_other()
    {
        return housekeeping_other;
    }
    public void setHousekeeping_other(boolean housekeeping_other)
    {
        this.housekeeping_other = housekeeping_other;
        notifyPropertyChanged(BR.housekeeping_other);
    }
    @Bindable
    public boolean getLife_request_no()
    {
        return life_request_no;
    }
    public void setLife_request_no(boolean life_request_no)
    {
        this.life_request_no = life_request_no;
        notifyPropertyChanged(BR.life_request_no);
    }
    @Bindable
    public boolean getLife_request_yaopinpeisong()
    {
        return life_request_yaopinpeisong;
    }
    public void setLife_request_yaopinpeisong(boolean life_request_yaopinpeisong)
    {
        this.life_request_yaopinpeisong = life_request_yaopinpeisong;
        notifyPropertyChanged(BR.life_request_yaopinpeisong);
    }
    @Bindable
    public boolean getLife_request_ruyongpinpeisong()
    {
        return life_request_ruyongpinpeisong;
    }
    public void setLife_request_ruyongpinpeisong(boolean life_request_ruyongpinpeisong)
    {
        this.life_request_ruyongpinpeisong = life_request_ruyongpinpeisong;
        notifyPropertyChanged(BR.life_request_ruyongpinpeisong);
    }
    @Bindable
    public boolean getLife_request_niuyangnai()
    {
        return life_request_niuyangnai;
    }
    public void setLife_request_niuyangnai(boolean life_request_niuyangnai)
    {
        this.life_request_niuyangnai = life_request_niuyangnai;
        notifyPropertyChanged(BR.life_request_niuyangnai);
    }
    @Bindable
    public boolean getLife_request_dangao()
    {
        return life_request_dangao;
    }
    public void setLife_request_dangao(boolean life_request_dangao)
    {
        this.life_request_dangao = life_request_dangao;
        notifyPropertyChanged(BR.life_request_dangao);
    }
    @Bindable
    public boolean getLife_request_lifa()
    {
        return life_request_lifa;
    }
    public void setLife_request_lifa(boolean life_request_lifa)
    {
        this.life_request_lifa = life_request_lifa;
        notifyPropertyChanged(BR.life_request_lifa);
    }
    @Bindable
    public boolean getLife_request_canyinpeisong()
    {
        return life_request_canyinpeisong;
    }
    public void setLife_request_canyinpeisong(boolean life_request_canyinpeisong)
    {
        this.life_request_canyinpeisong = life_request_canyinpeisong;
        notifyPropertyChanged(BR.life_request_canyinpeisong);
    }
    @Bindable
    public boolean getLife_request_other()
    {
        return life_request_other;
    }
    public void setLife_request_other(boolean life_request_other)
    {
        this.life_request_other = life_request_other;
        notifyPropertyChanged(BR.life_request_other);
    }
    @Bindable
    public boolean getMedicine_request_peizhen()
    {
        return medicine_request_peizhen;
    }
    public void setMedicine_request_peizhen(boolean medicine_request_peizhen)
    {
        this.medicine_request_peizhen = medicine_request_peizhen;
        notifyPropertyChanged(BR.medicine_request_peizhen);
    }
    @Bindable
    public boolean getMedicine_request_tijian()
    {
        return medicine_request_tijian;
    }
    public void setMedicine_request_tijian(boolean medicine_request_tijian)
    {
        this.medicine_request_tijian = medicine_request_tijian;
        notifyPropertyChanged(BR.medicine_request_tijian);
    }
    @Bindable
    public boolean getMedicine_request_shangmenkangfu()
    {
        return medicine_request_shangmenkangfu;
    }
    public void setMedicine_request_shangmenkangfu(boolean medicine_request_shangmenkangfu)
    {
        this.medicine_request_shangmenkangfu = medicine_request_shangmenkangfu;
        notifyPropertyChanged(BR.medicine_request_shangmenkangfu);
    }
    @Bindable
    public boolean getMedicine_request_shangmenhuli()
    {
        return medicine_request_shangmenhuli;
    }
    public void setMedicine_request_shangmenhuli(boolean medicine_request_shangmenhuli)
    {
        this.medicine_request_shangmenhuli = medicine_request_shangmenhuli;
        notifyPropertyChanged(BR.medicine_request_shangmenhuli);
    }
    @Bindable
    public boolean getMedicine_request_shangmenliliao()
    {
        return medicine_request_shangmenliliao;
    }
    public void setMedicine_request_shangmenliliao(boolean medicine_request_shangmenliliao)
    {
        this.medicine_request_shangmenliliao = medicine_request_shangmenliliao;
        notifyPropertyChanged(BR.medicine_request_shangmenliliao);
    }
    @Bindable
    public boolean getMedicine_request_wuxuqiu()
    {
        return medicine_request_wuxuqiu;
    }
    public void setMedicine_request_wuxuqiu(boolean medicine_request_wuxuqiu)
    {
        this.medicine_request_wuxuqiu = medicine_request_wuxuqiu;
        notifyPropertyChanged(BR.medicine_request_wuxuqiu);
    }
    @Bindable
    public boolean getMedicine_request_other()
    {
        return medicine_request_other;
    }
    public void setMedicine_request_other(boolean medicine_request_other)
    {
        this.medicine_request_other = medicine_request_other;
        notifyPropertyChanged(BR.medicine_request_other);
    }
    @Bindable
    public boolean getRadio_phone_call_yes()
    {
        return radio_phone_call_yes;
    }
    public void setRadio_phone_call_yes(boolean radio_phone_call_yes)
    {
        this.radio_phone_call_yes = radio_phone_call_yes;
        notifyPropertyChanged(BR.radio_phone_call_yes);
    }
    @Bindable
    public boolean getRadiophone_call_no()
    {
        return radiophone_call_no;
    }
    public void setRadiophone_call_no(boolean radiophone_call_no)
    {
        this.radiophone_call_no = radiophone_call_no;
        notifyPropertyChanged(BR.radiophone_call_no);
    }

}
