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

public class WorkFragment extends Fragment {
    MediaPlayer playPidginAudio;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View flowzView = inflater.inflate(R.layout.list_display, container, false);

        final ArrayList<constructor> wordsSaid = new ArrayList<>();

        wordsSaid.add(new constructor("I am in hurry don't want to be late to work","Men i dey rush no wan late go work", R.raw.nowanlate));
//        wordsSaid.add(new constructor("Good morning boss", "Oga good morning",R.raw.morning));
        wordsSaid.add(new constructor("How's that project hope your done with it", "How far that project hope say u don finish am",R.raw.howfarproject));
        wordsSaid.add(new constructor("Sofia the boss want to see you in his office", "Sofia Oga say him wan see u for office closed door",R.raw.seeyouforoffice));
        wordsSaid.add(new constructor("I have a meeting with a client by 2pm today", "I get meeting with customer around 2 oclock today",R.raw.meetingwithcustomer));
        wordsSaid.add(new constructor("The official car will take you to your meeting", "Men company motor go carry you meeting no worry about transport",R.raw.noworryaboutttransport));
        wordsSaid.add(new constructor("Sir you have to wait for 2 hours the boss is in a meeting", "Sir you go wait small 2 hours Oga dey meeting",R.raw.waittwohours));
        wordsSaid.add(new constructor("I need a break", "I need chill small",R.raw.ineedchill));
        wordsSaid.add(new constructor("The client said he'll pay tommorrow", "Customer say him go pay tommorrow",R.raw.paytommorrow));
        wordsSaid.add(new constructor("Tell him to write a cheque", "Tell am make him write cheque",R.raw.writecheque));




        CustomAdapter showsList = new CustomAdapter(getActivity(), wordsSaid, R.color.colourlightpink);

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