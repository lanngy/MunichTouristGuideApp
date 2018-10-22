package com.example.android.munichtouristguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;



public class Cafe_and_RestaurantsFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.local_list, container, false);
            final ArrayList<Local> cafe = new ArrayList<Local>();
            cafe.add(new Local(getString(R.string.local_Königin), getString(R.string.address_Königin), getString(R.string.telephone_Königin), getString(R.string.description_Königin),R.drawable.knigin43));
            cafe.add(new Local(getString(R.string.local_mexican), getString(R.string.address_mexican), getString(R.string.telephone_mexican), getString(R.string.description_mexican),R.drawable.el_gordo_loco));
            LocalAdapter adapter = new LocalAdapter(getActivity(), cafe);
            ListView listView = (ListView) rootView.findViewById(R.id.list);
            listView.setAdapter(adapter);
            return rootView;
        }
    }