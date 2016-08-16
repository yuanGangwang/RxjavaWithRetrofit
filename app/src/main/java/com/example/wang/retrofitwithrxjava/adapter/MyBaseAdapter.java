package com.example.wang.retrofitwithrxjava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import com.example.wang.retrofitwithrxjava.bean.BaseBean;

import java.util.Collection;

/**
 * Created by zx on 2016/8/15 0015.
 */
public abstract class MyBaseAdapter<T> extends BaseAdapter {

    private BaseBean<T> data;


    public LayoutInflater getInflater() {
        return inflater;
    }

    private LayoutInflater inflater;

    public MyBaseAdapter(BaseBean<T> data, Context context) {

        this.data = data;

        this.inflater = LayoutInflater.from(context);
    }


    public void add(T dd) {
        data.getSubjects().add(dd);
        notifyDataSetChanged();
    }

    public void addAll(T dd) {
        data.getSubjects().addAll((Collection<? extends T>) dd);
        notifyDataSetChanged();
    }

    public void clear() {
        data.getSubjects().clear();
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {

        return data.getSubjects().size();

    }

    @Override
    public Object getItem(int position) {

        return data.getSubjects().get(position);

//        return data.getSubjects().get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

}
