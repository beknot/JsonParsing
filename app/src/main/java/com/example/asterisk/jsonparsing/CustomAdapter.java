package com.example.asterisk.jsonparsing;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

class CustomAdapter extends BaseAdapter{
    Context c;
    List<DataModule> data;
    TextView name, email, phone;

   public  CustomAdapter(MainActivity mainActivity, List<DataModule> mydata) {
        c = mainActivity;
        data =mydata;

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    convertView = LayoutInflater.from(c).inflate(R.layout.customlayout,null);
        TextView name = convertView.findViewById(R.id.name);
        TextView email = convertView.findViewById(R.id.email);
        TextView phone = convertView.findViewById(R.id.phone);
        name.setText(data.get(position).getName());
        email.setText(data.get(position).getEmail());
        phone.setText(data.get(position).getPhone());
        return convertView;
    }
}
