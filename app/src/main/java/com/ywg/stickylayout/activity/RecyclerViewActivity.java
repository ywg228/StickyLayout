package com.ywg.stickylayout.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ywg.stickylayout.R;
import com.ywg.stickylayout.adapter.RecyclerViewAdapter;

/**
 * Created by Ywg on 2016/6/29.
 */
public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        mRecyclerView = (RecyclerView) this.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(new RecyclerViewAdapter(RecyclerViewActivity.this));
//        mSlidingLayout.setFrontView(front);
    }


}