package com.example.spinnerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NameAdapter extends BaseAdapter {
    String namear[];
    Context context;

    public NameAdapter(String[] namear, Context context) {
        this.namear=namear;
        this.context=context;
    }

    @Override
    public int getCount() {
        return namear.length;
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
        View v4= LayoutInflater.from(context).inflate(R.layout.namespinner,null);
        TextView txtspinner4=v4.findViewById(R.id.txtspinner4);
        txtspinner4.setText(namear[i]);

        return v4;
    }
}
