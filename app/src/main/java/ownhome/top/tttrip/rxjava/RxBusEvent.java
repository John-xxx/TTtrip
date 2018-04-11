package ownhome.top.tttrip.rxjava;

/**
 * date：2018/4/10 13:39
 * author：M.Qtrip
 * email：475934874@qq.com
 * description：
 */
public class RxBusEvent<T> {
    private T eventTag;
    private Object eventContent;

    public RxBusEvent(T eventTag, Object eventContent) {
        this.eventTag = eventTag;
        this.eventContent = eventContent;
    }

    public T getEventTag() {
        return eventTag;
    }

    public void setEventTag(T eventTag) {
        this.eventTag = eventTag;
    }

    public Object getEventContent() {
        return eventContent;
    }

    public void setEventContent(Object eventContent) {
        this.eventContent = eventContent;
    }
}
