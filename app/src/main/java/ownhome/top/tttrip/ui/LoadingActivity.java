package ownhome.top.tttrip.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import ownhome.top.tttrip.R;
import ownhome.top.tttrip.rxjava.RxBus;
import ownhome.top.tttrip.rxjava.RxBusEvent;
import ownhome.top.tttrip.rxjava.RxBusTag;

public class LoadingActivity extends RxAppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.btn)
    Button btn;
    private CompositeDisposable compositeDisposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        ButterKnife.bind(this);

        compositeDisposable = new CompositeDisposable();

        Disposable disposable = RxBus.getInstance().toObservable(new RxBusEvent(new RxBusTag("chaman", "123"), "chaman")).subscribe(new Consumer<RxBusEvent>() {
            @Override
            public void accept(RxBusEvent rxBusEvent) throws Exception {
                tv.setText(rxBusEvent.getEventContent().toString());
            }
        });
        compositeDisposable.add(disposable);
    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
        startActivity(new Intent(LoadingActivity.this, MainActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        compositeDisposable.dispose();
    }
}
