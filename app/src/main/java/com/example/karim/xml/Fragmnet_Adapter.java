package com.example.karim.xml;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class Fragmnet_Adapter extends FragmentPagerAdapter {



    public Fragmnet_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                return new One();
            case 1:
                return new two();
            case 2:
                return new three();
            case 3:
                return new four();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
//
//Your tab titles
//
            case 0:return "Акции";
            case 1:return "Перс. предложения";
            case 2:return "Купоны";
            case 3:return "Детский клуб";
            default:return null;
        }
    }
}

