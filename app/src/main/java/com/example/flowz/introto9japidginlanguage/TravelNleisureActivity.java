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

public class TravelNleisureActivity extends AppCompatActivity {

    MediaPlayer playPidginAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_display);

        final ArrayList<constructor> wordsSaid = new ArrayList<>();

        wordsSaid.add(new constructor("I am leaving this country","I don Jand O", R.raw.howfar));
        wordsSaid.add(new constructor("I'm going on vaccation to enjoy myself", "I gat go flex myself",R.raw.morning));
        wordsSaid.add(new constructor("His plane just landed", "Him plane don show o",R.raw.howyoudey));
        wordsSaid.add(new constructor("I just got my visa", "Them don my visa o",R.raw.ideyo));
        wordsSaid.add(new constructor("I am going to Lagos tommorrow morning", "I dey go Lagos as dey break",R.raw.whoube));
        wordsSaid.add(new constructor("Buy something nice when coming back", "Buy bread come o",R.raw.wetinbeyourname));
        wordsSaid.add(new constructor("Do visit me whenever your in London", "Anytime you show London try reach my side",R.raw.mynamenajonsnow));
        wordsSaid.add(new constructor("I met victoria on a flight to LA", "Me and victoria jam for plane wey dey go LA",R.raw.whereudeygo));
        wordsSaid.add(new constructor("Due to traffic jam on my flight to Vegas i stopped and bought gala for you", "As go slow hold us for my plane wen dey go Vegas na i stop buy gala for you",R.raw.wetindeysup));
        wordsSaid.add(new constructor("Have you ever travelled with Agofure bus to Port Harcourt", "U don ever enter Agofure bus go Port Harcourt before",R.raw.fooddonset));


        CustomAdapter showsList = new CustomAdapter(this, wordsSaid,R.color.colourBrown);

        ListView myList = (ListView)findViewById(R.id.listOfPhrases);

        myList.setAdapter(showsList);



        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//                String showThis = String.valueOf(adapterView.getItemAtPosition(i));

                constructor getPidginClicked = wordsSaid.get(i);

                playPidginAudio = MediaPlayer.create(TravelNleisureActivity.this, getPidginClicked.getmPidginAudio());
                playPidginAudio.start();

            }
        });
    }
}
