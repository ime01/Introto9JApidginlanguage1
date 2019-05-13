package com.example.flowz.introto9japidginlanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
