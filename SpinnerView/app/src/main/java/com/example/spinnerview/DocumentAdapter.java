package com.example.spinnerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DocumentAdapter extends BaseAdapter {
    String[] documentar;
    int[] imagear;
    Context context;
     DocumentAdapter(int[] imagear, String[] documentar, Context context) {
        this.documentar=documentar;
        this.imagear=imagear;
        this.context=context;

    }

    @Override
    public int getCount() {
        return documentar.length;
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
        View v5= LayoutInflater.from(context).inflate(R.layout.documentspinner,null);
        TextView txtimgspinner=v5.findViewById(R.id.txtimgspinner);
        ImageView imgspinner=v5.findViewById(R.id.imgspinner);
        txtimgspinner.setText(documentar[i]);
        imgspinner.setImageResource(imagear[i]);

        return v5;
    }
}
