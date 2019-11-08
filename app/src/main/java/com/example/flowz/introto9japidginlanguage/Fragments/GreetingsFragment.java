package com.example.flowz.introto9japidginlanguage.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.flowz.introto9japidginlanguage.CustomAdapter;
import com.example.flowz.introto9japidginlanguage.R;
import com.example.flowz.introto9japidginlanguage.constructor;

import java.util.ArrayList;

public class GreetingsFragment extends Fragment {
    MediaPlayer playPidginAudio;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View flowzView = inflater.inflate(R.layout.list_display, container, false);

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


        CustomAdapter showsList = new CustomAdapter(getActivity(), wordsSaid,R.color.colourGreen);

        ListView myList = (ListView)flowzView.findViewById(R.id.listOfPhrases);

        myList.setAdapter(showsList);


        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//                String showThis = String.valueOf(adapterView.getItemAtPosition(i));

                constructor getPidginClicked = wordsSaid.get(i);

                playPidginAudio = MediaPlayer.create(getActivity(), getPidginClicked.getmPidginAudio());
                playPidginAudio.start();

            }
        });
        return flowzView;
    }
}
