package ownhome.top.tttrip.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * date：2018/4/9 16:48
 * author：M.Qtrip
 * email：475934874@qq.com
 * description：
 */
public class SwipeBackLayout extends ViewGroup {

    public enum DragEdge {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    public SwipeBackLayout(Context context) {
        super(context);
    }

    public SwipeBackLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        if (getChildCount() == 0)
            return;
        View child = getChildAt(0);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public void computeScroll() {
        super.computeScroll();
    }

    /**
     * 滑动动作回调监听
     */
    public interface SwipeBackListener {
        /**
         * @param fractionAnchor
         * @param fractionScreen
         */
        void onViewPositionChanged(float fractionAnchor, float fractionScreen);
    }
}
