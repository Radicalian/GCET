package com.gfeed.rajatkrishnan.gcet;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;



import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;


public class OnBoardActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences preferences =  getSharedPreferences("my_preferences",
                MODE_PRIVATE);

        // Check if onboarding_complete is false
        if(preferences.getBoolean("onboarding_complete",false)) {
// Start the onboarding Activity
            Intent onboarding = new Intent(this,MainActivity.class);
            startActivity(onboarding);

// Close the main Activity
            finish();
            return;
        }

//slide1
        addFragment(new Step.Builder().setTitle("WELCOME To G-Feed\nOfficial CSE/IT Information Channel" +
                "!!")
                .setSummary("It seems like you are a New User!!\nWe welcome you to GFeed.")
                .setBackgroundColor(Color.parseColor("#FFA600")) // int background color
                .setDrawable(R.drawable.op2) // int top drawable

                .build());
        final MediaPlayer mMediaPlayer=MediaPlayer.create(this,R.raw.qe1);


        mMediaPlayer.start();
        CountDownTimer Timer = new CountDownTimer(37000,37000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                if(mMediaPlayer.isPlaying()){
                    mMediaPlayer.stop();
                    mMediaPlayer.release();
                }
            }
        };
        Timer.start();



        //slide2
        addFragment(new Step.Builder().setTitle("CAREER ORIENTED")
                .setSummary("This app includes some awesome career oriented elements such as Internship,different courses related to CSE/IT,career tips by experts.")
                .setBackgroundColor(Color.parseColor("#FFA600")) // int background color
                .setDrawable(R.drawable.human) // int top drawable

                .build());

        //slide3
        addFragment(new Step.Builder().setTitle("COLLEGE ORIENTED")
                .setSummary("This app includes some awesome college oriented elements such as college club news,aktu feed,H.O.D'corner and Gsim")
                .setBackgroundColor(Color.parseColor("#FFA600")) // int background color
                .setDrawable(R.drawable.college) // int top drawable

                .build());
    }

    @Override
    public void finishTutorial() {

        SharedPreferences preferences =
                getSharedPreferences("my_preferences", MODE_PRIVATE);

        // Set onboarding_complete to true
        preferences.edit()
                .putBoolean("onboarding_complete",true).apply();

        // Launch the main Activity, called MainActivity
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);

        // Close the OnboardingActivity
        finish();


    }
}



