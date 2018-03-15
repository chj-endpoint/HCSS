package com.chx.hcss;

import android.content.Intent;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class User extends AppCompatActivity {
    private static final int EMPTY_VIEW = 0;
    private static final int QUERY_VIEW = 1;
    private static final int REFUSH_VIEW = 2;
    private static final int LOADMORE_VIEW = 3;
    private static final int ITEM_VIEW = 4;
    private Button mReturnButton;
    private RecyclerView mListRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private AdapterHelper mRecyclerAdapter;
    Spinner mSpinnerStreet, mSpinnerCommunity, mSpinnerVillage;
    TextView mTVName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        initAdapter();
        initView();
    }
    public void queryClick(View view) {
        clearScrollListener();
        String street = mSpinnerStreet.getSelectedItem().toString();
        String community = mSpinnerCommunity.getSelectedItem().toString();
        String village = mSpinnerVillage.getSelectedItem().toString();
        String name = mTVName.getText().toString();
        //查询按钮按下
        mRecyclerAdapter.setData(queryData(0));
    }

    public void spinnerClick(View view) {
        if (mSpinnerStreet == null) {
            mSpinnerStreet = (Spinner)findViewById(R.id.spiStreet);
            mSpinnerCommunity = (Spinner)findViewById(R.id.spiCommunity);
            mSpinnerVillage = (Spinner)findViewById(R.id.spiVillage);
        }
        int viewId = view.getId();

        switch (viewId) {
            case R.id.spiStreet:
                String[] streets = {"街道1", "街道2", "街道3", "街道4"};
                ArrayAdapter streetAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, streets);
                mSpinnerStreet.setAdapter(streetAdapter);
                String[] communities = {"社区1", "社区2", "社区3", "社区4"};
                ArrayAdapter communitiyAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, communities);
                mSpinnerStreet.setAdapter(communitiyAdapter);

                break;
            case R.id.spiCommunity:
                String[] villages = {"小区1", "小区2", "小区3", "小区4"};
                ArrayAdapter villageAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, villages);
                mSpinnerStreet.setAdapter(villageAdapter);
                break;
            case R.id.spiVillage:

                break;
                default:
                    break;
        }
    }

    private void initAdapter() {
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerAdapter = new AdapterHelper<UserData>(this, R.layout.list_item){

            @Override
            public void bindView(RViewHolder holder, UserData data) {
                int viewType = holder.getItemViewType();
                switch (viewType) {
                    case QUERY_VIEW:
                        if (mSpinnerStreet == null) {
                            String[] streets = {"街道1", "街道2", "街道3", "街道4"};
                            ArrayAdapter streetAdapter = new ArrayAdapter(mContext, R.layout.support_simple_spinner_dropdown_item, streets);
                            mSpinnerStreet = holder.getView(R.id.spiStreet);
                            mSpinnerStreet.setAdapter(streetAdapter);

                            String[] communities = {"社区1", "社区2", "社区3", "社区4"};
                            ArrayAdapter communitiyAdapter = new ArrayAdapter(mContext, R.layout.support_simple_spinner_dropdown_item, communities);
                            mSpinnerCommunity  = holder.getView(R.id.spiCommunity);
                            mSpinnerCommunity.setAdapter(communitiyAdapter);

                            String[] villages = {"小区1", "小区2", "小区3", "小区4"};
                            ArrayAdapter villageAdapter = new ArrayAdapter(mContext, R.layout.support_simple_spinner_dropdown_item, villages);
                            mSpinnerVillage = holder.getView(R.id.spiVillage);
                            mSpinnerVillage.setAdapter(villageAdapter);

                            mTVName = holder.getView(R.id.editName);
                        }
                        break;
                    case ITEM_VIEW:
                        holder.setTextView(R.id.list_elder, data.getUserName());
                        break;
                    default:
                        break;
                }
            }
        };
        ArrayList<UserData> itemList = new ArrayList<UserData>();
        UserData item = new UserData("查询项", "abc");
        itemList.add(item);
        mRecyclerAdapter.setData(itemList);
    }

    private void initView() {
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
        if (pageIndex == 0) {
            UserData item = new UserData("查询项", "abc");
            itemList.add(item);
        }
        for (int i = 0; i < 20; i++) {
            UserData item = new UserData("我的名字" + (20 * pageIndex + i), "abc");
            itemList.add(item);
        }
        return itemList;
    }

    private void clearScrollListener() {
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
    }

}
