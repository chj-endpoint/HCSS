package com.chx.hcss;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2018/3/6.
 */

public abstract class AdapterHelper<T> extends RecyclerView.Adapter<RViewHolder> {

    private ArrayList<T> mData;
    private int mLayoutId;
    private Context mContext;

    public AdapterHelper(Context context, int layoutId, ArrayList<T> data) {
        mData = data;
        mLayoutId = layoutId;
        mContext = context;
    }

    @Override
    public RViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // 实例化viewholder
        RViewHolder viewHolder = RViewHolder.getHolder(mContext, parent, mLayoutId);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RViewHolder holder, int position) {
        // 绑定数据
        bindView(holder, mData.get(position));
    }

    public abstract void bindView(RViewHolder holder, T data);

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }
}

