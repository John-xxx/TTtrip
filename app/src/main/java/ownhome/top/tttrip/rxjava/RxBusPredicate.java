package ownhome.top.tttrip.rxjava;

import io.reactivex.functions.Predicate;

/**
 * date：2018/4/10 13:43
 * author：M.Qtrip
 * email：475934874@qq.com
 * description：filter 过滤
 */
public class RxBusPredicate implements Predicate<RxBusEvent> {

    RxBusEvent event;

    public RxBusPredicate setEvent(RxBusEvent event) {
        this.event = event;
        return this;
    }

    @Override
    public boolean test(RxBusEvent rxBusEvent) throws Exception {
        if (rxBusEvent.getEventTag().equals(this.event.getEventTag()))
            return true;
        return false;
    }
}
