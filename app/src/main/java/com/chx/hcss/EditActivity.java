package com.chx.hcss;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chx.hcss.databinding.ActivityEditBinding;
import com.google.gson.Gson;

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

        new Thread(new Runnable(){
            @Override
            public void run() {
                DataManager dataManager = new DataManager();
                Elder elder = new Elder();
                elder = dataManager.QueryElderById(id);
                elderInfo = new ElderInfo();
                Gson gson = new Gson();
                elderInfo = gson.fromJson(elder.getExtInfo(), ElderInfo.class);
                editBinding.setElder(elderInfo);
            }
        }).start();

//        TextView tv = findViewById(R.id.title);
//        tv.setText(Long.toString(id));
    }

    //查询按钮点击事件
    public void queryClick(View view) {
        String address = elderInfo.getLocal_address();
    }
}
