package com.example.flowz.introto9japidginlanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class GreetingNhouseholdActivity extends AppCompatActivity {

    MediaPlayer playPidginAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_display);



//        String pidgin [] = {"How far", "morning my guy/girl", "How you dey", "I day fine", "Who you be", "wehtin be your name", "My name na John Snow", "Where you dey go", "I dey come", "food done set", "I done come", "My paddy name na fred"};

        final ArrayList<constructor> wordsSaid = new ArrayList<>();

        wordsSaid.add(new constructor("Hello","How far", R.raw.howfar));
        wordsSaid.add(new constructor("Good morning", "Morning my guy",R.raw.morning));
        wordsSaid.add(new constructor("How are you", "How you dey",R.raw.howyoudey));
        wordsSaid.add(new constructor("I am fine", "I dey o",R.raw.ideyo));
        wordsSaid.add(new constructor("Who are you", "Who you be",R.raw.whoyoube));
        wordsSaid.add(new constructor("What is your name", "Wetin be your name",R.raw.wetinbeyourname));
        wordsSaid.add(new constructor("My name is Jon Snow", "My name na Jon snow",R.raw.johnsnow));
        wordsSaid.add(new constructor("where are you going", "Where you day go",R.raw.whereyoudeygo));
//        wordsSaid.add(new constructor("What is going on with you", "Wetin dey sup with you",R.raw.wetindeysup));
        wordsSaid.add(new constructor("Is the food ready", "Food don set",R.raw.food));


        CustomAdapter showsList = new CustomAdapter(this, wordsSaid,R.color.colourGreen);

        ListView myList = (ListView)findViewById(R.id.listOfPhrases);

        myList.setAdapter(showsList);


        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//                String showThis = String.valueOf(adapterView.getItemAtPosition(i));

                constructor getPidginClicked = wordsSaid.get(i);

                playPidginAudio = MediaPlayer.create(GreetingNhouseholdActivity.this, getPidginClicked.getmPidginAudio());
                playPidginAudio.start();

            }
        });
    }
}
