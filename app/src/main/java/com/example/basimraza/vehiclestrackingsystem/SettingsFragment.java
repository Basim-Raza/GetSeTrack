package com.example.basimraza.vehiclestrackingsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SettingsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_settings, container, false);

        TextView customerName = (TextView) v.findViewById(R.id.customerName);
        TextView customerVehicle = (TextView) v.findViewById(R.id.customerVehicle);
        TextView customerNumber = (TextView) v.findViewById(R.id.customerNumber);

        return v;
    }

}
