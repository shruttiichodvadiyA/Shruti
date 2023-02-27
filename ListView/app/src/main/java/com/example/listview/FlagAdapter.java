package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FlagAdapter extends BaseAdapter {

    String[] flagar;
    int[] imagear;
    Context context;

    FlagAdapter(String[] flagar, int[] imagear, Context context) {
        this.flagar = flagar;
        this.imagear = imagear;
        this.context = context;
    }

    @Override
    public int getCount() {
        return flagar.length;
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

        View v = LayoutInflater.from(context).inflate(R.layout.flagview, null);
        TextView txtimglist=v.findViewById(R.id.txtimglist);
        ImageView imglist=v.findViewById(R.id.imglist);
        txtimglist.setText(flagar[i]);
        imglist.setImageResource(imagear[i]);
        return v;
    }
}
