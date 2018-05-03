package com.example.hp.alphabetapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by hp on 12/22/2017.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

   public PageAdapter(FragmentManager fm, int NumberOfTabs)

   {
       super(fm);
       this.mNoOfTabs = NumberOfTabs;
   }


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position){

            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;

            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;

            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;

            case 3:
                Tab4 tab4 = new Tab4();
                return tab4;

            case 4:
                Tab5 tab5 =new Tab5();
                return tab5;

            case 5:

                Tab6 tab6 = new Tab6();
                return tab6;


            default:

                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
