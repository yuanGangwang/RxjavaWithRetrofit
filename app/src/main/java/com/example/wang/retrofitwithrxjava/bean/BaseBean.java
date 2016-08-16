package com.example.wang.retrofitwithrxjava.bean;

import java.util.List;

/**
 * Created by wang on 2016/8/15 0015.
 */
public class BaseBean<T> {

    private int count;
    private int start;
    private int total;
    private String title;

    public BaseBean() {

    }

    public BaseBean(List<T> subjects) {

        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "count=" + count +
                ", start=" + start +
                ", total=" + total +
                ", title='" + title + '\'' +
                ", responseEntity=" + subjects +
                '}';
    }

    public List<T> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<T> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<T> subjects) {
        this.subjects = subjects;
    }
}
