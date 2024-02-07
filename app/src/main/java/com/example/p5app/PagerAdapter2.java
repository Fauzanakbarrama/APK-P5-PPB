package com.example.p5app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import org.jetbrains.annotations.NotNull;

public class PagerAdapter2 extends FragmentStatePagerAdapter {
    int numTab;
    public PagerAdapter2(@NotNull FragmentManager fm, int numTab){
        super(fm);
        this.numTab = numTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0 :
                return new TabFragment4();
            case 1 :
                return new TabFragment5();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return numTab;
    }
}
