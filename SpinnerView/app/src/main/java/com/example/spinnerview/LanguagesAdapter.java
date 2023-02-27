package com.example.spinnerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class LanguagesAdapter extends BaseAdapter {
    String languagesar[];
    Context context;

    public LanguagesAdapter(String[] languagrsar, Context context) {
        this.languagesar=languagrsar;
        this.context=context;
    }

    @Override
    public int getCount() {
        return languagesar.length;
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

        View v2= LayoutInflater.from(context).inflate(R.layout.languages_spinner,null);
        TextView txtspinner2=v2.findViewById(R.id.txtspinner2);
        txtspinner2.setText(languagesar[i]);
        return v2;
    }
}
