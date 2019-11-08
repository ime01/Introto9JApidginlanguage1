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

public class TravelFragment extends Fragment {
    MediaPlayer playPidginAudio;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

           View flowzView = inflater.inflate(R.layout.list_display, container, false);

        final ArrayList<constructor> wordsSaid = new ArrayList<>();

        wordsSaid.add(new constructor("I am leaving this country","I don Jand O", R.raw.jand));
        wordsSaid.add(new constructor("I'm going on vaccation to enjoy myself", "I gat go flex myself",R.raw.flex));
        wordsSaid.add(new constructor("His plane just landed", "Him plane don show o",R.raw.planeshow));
        wordsSaid.add(new constructor("I just got my visa", "Them don my visa o",R.raw.ideyo));
        wordsSaid.add(new constructor("I am going to Lagos tommorrow morning", "I dey go Lagos as dey break",R.raw.golagos));
        wordsSaid.add(new constructor("Buy something nice when coming back", "Buy bread come o",R.raw.buybread));
        wordsSaid.add(new constructor("Do visit me whenever your in London", "Anytime you show London try reach my side",R.raw.showlondon));
        wordsSaid.add(new constructor("I met victoria on a flight to LA", "Me and victoria jam for plane wey dey go LA",R.raw.planela));
        wordsSaid.add(new constructor("Due to traffic jam on my flight to Vegas i stopped and bought gala for you", "As go slow hold us for my plane wen dey go Vegas na i stop buy gala for you",R.raw.buygala));
        wordsSaid.add(new constructor("Have you ever travelled with Agofure bus to Port Harcourt", "U don ever enter Agofure bus go Port Harcourt before",R.raw.bustoph));



        CustomAdapter showsList = new CustomAdapter(getActivity(), wordsSaid,R.color.colourBrown);

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
