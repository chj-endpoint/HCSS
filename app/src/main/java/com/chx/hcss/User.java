package com.chx.hcss;

import android.content.Context;
import android.content.Intent;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
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

    //初始化RecyclerView
    private void initView() {
        mListRecyclerView = (RecyclerView) findViewById(R.id.list_view);
        // 设置布局管理器
        mListRecyclerView.setLayoutManager(mLayoutManager);
        //添加Android自带的分割线
        mListRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        // 设置adapter
        mListRecyclerView.setAdapter(mRecyclerAdapter);
    }

    private void initAdapter() {
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerAdapter = new AdapterHelper<ElderInfo>(this, R.layout.list_item){

            @Override
            public void bindView(RViewHolder holder, ElderInfo data) {
                int viewType = holder.getItemViewType();
                switch (viewType) {
                    case QUERY_VIEW:
                        initQueryView(holder, mContext);
                        break;
                    case ITEM_VIEW:
                        bindItemView(holder, data);
                        break;
                    default:
                        break;
                }
            }
        };

        mRecyclerAdapter.setOnItemClickListener(new AdapterHelper.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                ElderInfo clickData = (ElderInfo)mRecyclerAdapter.getData(position);
                Intent intentEdit = new Intent(User.this, EditActivity.class);
                intentEdit.putExtra("id", clickData.getId());
                startActivity(intentEdit);
            }
            @Override
            public void onItemLongClick(int position) {

            }
        });

        ArrayList<ElderInfo> itemList = new ArrayList<ElderInfo>();
        ElderInfo item = new ElderInfo();
        item.setName("Query View");
        itemList.add(item);
        mRecyclerAdapter.setData(itemList);
    }

    private void clearScrollListener() {
        mListRecyclerView.clearOnScrollListeners();
        // 设置上滑加载更多监控
        mListRecyclerView.addOnScrollListener(new RUpScrollListener(mLayoutManager) {

            @Override
            public void onLoadMore(int nextPageIndex) {
                ArrayList<ElderInfo> itemList = queryData(nextPageIndex);
                if (itemList.isEmpty()) {
                    setIsLoadComplete(true);
                } else {
                    mRecyclerAdapter.addData(itemList);
                }
            }
        });
    }

    private void initQueryView(RViewHolder holder, Context context){
        if (mSpinnerStreet == null) {
            String[] streets = {"街道1", "街道2", "街道3", "街道4"};
            ArrayAdapter streetAdapter = new ArrayAdapter(context, R.layout.support_simple_spinner_dropdown_item, streets);
            mSpinnerStreet = holder.getView(R.id.spiStreet);
            mSpinnerStreet.setAdapter(streetAdapter);

            String[] communities = {"社区1", "社区2", "社区3", "社区4"};
            ArrayAdapter communitiyAdapter = new ArrayAdapter(context, R.layout.support_simple_spinner_dropdown_item, communities);
            mSpinnerCommunity  = holder.getView(R.id.spiCommunity);
            mSpinnerCommunity.setAdapter(communitiyAdapter);

            String[] villages = {"小区1", "小区2", "小区3", "小区4"};
            ArrayAdapter villageAdapter = new ArrayAdapter(context, R.layout.support_simple_spinner_dropdown_item, villages);
            mSpinnerVillage = holder.getView(R.id.spiVillage);
            mSpinnerVillage.setAdapter(villageAdapter);

            mTVName = holder.getView(R.id.editName);
        }
    }

    //查询按钮点击事件
    public void queryClick(View view) {
        clearScrollListener();
        String street = mSpinnerStreet.getSelectedItem().toString();
        String community = mSpinnerCommunity.getSelectedItem().toString();
        String village = mSpinnerVillage.getSelectedItem().toString();
        String name = mTVName.getText().toString();
        //查询按钮按下
        mRecyclerAdapter.setData(queryData(0));
    }
    //查询数据
    private ArrayList<ElderInfo> queryData(int pageIndex){
        ArrayList<ElderInfo> itemList = new ArrayList<ElderInfo>();
        if (pageIndex > 3) {
            return itemList;
        }
        if (pageIndex == 0) {
            ElderInfo item = new ElderInfo();
            item.setName("Query View");
            itemList.add(item);
        }
        for (int i = 0; i < 20; i++) {
            ElderInfo item = new ElderInfo();
            item.setId(20 * pageIndex + i);
            item.setName("李连杰" + (20 * pageIndex + i));
            item.setGender("男");
            item.setAge(50);
            item.setAddress("厦门大学白城社区23#501");
            itemList.add(item);
        }
        return itemList;
    }

    private void bindItemView(RViewHolder holder, ElderInfo data){
        holder.setTextView(R.id.item_name, data.getName());
        holder.setTextView(R.id.item_gender, data.getGender());
        holder.setTextView(R.id.item_age, data.getAge() > 0 ? (data.getAge() + "岁") : "未知");
        holder.setTextView(R.id.item_address, data.getAddress());
    }

}
