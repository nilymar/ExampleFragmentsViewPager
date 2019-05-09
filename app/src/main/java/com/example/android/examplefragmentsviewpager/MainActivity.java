package com.example.android.examplefragmentsviewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public ViewPager viewPager;
    public TabLayout tabLayout;
    FragmentManager fragmentManager;
    // variables to be use in creating the adapter and viewPager
    MyFragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabs);
        // setting the fragments adpter viewPager
        fragmentManager = getSupportFragmentManager();
        adapterViewPager = new MyFragmentPagerAdapter(fragmentManager, this);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(adapterViewPager);
        // Set the tabs onto the view pager
        tabLayout.setupWithViewPager(viewPager);
    }

    // when the user is in the first fragment pressing back will exit the app
    // for all the other fragments pressing back will bring you to the first fragment
    @Override
    public void onBackPressed() {
        int position = tabLayout.getSelectedTabPosition();
        if (position == 0) {
            super.onBackPressed();
            System.exit(0);
        } else {
            // if the current tab is different from the first tab and you press back - the tab is set on the first one
            viewPager.setCurrentItem(0);
        }
    }
}
