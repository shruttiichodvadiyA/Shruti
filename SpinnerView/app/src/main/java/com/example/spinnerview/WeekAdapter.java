package com.example.spinnerview;

import static com.example.spinnerview.R.id.txtspinner1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class WeekAdapter extends BaseAdapter {
    String weekar[];
    Context context;

    public WeekAdapter(String[] weekar, Context context) {
        this.weekar = weekar;
        this.context=context;
    }

    @Override
    public int getCount() {
        return weekar.length;
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

        View v1= LayoutInflater.from(context).inflate(R.layout.weekspinner,null);
        TextView txtspinner1=v1.findViewById(R.id.txtspinner1);
        txtspinner1.setText(weekar[i]);
        return v1;
    }
}
