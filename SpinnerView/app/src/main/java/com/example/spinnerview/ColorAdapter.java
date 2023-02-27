package com.example.spinnerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    String colorar[];
    Context context;

    ColorAdapter(String[] colorar, Context context){
        this.colorar=colorar;
        this.context=context;
    }

    @Override
    public int getCount() {
        return colorar.length;
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

        View v= LayoutInflater.from(context).inflate(R.layout.spinnerview,null);
        TextView txtspinner=v.findViewById(R.id.txtspinner);
        txtspinner.setText(colorar[i]);

        return v;
    }
}
