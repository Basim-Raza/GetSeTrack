package com.example.basimraza.vehiclestrackingsystem;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Basim Raza on 2/19/2020.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {

    ArrayList<String> name, carname, number;
    public RecyclerAdapter(ArrayList<String> name, ArrayList<String> carname, ArrayList<String> number) {
        this.name = name;
        this.carname = carname;
        this.number = number;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View myItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(myItemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.personName.setText(name.get(position));
        holder.carID.setText(carname.get(position));
        holder.contact.setText(number.get(position));
    }

    @Override
    public int getItemCount() {
        return name.size();
    }
}

