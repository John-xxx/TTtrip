package ownhome.top.tttrip.base;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;

/**
 * date：2018/4/9 16:37
 * author：M.Qtrip
 * email：475934874@qq.com
 * description：
 */
public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setContentViewId());
        initData();
    }


    protected abstract int setContentViewId();

    protected abstract void initData();

    protected abstract void bindData();
}
