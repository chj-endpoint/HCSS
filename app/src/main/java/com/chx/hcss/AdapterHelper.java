package com.chx.hcss;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2018/3/6.
 */

public abstract class AdapterHelper<T> extends RecyclerView.Adapter<RViewHolder> {

    private ArrayList<T> mData;
    private int mLayoutId;
    public Context mContext;
    private static final int EMPTY_VIEW = 0;
    private static final int QUERY_VIEW = 1;
    private static final int REFUSH_VIEW = 2;
    private static final int LOADMORE_VIEW = 3;
    private static final int ITEM_VIEW = 4;
    private OnItemClickListener mOnItemClickListener;


    public AdapterHelper(Context context, int layoutId) {
        mLayoutId = layoutId;
        mContext = context;
    }

    @Override
    public int getItemViewType(int position) {
        if(mData.size() == 0){
            return EMPTY_VIEW;
        }
        if(position == 0){
            return QUERY_VIEW;
        } else {
            return ITEM_VIEW;
        }
    }

    @Override
    public RViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // 实例化viewholder
        RViewHolder viewHolder;
        switch (viewType) {
            case QUERY_VIEW:
                viewHolder = RViewHolder.getHolder(mContext, parent, R.layout.list_query);
                break;
            case ITEM_VIEW:
                viewHolder = RViewHolder.getHolder(mContext, parent, R.layout.list_item);
                break;
            default:
                viewHolder = RViewHolder.getHolder(mContext, parent, mLayoutId);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RViewHolder holder, final int position) {
        // 绑定数据
        bindView(holder, mData.get(position));
        if( mOnItemClickListener!= null && position > 0){
            holder.itemView.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(position);
                }
            });
            holder.itemView.setOnLongClickListener( new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mOnItemClickListener.onItemLongClick(position);
                    return false;
                }
            });
        }
    }

    public abstract void bindView(RViewHolder holder, T data);

    public interface OnItemClickListener{
        void onItemClick(int position);
        void onItemLongClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener onItemClickListener ){
        mOnItemClickListener = onItemClickListener;
    }


    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    public void setData(ArrayList<T> data){
        mData = data;
        notifyDataSetChanged();
    }

    public void addData(ArrayList<T> data){
        mData.addAll(data);
        notifyDataSetChanged();
    }

    public T getData(int position){
        return mData.get(position);
    }
}

