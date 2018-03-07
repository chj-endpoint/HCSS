package com.chx.hcss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;

public class User extends AppCompatActivity {
    private Button mReturnButton;
    private RecyclerView mListRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        mReturnButton = (Button)findViewById(R.id.returnback);
    }
    public void back_to_login(View view) {
        //setContentView(R.layout.login);
        Intent intent3 = new Intent(User.this,Login.class) ;
        startActivity(intent3);
        finish();
    }

    private void initData() {
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerAdapter = new AdapterHelper<UserData>(this, R.layout.list_item, queryData()){

            @Override
            public void bindView(RViewHolder holder, UserData data) {
                holder.setTextView(R.id.list_elder, data.getUserName());
            }
        };
    }

    private void initView() {
        mListRecyclerView = (RecyclerView) findViewById(R.id.list_view);
        // 设置布局管理器
        mListRecyclerView.setLayoutManager(mLayoutManager);
        // 设置adapter
        mListRecyclerView.setAdapter(mRecyclerAdapter);
    }
    private ArrayList<UserData> queryData(){
        ArrayList<UserData> itemList = new ArrayList<UserData>();
        for (int i = 0; i < 20; i++) {
            UserData item = new UserData("我的名字" + i, "abc");
            itemList.add(item);
        }
        return itemList;
    }
}
