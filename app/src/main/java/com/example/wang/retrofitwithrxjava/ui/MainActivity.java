package com.example.wang.retrofitwithrxjava.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.wang.retrofitwithrxjava.MyApp;
import com.example.wang.retrofitwithrxjava.R;
import com.example.wang.retrofitwithrxjava.adapter.MainAdapter;
import com.example.wang.retrofitwithrxjava.bean.ResponseBen;
import com.example.wang.retrofitwithrxjava.utils.CommonCallback;
import com.example.wang.retrofitwithrxjava.utils.NetLink;
import com.example.wang.retrofitwithrxjava.utils.PackageCommonCall;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.listViewID)
    ListView listViewID;
    @Bind(R.id.button)
    Button button;
    @Bind(R.id.button2)
    Button button2;
    @Bind(R.id.button3)
    Button button3;
    @Bind(R.id.emptyView)
    TextView emptyView;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;
    private MainAdapter adapter;
    private NetLink netLink;
    private int page = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        listViewID.setEmptyView(emptyView);

        adapter = new MainAdapter(this);

        listViewID.setAdapter(adapter);
    }

    private void loadData() {

        progressBar.setVisibility(View.VISIBLE);

        netLink = MyApp.getMyApp().getNetLink();

        PackageCommonCall.fromObservable(netLink.getDataSec(page, 10), this).enqueue(new CommonCallback<ResponseBen>() {
            @Override
            public void onSuccess(ResponseBen result) {
                /** 数据加载完成后的操作*/
                Log.i("info", "onSuccess");
                adapter.add(result);
                progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onFailure(Throwable t) {
                /** 数据加载失败的操作*/
                Log.i("info", t.toString() + "   :error");
            }
        });


    }

    public void refresh(View view) {
        page = 0;
        adapter.clear();
        loadData();
    }

    public void loadNext(View view) {
        page = page + 10;
        loadData();
    }

}
