package com.example.flowz.introto9japidginlanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public Animation animSlideInText, animSlideText, animPlay, animBounce, animBlink, animSlide2, animSlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animPlay = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.play_animation);
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.quiz_buttuon_animation);
        animSlide = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_left);
        animSlide2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        animSlideText = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right_text);
        animSlideInText = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_text);

        CardView outdoor = findViewById(R.id.Outdoor_Phrases);
        CardView household = findViewById(R.id.HouseHold_Phrases);
        CardView travel = findViewById(R.id.Travelnleisure_Phrases);
        CardView work = findViewById(R.id.Work_Phrases);

        outdoor.startAnimation(animSlide);
        work.startAnimation(animSlide);
        household.startAnimation(animSlideInText);
        travel.startAnimation(animSlideInText);


    }

    public void OpenGreetingsActivity(View view) {

        Intent openGreetings = new Intent(this, GreetingNhouseholdActivity.class);
        startActivity(openGreetings);
    }


    public void OpenOutdoorActivity(View view) {

        Intent OpenOutdoor = new Intent(this, OutdoorActivity.class);
        startActivity(OpenOutdoor);
    }


    public void OpenTravelActivity(View view) {

        Intent openTravel = new Intent(this, TravelNleisureActivity.class);
        startActivity(openTravel);
    }


    public void OpenWorkActivity(View view) {

        Intent openWork = new Intent(this, WorkActivity.class);
        startActivity(openWork);
    }

    public void OpenViewPager(View view) {
        Intent openViewPager = new Intent(MainActivity.this, TestingViewPager.class);
        startActivity(openViewPager);
    }
}
