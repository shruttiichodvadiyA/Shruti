package com.example.instagramapp.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.instagramapp.R;

import java.util.ArrayList;

public class SearchAdapterClass extends BaseAdapter {
    ArrayList<Integer> image;
    Context context;

    public SearchAdapterClass(ArrayList<Integer> image, Context context) {
        this.context=context;
        this.image=image;
    }

    @Override
    public int getCount() {
        return image.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v= LayoutInflater.from(context).inflate(R.layout.searchfile,null);
        ImageView imgsearchview=v.findViewById(R.id.imgsearchview);
        imgsearchview.setImageResource(image.get(i));
        return v;
    }
}
