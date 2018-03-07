package com.chx.hcss;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RViewHolder extends RecyclerView.ViewHolder {
    private View mConvertView;
    private SparseArray mViews;
    public RViewHolder(View itemView) {
        super(itemView);
        mConvertView = itemView;
        mViews = new SparseArray<View>();
    }

    public static RViewHolder getHolder(Context context, ViewGroup parent, int layoutId){
        View itemView = LayoutInflater.from(context).inflate(layoutId, parent,false);
        RViewHolder holder = new RViewHolder(itemView);
        return holder;
    }

    public <T extends View> T getView(int viewId){
        View view = (View) mViews.get(viewId);
        if(view == null){
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T)view;
    }

    public void setTextView(int viewId, String text){
        TextView view = getView(viewId);
        view.setText(text);
    }

    public void setImageView(int viewId, int resId){
        ImageView view = getView(viewId);
        view.setImageResource(resId);
    }
}
