package com.example.android.munichtouristguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class LocalAdapter extends ArrayAdapter<Local> {

    public LocalAdapter(Activity context, ArrayList<Local> local) {
        super(context, 0, local);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Local currentlocal = getItem(position);

        TextView localTextView = (TextView) listItemView.findViewById(R.id.local_text_view);

        localTextView.setText(currentlocal.getlocal());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);

        addressTextView.setText(currentlocal.getaddress());

        TextView telephoneTextView = (TextView) listItemView.findViewById(R.id.telephone_text_view);

        telephoneTextView.setText(currentlocal.gettelephone());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);

        descriptionTextView.setText(currentlocal.getdescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentlocal.getImageResourceId());

        return listItemView;
    }
}
