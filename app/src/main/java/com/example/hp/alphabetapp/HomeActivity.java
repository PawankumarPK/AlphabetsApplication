package com.example.hp.alphabetapp;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements Tab1.OnFragmentInteractionListener,Tab2.OnFragmentInteractionListener,Tab3.OnFragmentInteractionListener,Tab4.OnFragmentInteractionListener
,Tab5.OnFragmentInteractionListener,Tab6.OnFragmentInteractionListener{

    MediaPlayer mySong;

    private TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Ordered"));
        tabLayout.addTab(tabLayout.newTab().setText("To Sell"));
        tabLayout.addTab(tabLayout.newTab().setText("Baseball"));
        tabLayout.addTab(tabLayout.newTab().setText("To Sell"));
        tabLayout.addTab(tabLayout.newTab().setText("To Sell"));
        tabLayout.addTab(tabLayout.newTab().setText("To Sell"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.pager);


        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final PageAdapter adapter  =new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    //   mySong = MediaPlayer.create(MainActivity.this,R.raw.a);


  /*  }
    public void playIT(View v)
    {
        mySong.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        mySong.release();
    }
    */



}
