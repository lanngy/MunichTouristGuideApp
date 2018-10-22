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



public class Bar_and_ClubsFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.local_list, container, false);
            final ArrayList<Local> bar = new ArrayList<Local>();
            bar.add(new Local(getString(R.string.local_goldene_bar), getString(R.string.address_goldene_bar), getString(R.string.telephone_goldene_bar), getString(R.string.description_goldene_bar),R.drawable.die_goldene_bar));
            bar.add(new Local(getString(R.string.local_hugo), getString(R.string.address_hugo), getString(R.string.telephone_hugo), getString(R.string.description_hugo),R.drawable.hugobar));
            LocalAdapter adapter = new LocalAdapter(getActivity(), bar);
            ListView listView = (ListView) rootView.findViewById(R.id.list);
            listView.setAdapter(adapter);
            return rootView;
        }
    }