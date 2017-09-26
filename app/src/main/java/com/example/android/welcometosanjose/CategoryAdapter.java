package com.example.android.welcometosanjose;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by karlottajuan on 9/26/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
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

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.views);
        } else if (position == 1) {
            return mContext.getString(R.string.malls);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurants);
        } else {
            return mContext.getString(R.string.hotels);
        }
    }
}
