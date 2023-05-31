package com.example.a2502006341_claudyasalim_asgmcs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private Fragment homeFragment, transactionFragment;

    private Fragment[] fragments;
    private String[] titles = {"Home", "Transaction"};

    public PagerAdapter(@NonNull FragmentManager fm) { super(fm); }

    public void passUser(User user){
        homeFragment = HomeFragment.newInstance(user);
        transactionFragment = TransactionFragment.newInstance(user);
        fragments = new Fragment[]{homeFragment, transactionFragment};
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
