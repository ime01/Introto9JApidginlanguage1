package com.example.flowz.introto9japidginlanguage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.flowz.introto9japidginlanguage.Fragments.GreetingsFragment;
import com.example.flowz.introto9japidginlanguage.Fragments.OutdoorFragment;
import com.example.flowz.introto9japidginlanguage.Fragments.TravelFragment;
import com.example.flowz.introto9japidginlanguage.Fragments.WorkFragment;

public class SimpleFragmentAdapter extends FragmentPagerAdapter {

    public SimpleFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new OutdoorFragment();
        } else if (position == 1){
            return new WorkFragment();
        } else if (position == 2){
            return new TravelFragment();
        }else {
            return new GreetingsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
