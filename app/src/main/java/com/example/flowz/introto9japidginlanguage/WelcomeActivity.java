package com.example.flowz.introto9japidginlanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    TextView title;
    Button begin;
    ImageView flag, nigeria;
    Animation anim1,anim2, anim3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

         title = findViewById(R.id.myTitle);
         begin = findViewById(R.id.begin);
         flag = findViewById(R.id.flagPic);
         nigeria = findViewById(R.id.nigeriaPic);

        anim1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_left);
        anim2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        anim3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.quiz_buttuon_animation);

        title.setAnimation(anim1);
        begin.setAnimation(anim2);
        flag.setAnimation(anim3);
        nigeria.setAnimation(anim3);


    }

    public void begin (View view){
        Intent openMain = new Intent(WelcomeActivity.this, MainActivity.class);
        startActivity(openMain);
    }
}
