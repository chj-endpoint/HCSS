package com.chx.hcss;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.chx.hcss.databinding.ActivityEditBinding;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EditActivity extends AppCompatActivity {

    private ActivityEditBinding editBinding;
    private ElderInfo elderInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        editBinding = DataBindingUtil.setContentView(this, R.layout.activity_edit);

        Intent intentEdit = getIntent();
        final long id = intentEdit.getLongExtra("id", 0);
        //新增
        if (id <= 0) {
            elderInfo = new ElderInfo();
            editBinding.setElder(elderInfo);
        }
        else
        {
            new Thread(new Runnable(){
                @Override
                public void run() {
                    DataManager dataManager = new DataManager();
                    Elder elder = new Elder();
                    elder = dataManager.queryElderById(id);
                    elderInfo = new ElderInfo();
                    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
                    elderInfo = gson.fromJson(elder.getExtInfo(), ElderInfo.class);
                    if (elderInfo == null) {
                        elderInfo = new ElderInfo();
                    }
                    elderInfo.setId(elder.getId());
                    editBinding.setElder(elderInfo);
                }
            }).start();
        }

//        TextView tv = findViewById(R.id.title);
//        tv.setText(Long.toString(id));
    }

    //查询按钮点击事件
    public void submitClick(View view) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        final String elderInfoJson = gson.toJson(elderInfo, ElderInfo.class);
        new Thread(new Runnable(){
            @Override
            public void run() {
                DataManager dataManager = new DataManager();
                Elder elder = new Elder();
                elder.setId(elderInfo.getId());
                elder.setName(elderInfo.getName());
                elder.setVillage(elderInfo.getVallage());
                elder.setStreet(elderInfo.getLocal_address());
                elder.setExtInfo(elderInfoJson);
                String response = dataManager.saveOupdateElder(elder);
                Gson gsonResult = new Gson();
                Result result = gsonResult.fromJson(response, Result.class);
                if(result != null && result.isOk()){
//                    Intent intent = new Intent(EditActivity.this,QueryActivity.class) ;
//                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(EditActivity.this, result.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        }).start();




    }
}
