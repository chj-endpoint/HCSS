package com.chx.hcss;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chx.hcss.databinding.ActivityEditBinding;

public class EditActivity extends AppCompatActivity {

    private ActivityEditBinding editBinding;
    private ElderInfo elder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        editBinding = DataBindingUtil.setContentView(this, R.layout.activity_edit);

        Intent intentEdit = getIntent();
        long id = intentEdit.getLongExtra("id", 0);



        elder = new ElderInfo();
        elder.setId(110);
        elder.setLocal_address("XiaMen University");
        elder.setName("俞飞鸿");
        editBinding.setElder(elder);


//        TextView tv = findViewById(R.id.title);
//        tv.setText(Long.toString(id));
    }

    //查询按钮点击事件
    public void queryClick(View view) {
        String address = elder.getLocal_address();
    }
}
