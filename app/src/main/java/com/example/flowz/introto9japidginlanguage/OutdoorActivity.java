package com.example.flowz.introto9japidginlanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class OutdoorActivity extends AppCompatActivity {

    MediaPlayer playPidginAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_display);


        final ArrayList<constructor> wordsSaid = new ArrayList<>();

        wordsSaid.add(new constructor("Hello bro how are you doing","Hey my guy how far", R.raw.howfar));
        wordsSaid.add(new constructor("We about to go play football at the field", "We wan go play ball for field",R.raw.morning));
        wordsSaid.add(new constructor("Do you have cable i'm coming to watch game of thrones", "You get cable i dey come watch game of thrones o",R.raw.howyoudey));
        wordsSaid.add(new constructor("Driver stop i'll have to alight i forgot my wallet at home", "Driver stop o i gat come down i forget wallet for house",R.raw.ideyo));
        wordsSaid.add(new constructor("Hello mike is there food at home ", "Hey mikey my guy food dey house",R.raw.whoube));
        wordsSaid.add(new constructor("Hello i'm trying to locate coolfm Port Harcourt", "How far where coolfm dey for this Port Harcourt",R.raw.wetinbeyourname));
        wordsSaid.add(new constructor("Been walking a while think i need a bottle of water", "Men i don dey waka since i gat drink water now o",R.raw.mynamenajonsnow));
        wordsSaid.add(new constructor("Pleasure Park is a nice hangout spot in Port Harcourt", "Pleasure Park na make sense place to chill for Port Harcourt o",R.raw.whereudeygo));
        wordsSaid.add(new constructor("Fred i saw richard at the bustop on my way back yesterday", "Fred i been see richard as i dey come back from work yesterday",R.raw.wetindeysup));
        wordsSaid.add(new constructor("Never walk alone", "No dey waka solo",R.raw.fooddonset));


        CustomAdapter showsList = new CustomAdapter(this, wordsSaid,R.color.colourBlue);

        ListView myList = (ListView)findViewById(R.id.listOfPhrases);

        myList.setAdapter(showsList);


        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//                String showThis = String.valueOf(adapterView.getItemAtPosition(i));

                constructor getPidginClicked = wordsSaid.get(i);

                playPidginAudio = MediaPlayer.create(OutdoorActivity.this, getPidginClicked.getmPidginAudio());
                playPidginAudio.start();

            }
        });

    }
}
