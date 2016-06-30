package com.ywg.stickylayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ywg.stickylayout.entity.Item;
import com.ywg.stickylayout.R;

import java.util.List;


/**
 * Created by Ywg on 2016/6/29.
 */
public class ListViewAdapter extends BaseAdapter {

    private Context mContext;
    private List<Item> mItemList;
    private LayoutInflater mInflater;

    public ListViewAdapter(Context context, List<Item> itemList) {
        this.mContext = context;
        this.mItemList = itemList;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return mItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return mItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null) {
            convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.mImageView = (ImageView) convertView.findViewById(R.id.iv_image);
            viewHolder.mTextView = (TextView) convertView.findViewById(R.id.tv_text);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Item item = mItemList.get(position);
        viewHolder.mImageView.setImageResource(item.getImageId());
        viewHolder.mTextView.setText(item.getTitle());
        return convertView;
    }

    class ViewHolder{
        private ImageView mImageView;
        private TextView mTextView;

    }
}
