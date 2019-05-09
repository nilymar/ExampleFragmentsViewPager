package com.example.android.examplefragmentsviewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Provides the appropriate Fragment for a view pager, on the appropriate tab
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 2;
    private Context mContext;

    public MyFragmentPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        mContext = context;
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show first fragment
                return new FirstFragment();
            case 1: // Fragment # 0 - This will show second fragment
                return new SecondFragment();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment name
                return mContext.getResources().getString(R.string.first_fragment_name);
            case 1: // Fragment # 1 - This will show SecondFragment name
                return mContext.getResources().getString(R.string.second_fragment_name);
            default:
                return null;
        }
    }
}
