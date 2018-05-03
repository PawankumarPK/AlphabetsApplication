package com.example.hp.alphabetapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends Activity {

    ImageView iv_1,iv_2,iv_delay;
    Animation anim_1,anim_2,anim_delay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        iv_1 = (ImageView)findViewById(R.id.image_1);
//        iv_2 = (ImageView)findViewById(R.id.image_2);
        iv_delay = (ImageView)findViewById(R.id.final_delay);

        anim_1  = AnimationUtils.loadAnimation(this, R.anim.anim_1);
      //  anim_2  = AnimationUtils.loadAnimation(this, R.anim.anim_2);
        anim_delay  = AnimationUtils.loadAnimation(this, R.anim.final_delay);

        anim_1.setStartTime(Animation.START_ON_FIRST_FRAME);
        iv_1.startAnimation(anim_1);

       /* anim_2.setStartTime(0);
        iv_2.startAnimation(anim_2);
*/
        anim_delay.setStartTime(0);
        iv_delay.startAnimation(anim_delay);

        anim_delay.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });



    }
}
