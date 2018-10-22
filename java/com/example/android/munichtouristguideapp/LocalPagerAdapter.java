package com.example.android.munichtouristguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LocalPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public  LocalPagerAdapter (FragmentManager fm, Context context) {
        super (fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new Art_and_ScienceMuseumsFragment();
        } else if (position==1){
            return new Bar_and_ClubsFragment();
        } else if (position==2){
            return new Cafe_and_RestaurantsFragment();
        } else
            return new SightseeingFragment();
    }
    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getText(R.string.ArtandScienceMuseums);
        } else if (position == 1) {
            return mContext.getString(R.string.BarandClubs);
        } else if (position == 2) {
            return mContext.getString(R.string.CafeandRestaurants);
        } else {
            return mContext.getString(R.string.Sightseeing);
        }
    }
}
