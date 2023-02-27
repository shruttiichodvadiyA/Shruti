package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactsAdapter extends BaseAdapter {

    ArrayList<String> name;
    ArrayList<String> number;
    Context context;

    public ContactsAdapter(ArrayList<String> name, ArrayList<String> number, Context context) {
        this.name=name;
        this.number=number;
        this.context=context;
    }

    @Override
    public int getCount() {
        return name.size();
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
        View v= LayoutInflater.from(context).inflate(R.layout.listviewactivity,null);
        TextView txtname=v.findViewById(R.id.txtname);
        TextView txtnumber=v.findViewById(R.id.txtnumber);
        txtname.setText(name.get(i));
        txtnumber.setText(number.get(i));

        return v;
    }
}
