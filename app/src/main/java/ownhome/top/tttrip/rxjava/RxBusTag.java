package ownhome.top.tttrip.rxjava;

/**
 * date：2018/4/10 14:34
 * author：M.Qtrip
 * email：475934874@qq.com
 * description：filter 过滤标记
 */
public class RxBusTag {
    private String username;
    private String password;

    public RxBusTag(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        RxBusTag tag = (RxBusTag) obj;
        if (username != null ? !username.equals(tag.username) : tag.username != null)
            return false;
        return password != null ? password.equals(tag.password) : tag.password == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
