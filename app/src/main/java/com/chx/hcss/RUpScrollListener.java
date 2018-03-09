package com.chx.hcss;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by win7 on 2018/3/8.
 */

public abstract class RUpScrollListener extends RecyclerView.OnScrollListener {
    //RecyclerView的LayoutManager
    private LinearLayoutManager mLLManager;
    //已加载的数据总数
    private int mTotalCount = 0;
    //当前屏幕展示的最后位置
    private int mLastPosition = 0;
    //是否正在加载
    private boolean mIsLoading = false;
    //当前页码
    private int mCurrentPageIndex = 0;
    //是否已经加载完
    private boolean mIsLoadComplete = false;

    public RUpScrollListener(LinearLayoutManager linearLayoutManager){
        mLLManager = linearLayoutManager;
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy){
        mTotalCount = mLLManager.getItemCount();
        mLastPosition = mLLManager.findLastVisibleItemPosition();
        if (mTotalCount == 0 || mIsLoadComplete) return;
        if (mTotalCount >= (mLastPosition + 2)) {
            mIsLoading = false;
        }
        if (mTotalCount < (mLastPosition + 2) & !mIsLoading) {
            mIsLoading = true;
            mCurrentPageIndex++;
            onLoadMore(mCurrentPageIndex);
        }
    }

    public void setIsLoadComplete(boolean isLoadComplete){
        mIsLoadComplete = isLoadComplete;
    }

    public void setCurrentPageIndex(int currentPageIndex){
        mCurrentPageIndex = currentPageIndex;
    }

    public abstract void onLoadMore(int nextPageIndex);

}
