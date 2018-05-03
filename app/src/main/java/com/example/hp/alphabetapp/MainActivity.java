package com.example.hp.alphabetapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mListLayout;
    private ImageView mProfileImages;
    private TextView mNameText,mDescText;
    private ImageView Mmusic1,Mmusic2,Mmusic3,Mmusic4,Mmusic5,Mmusic6;
    private CardView cardView1,cardView2,cardView3,cardView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

      /*  cardView1 = (CardView)findViewById(R.id.cardView1);
        cardView2 = (CardView)findViewById(R.id.cardView2);
        cardView3 = (CardView)findViewById(R.id.cardView3);
        cardView4 = (CardView)findViewById(R.id.cardView4);*/
/*

        Mmusic1 = (ImageView)findViewById(R.id.music1);
        Mmusic2 = (ImageView)findViewById(R.id.music2);
        Mmusic3 = (ImageView)findViewById(R.id.music3);
        Mmusic4 = (ImageView)findViewById(R.id.music4);
        Mmusic5 = (ImageView)findViewById(R.id.music5);
        Mmusic6 = (ImageView)findViewById(R.id.music6);
*/

        mListLayout = (RelativeLayout)findViewById(R.id.ListLayout);
        mProfileImages = (ImageView)findViewById(R.id.profile_image);
        mNameText = (TextView)findViewById(R.id.profile_name);
        mDescText = (TextView)findViewById(R.id.profile_desc);
        mListLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(MainActivity.this,SharedActivity.class);

                Pair[] pairs = new Pair[3];
                pairs[0] = new Pair<View,String>(mProfileImages,"imageTransition");
                pairs[1] = new Pair<View,String>(mDescText,"descTransition");
                pairs[2] = new Pair<View,String>(mNameText,"nameTransition");


                /*pairs[1] = new Pair<View,String>(cardView2,"imageTransition");
                pairs[2] = new Pair<View,String>(cardView3,"imageTransition");
                pairs[3] = new Pair<View,String>(cardView4,"imageTransition");

                pairs[1] = new Pair<View,String>(mNameText,"nameTransition");
                pairs[2] = new Pair<View,String>(mDescText,"descTransition");*/
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);


                startActivity(shareIntent,options.toBundle());
            }
        });

    }
}
