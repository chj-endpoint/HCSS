package com.chx.hcss;

import android.util.JsonReader;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by win7 on 2018/5/2.
 */
public class DataManager {
    private static final String HCSS_URL = "http://47.100.167.153/api/";
    public Elder QueryElderById(long id){
        Elder elder = new Elder();
        HashMap<String, String> paras = new HashMap<>();
        paras.put("id", String.valueOf(id));
        String url = HCSS_URL + "elderinfo/GetById";
        String response = HttpHelper.httpGet(url, paras);
//        Gson gson = new Gson();
        return elder;
    }
}
