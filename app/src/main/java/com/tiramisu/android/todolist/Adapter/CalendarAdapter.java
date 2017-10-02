package com.tiramisu.android.todolist.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tiramisu.android.todolist.R;

import java.util.ArrayList;


public class CalendarAdapter extends RecyclerView.Adapter<CalendarAdapter.MyViewHolder>{

    private ArrayList<String> list_dues;
    public Context mcontext;

    public CalendarAdapter(ArrayList<String> list, Context context){
        list_dues = list;
        mcontext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.custom_calendar, null);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int position) {

        viewHolder.duedatetxt.setText(list_dues.get(position));


    }

    @Override
    public int getItemCount() {
        return list_dues.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView duedatetxt;


        public MyViewHolder(View itemView) {
            super(itemView);

            duedatetxt = (TextView) itemView.findViewById(R.id.duedates);
        }
    }
}