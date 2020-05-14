package com.example.tugasppl;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MainPagerAdapter extends FragmentStatePagerAdapter {

    int nomorTab;

    public MainPagerAdapter(FragmentManager fm, int nomorTab) {
        super(fm);
        this.nomorTab = nomorTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new UKMKuFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return nomorTab;
    }
}