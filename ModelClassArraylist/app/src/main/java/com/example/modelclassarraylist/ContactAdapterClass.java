package com.example.modelclassarraylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapterClass extends BaseAdapter {
    ArrayList<ContactModelClass>details;
    Context context;

    public ContactAdapterClass(ArrayList<ContactModelClass> details, Context context) {

        this.details=details;
        this.context=context;
    }

    @Override
    public int getCount() {
        return details.size();
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
        View v= LayoutInflater.from(context).inflate(R.layout.contactsdetails,null);
        TextView txtname=v.findViewById(R.id.txtname);
        TextView txtnumber=v.findViewById(R.id.txtnumber);
        txtname.setText(details.get(i).getContactname());
        txtnumber.setText(Integer.toString(details.get(i).getContactnumber()));

        return v;
    }
}
