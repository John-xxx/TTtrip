package ownhome.top.tttrip.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import ownhome.top.tttrip.R;
import ownhome.top.tttrip.bean.response.VersionBean;
import ownhome.top.tttrip.retrofit.RetrofitFactory;
import ownhome.top.tttrip.rxjava.RxBus;
import ownhome.top.tttrip.rxjava.RxBusEvent;
import ownhome.top.tttrip.rxjava.RxBusTag;

/**
 * date：2018/4/10 14:14
 * author：M.Qtrip
 * email：475934874@qq.com
 * description：
 */
public class MainActivity extends RxAppCompatActivity {
    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
//    private Api api;

    RetrofitFactory retrofitFactory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        retrofitFactory = RetrofitFactory.getInstance();
        RxBus.getInstance().toObservable(new RxBusEvent(new RxBusTag("joker", "123"), "joker")).subscribe(new Consumer<RxBusEvent>() {
            @Override
            public void accept(RxBusEvent rxBusEvent) throws Exception {
                tv1.setText(rxBusEvent.getEventContent().toString());
            }
        });
    }

    @OnClick({R.id.btn1, R.id.btn2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                retrofitFactory.api().getVersion()
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<VersionBean>() {
                            @Override
                            public void onSubscribe(Disposable d) {
                            }

                            @Override
                            public void onNext(VersionBean versionBean) {
                                RxBus.getInstance().post(new RxBusEvent(new RxBusTag("chaman", "123"), versionBean.getData().getVersionCode()));
                            }

                            @Override
                            public void onError(Throwable e) {
                                RxBus.getInstance().post(new RxBusEvent(new RxBusTag("chaman", "123"), "joker1"));
                            }

                            @Override
                            public void onComplete() {

                            }
                        });
                startActivity(new Intent(this,TripRecordActivity.class));

//                api.getToken("111", "2222").flatMap(new Function<LoginBean, ObservableSource<UserInfoBean>>() {
//                    @Override
//                    public ObservableSource<UserInfoBean> apply(LoginBean loginBean) throws Exception {
//                        return api.getUserInfo(loginBean.getAcess_token());
//                    }
//                })
//                        .subscribeOn(Schedulers.newThread())
//                        .observeOn(Schedulers.io())
//                        .doOnNext(new Consumer<UserInfoBean>() {
//                            @Override
//                            public void accept(UserInfoBean userInfoBean) throws Exception {
//                                //操作
//                            }
//                        })
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe(new Consumer<UserInfoBean>() {
//                            @Override
//                            public void accept(UserInfoBean userInfoBean) throws Exception {
//
//                            }
//                        }, new Consumer<Throwable>() {
//                            @Override
//                            public void accept(Throwable throwable) throws Exception {
//
//                            }
//                        });
                break;
            case R.id.btn2:
                RxBus.getInstance().post(new RxBusEvent(new RxBusTag("joker", "123"), "chaman1"));
                break;
        }
    }
}
