package com.example.android.welcometosanjose;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by karlottajuan on 9/26/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ViewsFragment();
        } else if (position == 1) {
            return new MallsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}
