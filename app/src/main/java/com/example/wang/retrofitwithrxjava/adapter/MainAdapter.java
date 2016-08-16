package com.example.wang.retrofitwithrxjava.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.wang.retrofitwithrxjava.R;
import com.example.wang.retrofitwithrxjava.bean.BaseBean;
import com.example.wang.retrofitwithrxjava.bean.ResponseBen;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by zx on 2016/8/15 0015.
 */
public class MainAdapter extends MyBaseAdapter<ResponseBen> {


    private Context context;

    public MainAdapter(Context context) {
        super(new BaseBean<>(new ArrayList<ResponseBen>()), context);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = getInflater().inflate(R.layout.item_main_list, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        ResponseBen responseBen = (ResponseBen) getItem(position);

        if (responseBen != null && responseBen.getDirectors().get(0).getAvatars().getLarge() != null) {
            Glide.with(context).load(responseBen.getDirectors().get(0).getAvatars().getLarge()).into(viewHolder.imageView);
        }
        if (responseBen != null && responseBen.getTitle() != null) {
            viewHolder.textView.setText(responseBen.getTitle());
        }
        if (responseBen != null && responseBen.getYear() != null) {
            viewHolder.textView2.setText(responseBen.getYear());
        }

        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.imageView)
        ImageView imageView;
        @Bind(R.id.textView)
        TextView textView;
        @Bind(R.id.textView2)
        TextView textView2;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
