package com.chx.hcss;

import android.util.JsonReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by win7 on 2018/5/2.
 */
public class DataManager {
    private static final String HCSS_URL = "http://47.100.167.153/api/";
    public Elder queryElderById(long id){
        Elder elder = new Elder();
        HashMap<String, String> paras = new HashMap<>();
        paras.put("id", String.valueOf(id));
        String url = HCSS_URL + "ElderInfo/GetById";
        String response = HttpHelper.httpGet(url, paras);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        elder = gson.fromJson(response, Elder.class);
        return elder;
    }

    public String saveOupdateElder(Elder elder){
        String url = HCSS_URL + "ElderInfo/";
        if(elder.getId() > 0){
            url += "UpdateElder";
        }
        else {
            url += "InsertElder";
        }
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        String jsonElder = gson.toJson(elder);
        String response = HttpHelper.httpPostJson(url, jsonElder);
        return response;
    }
}
