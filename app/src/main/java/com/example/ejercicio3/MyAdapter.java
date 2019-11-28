package com.example.ejercicio3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    private  String[] data;
    private  Integer[] data2;
    private Context context;

    public MyAdapter(Context context,String[] data1, Integer[] data2){
       super();
       this.data = data1;
       this.data2 = data2;
       this.context = context;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = LayoutInflater.from(context).
                inflate(R.layout.two_line,parent,false);

        TextView text1 = rowView.findViewById(R.id.text1);
        ImageView icon = rowView.findViewById(R.id.icon);

        text1.setText(data[position]);

        Integer i = data2[position];
        if (i == 0){
            icon.setImageResource(R.drawable.girl);

        }else {
            icon.setImageResource(R.drawable.boy);
        }


        return rowView;
    }
}
