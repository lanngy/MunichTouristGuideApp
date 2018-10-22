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
public class SightseeingFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.local_list, container, false);
        final ArrayList<Local> sight = new ArrayList<Local>();
        sight.add(new Local(getString(R.string.local_schloss), getString(R.string.address_schloss), getString(R.string.telephone_schloss), getString(R.string.description_schloss),R.drawable.nymphenburger));
        sight.add(new Local(getString(R.string.local_allianz), getString(R.string.address_allianz), getString(R.string.telephone_allianz), getString(R.string.description_allianz),R.drawable.allianz_arena));
        LocalAdapter adapter = new LocalAdapter(getActivity(), sight);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
