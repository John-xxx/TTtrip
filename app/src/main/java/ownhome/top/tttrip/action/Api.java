package ownhome.top.tttrip.action;

import io.reactivex.Observable;
import ownhome.top.tttrip.bean.response.LoginBean;
import ownhome.top.tttrip.bean.response.UserInfoBean;
import ownhome.top.tttrip.bean.response.VersionBean;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * date：2018/4/10 17:02
 * author：M.Qtrip
 * email：475934874@qq.com
 * description：
 */
public interface Api {

    @GET("login")
    Observable<LoginBean> getToken(@Query("account") String account, @Query("password") String password);

    @GET("login/userInfo")
    Observable<UserInfoBean> getUserInfo(@Query("acess_token") String acess_token);

    @GET("getCurrentVersion")
    Observable<VersionBean> getVersion(@Query("version") String version);
}
