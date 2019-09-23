package com.as.demo_ok46.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.as.demo_ok46.R;
import com.as.demo_ok46.custom.CardAdapterHelper;
import com.as.demo_ok46.data.SmallData;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2019/9/23.
 * ---------------------------
 */
public class MyAdapter extends BaseQuickAdapter<SmallData, BaseViewHolder> {


    public MyAdapter(int layoutResId, @Nullable List<SmallData> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, SmallData item) {
        ImageView iv_item = helper.getView(R.id.iv_item);
        iv_item.setImageResource(item.getDrawable());
    }

}