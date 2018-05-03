package com.example.hp.alphabetapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;


import android.app.ListFragment;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;


import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SharedActivity extends AppCompatActivity implements Tab1.OnFragmentInteractionListener,Tab2.OnFragmentInteractionListener,Tab3.OnFragmentInteractionListener,Tab4.OnFragmentInteractionListener {

    LinearLayout music1,music2,music3,music4,music5,music6;
    CardView cardView2,cardView3,cardView4,cardView1;

    private TabLayout tabLayout;
    ViewPager viewPager;

    FragmentManager fm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);




    cardView1 = (CardView) findViewById(R.id.cardView1);

       // getFragmentManager().beginTransaction().replace(R.id.frame_layout,new Tab1()).commit();

       /* final Tab fragment = new Tab();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        fragmentManager.beginTransaction().replace(R.id.frame_layout,fragment).commit();*/
        //transaction.add(R.id.frame_layout,fragment,"Tab1");




        music1 = (LinearLayout)findViewById(R.id.music1);
        music2 = (LinearLayout)findViewById(R.id.music2);
        music3 = (LinearLayout)findViewById(R.id.music3);
        music4 = (LinearLayout)findViewById(R.id.music4);
        music5 = (LinearLayout)findViewById(R.id.music5);
        music6 = (LinearLayout)findViewById(R.id.music6);

        cardView1 = (CardView)findViewById(R.id.cardView1);
        cardView2 = (CardView)findViewById(R.id.cardView2);
        cardView3 = (CardView)findViewById(R.id.cardView3);
        cardView4 = (CardView)findViewById(R.id.cardView4);


        final MediaPlayer mediaPlayerSounds = MediaPlayer.create(this,R.raw.a);

        music1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerSounds.start();
            }
        });

        final MediaPlayer mediaPlayerSounds2 = MediaPlayer.create(this,R.raw.b);

        music2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerSounds2.start();
            }
        });


        final MediaPlayer mediaPlayerSounds3 = MediaPlayer.create(this,R.raw.c);

        music3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerSounds3.start();
            }
        });


        final MediaPlayer mediaPlayerSounds4 = MediaPlayer.create(this,R.raw.d);

        music4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerSounds4.start();
            }
        });


        final MediaPlayer mediaPlayerSounds5 = MediaPlayer.create(this,R.raw.e);

        music5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerSounds5.start();
            }
        });


        final MediaPlayer mediaPlayerSounds6 = MediaPlayer.create(this,R.raw.f);

        music6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerSounds6.start();
            }
        });

       /* TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Ordered"));
        tabLayout.addTab(tabLayout.newTab().setText("To Sell"));
        tabLayout.addTab(tabLayout.newTab().setText("Baseball"));
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

*/
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* Tab1 fragment = new Tab1();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();*/

               Intent intent = new Intent(SharedActivity.this,HomeActivity.class);
               startActivity(intent);
            }
        });









    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
