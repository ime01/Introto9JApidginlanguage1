package com.example.flowz.introto9japidginlanguage;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class TestingViewPager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpagertesting);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager1);

        SimpleFragmentAdapter adapter = new SimpleFragmentAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout myTabs = (TabLayout)findViewById(R.id.Tabs1);


         myTabs.setupWithViewPager(viewPager);

         myTabs.setBackgroundColor(getResources().getColor(R.color.colourBlue));
         myTabs.setTabTextColors(getResources().getColor(R.color.colourlightpink),getResources().getColor(R.color.colourGreen));
         myTabs.getTabAt(0).setText("OUTDOOR FRAGMENT");
         myTabs.getTabAt(1).setText("WORK FRAGMENT");
         myTabs.getTabAt(2).setText("TRAVEL FRAGMENT");
         myTabs.getTabAt(3).setText("GREETINGS FRAGMENT");


    }
}
