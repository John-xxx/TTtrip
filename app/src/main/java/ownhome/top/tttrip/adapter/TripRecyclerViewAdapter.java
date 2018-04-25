package ownhome.top.tttrip.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;

import ownhome.top.tttrip.R;
import ownhome.top.tttrip.bean.response.PersonBean;

/**
 * description：
 * date：2018/4/25 15:58
 * author：ZouChao
 * email：475934874@qq.com
 */
public class TripRecyclerViewAdapter extends BaseQuickAdapter<PersonBean,BaseViewHolder> {
    public TripRecyclerViewAdapter() {
        super(R.layout.item_triprecord ,new ArrayList<PersonBean>());
    }

    @Override
    protected void convert(BaseViewHolder helper, PersonBean item) {
        helper.setText(R.id.name,item.getName());
        helper.setText(R.id.address,item.getAddress());
        helper.setText(R.id.age,item.getAge() + "");
        helper.setText(R.id.sex,item.getSex());
    }
}
