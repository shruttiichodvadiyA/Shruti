package com.example.spinnerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class WeatherAdapter extends BaseAdapter {

    String weatherar[];
    Context context;
    public WeatherAdapter(String[] weatherar, Context context) {
        this.weatherar=weatherar;
        this.context=context;
    }

    @Override
    public int getCount() {
        return weatherar.length;
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

        View v3= LayoutInflater.from(context).inflate(R.layout.weatherspinner,null);
        TextView txtspinner3=v3.findViewById(R.id.txtspinner3);
        txtspinner3.setText(weatherar[i]);
        return v3;
    }
}
