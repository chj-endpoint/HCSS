package com.chx.hcss;

import android.content.Intent;
import android.support.v4.widget.NestedScrollView;
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
    private LinearLayoutManager mLayoutManager;
    private AdapterHelper mRecyclerAdapter;
    private NestedScrollView mNestedScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        initAdapter();
        initView();
    }
    public void queryClick(View view) {
        //查询按钮按下
        mListRecyclerView.clearOnScrollListeners();
        // 设置上滑加载更多监控
        mListRecyclerView.addOnScrollListener(new RUpScrollListener(mLayoutManager) {

            @Override
            public void onLoadMore(int nextPageIndex) {
                ArrayList<UserData> itemList = queryData(nextPageIndex);
                if (itemList.isEmpty()) {
                    setIsLoadComplete(true);
                } else {
                    mRecyclerAdapter.addData(itemList);
                }
            }
        });
        mRecyclerAdapter.setData(queryData(0));
    }

    private void initAdapter() {
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerAdapter = new AdapterHelper<UserData>(this, R.layout.list_item){

            @Override
            public void bindView(RViewHolder holder, UserData data) {
                holder.setTextView(R.id.list_elder, data.getUserName());
            }
        };
    }

    private void initView() {
        mNestedScrollView = (NestedScrollView) findViewById(R.id.scroll_list_view);
        mListRecyclerView = (RecyclerView) findViewById(R.id.list_view);
        // 设置布局管理器
        mListRecyclerView.setLayoutManager(mLayoutManager);
        // 设置adapter
        mListRecyclerView.setAdapter(mRecyclerAdapter);
    }
    private ArrayList<UserData> queryData(int pageIndex){
        ArrayList<UserData> itemList = new ArrayList<UserData>();
        if (pageIndex > 3) {
            return itemList;
        }
        for (int i = 0; i < 20; i++) {
            UserData item = new UserData("我的名字" + (20 * pageIndex + i), "abc");
            itemList.add(item);
        }
        return itemList;
    }
}
