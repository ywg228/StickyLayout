package com.ywg.stickylayout.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ywg.stickylayout.R;

/**
 * Created by Ywg on 2016/6/29.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnListView;
    private Button mBtnRecyclerView;

    private Button mBtnWebView;
    private Button mBtnScrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        setListeners();

    }


    private void initViews() {
        mBtnListView = (Button) findViewById(R.id.btn_listview);
        mBtnRecyclerView = (Button) findViewById(R.id.btn_recyclerview);
        mBtnWebView = (Button) findViewById(R.id.btn_webview);
        mBtnScrollView = (Button) findViewById(R.id.btn_scrollview);
    }


    private void setListeners() {
        mBtnListView.setOnClickListener(this);
        mBtnRecyclerView.setOnClickListener(this);
        mBtnWebView.setOnClickListener(this);
        mBtnScrollView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_listview:
                startActivity(new Intent(MainActivity.this, ListViewActivity.class));
                break;
            case R.id.btn_recyclerview:
                startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
                break;
            case R.id.btn_webview:
                startActivity(new Intent(MainActivity.this, WebViewActivity.class));
                break;
        }
    }
}
