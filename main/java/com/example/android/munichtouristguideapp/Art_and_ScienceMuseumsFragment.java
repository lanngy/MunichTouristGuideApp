package com.example.android.munichtouristguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Art_and_ScienceMuseumsFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.local_list, container, false);
            final ArrayList<Local> art = new ArrayList<Local>();
            art.add(new Local(getString(R.string.local_science), getString(R.string.address_science), getString(R.string.telephone_science), getString(R.string.description_science),R.drawable.deutschesmuseum));
            art.add(new Local(getString(R.string.local), getString(R.string.address), getString(R.string.telephone), getString(R.string.description),R.drawable.kunsthalle));
            art.add(new Local(getString(R.string.local_nymph), getString(R.string.address_nymph), getString(R.string.telephone_nymph), getString(R.string.description_nymph),R.drawable.museum_mensch_und_natur));
            LocalAdapter adapter = new LocalAdapter(getActivity(), art);
            ListView listView = (ListView) rootView.findViewById(R.id.list);
            listView.setAdapter(adapter);
            return rootView;
        }
    }
