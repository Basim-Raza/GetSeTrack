package com.example.basimraza.vehiclestrackingsystem;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder{

    TextView personName, carID, contact;
    Button track, rest;
    public MyViewHolder(View itemView) {
        super(itemView);

        personName = itemView.findViewById(R.id.personName);
        carID = itemView.findViewById(R.id.carId);
        contact = itemView.findViewById(R.id.contactNumber);
        track = itemView.findViewById(R.id.track);
        rest = itemView.findViewById(R.id.rest);
    }
}
