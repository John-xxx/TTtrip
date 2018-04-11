package ownhome.top.tttrip.rxjava;


import com.jakewharton.rxrelay2.PublishRelay;
import com.jakewharton.rxrelay2.Relay;
import io.reactivex.Observable;

import static ownhome.top.tttrip.rxjava.RxBus.RxBusInner.rxBusInstance;

/**
 * date：2018/4/9 16:36
 * author：M.Qtrip
 * email：475934874@qq.com
 * description：
 */
public class RxBus {

    private Relay<RxBusEvent> bus;
    private static RxBusPredicate rxBusPredicate;

    private RxBus() {
        bus = PublishRelay.<RxBusEvent>create().toSerialized();
    }

    //单列
    public static RxBus getInstance() {
        rxBusPredicate = new RxBusPredicate();
        return rxBusInstance;
    }

    static class RxBusInner {
        static RxBus rxBusInstance = new RxBus();
    }

    //发送事件
    public void post(RxBusEvent object) {
        bus.accept(object);
    }

    //注册接收事件
    public Observable<RxBusEvent> toObservable(RxBusEvent rxBusEvent) {
        return bus.filter(rxBusPredicate.setEvent(rxBusEvent));
    }

    //判断是否有事件
    public boolean hasObservers() {
        return bus.hasObservers();
    }

}
