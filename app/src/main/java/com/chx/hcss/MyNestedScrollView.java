package com.chx.hcss;

import android.content.Context;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/**
 * Created by Admin on 2018/3/12.
 */

public class MyNestedScrollView extends NestedScrollView {

    private int mConsumedY = 0;
    private int mTopHeight = 0;
    private ViewGroup mTopView;

    public MyNestedScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyNestedScrollView(Context context) {
        super(context);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mTopView = (ViewGroup)((ViewGroup)getChildAt(0)).getChildAt(0);
        mTopHeight = mTopView.getHeight();
        mTopView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                mTopHeight = mTopView.getMeasuredHeight() - 100;
            }
        });
    }

    @Override
    public boolean onStartNestedScroll (View child,View target, int nestedScrollAxes) {
        if (mConsumedY == mTopHeight) {
            return false;
        }
        return true;
    }

    @Override
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        //如果父亲自己要滑动，则拦截
        if(mConsumedY < mTopHeight){
            int consumedY = mTopHeight - mConsumedY;
            if (consumedY < dy) {
                consumed[1] = consumedY;
            } else {
                consumed[1] = dy;
            }
            scrollBy(0,consumed[1]);
            mConsumedY += consumed[1];
            Log.i("onNestedPreScroll","Parent滑动：" + dy);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            return true;
        }
        return super.onTouchEvent(event);
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {

        return super.onInterceptTouchEvent(event);
    }


//    @Override
//    public boolean dispatchTouchEvent(MotionEvent event) {
//        Log.i("aaa","getY():getRawY:"+event.getRawY());
//
//        switch (event.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                mLastTouchY = (int) (event.getRawY() + 0.5f);
//
//                break;
//            case MotionEvent.ACTION_MOVE:
//                int y = (int) (event.getRawY() + 0.5f);
//                int dy = mLastTouchY - y;
//                mLastTouchY = y;
//                if(showImg(dy)||hideImg(dy)){//如果父亲自己要滑动
//                    scrollBy(0,dy);
//                }
//                break;
//            case MotionEvent.ACTION_UP:
//
//                break;
//        }
//
//
//        return super.dispatchTouchEvent(event);
//    }

}
