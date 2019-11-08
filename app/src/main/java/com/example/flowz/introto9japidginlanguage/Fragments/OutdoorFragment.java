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

public class OutdoorFragment extends Fragment {
    MediaPlayer playPidginAudio;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

           View flowzView = inflater.inflate(R.layout.list_display, container, false);

        final ArrayList<constructor> wordsSaid = new ArrayList<>();

        wordsSaid.add(new constructor("Hello bro how are you doing","Hey my guy how far", R.raw.myguyhowfar));
        wordsSaid.add(new constructor("We about to go play football at the field", "We wan go play ball for field",R.raw.playball));
        wordsSaid.add(new constructor("Do you have cable i'm coming to watch game of thrones", "You get cable i dey come watch game of thrones o",R.raw.cable));
        wordsSaid.add(new constructor("Driver stop i'll have to alight i forgot my wallet at home", "Driver stop o i gat come down i forget wallet for house",R.raw.wallet));
        wordsSaid.add(new constructor("Hello mike is there food at home ", "Hey mikey my guy food dey house",R.raw.food));
        wordsSaid.add(new constructor("Hello i'm trying to locate coolfm Port Harcourt", "How far where coolfm dey for this Port Harcourt",R.raw.coolfm));
        wordsSaid.add(new constructor("Been walking a while think i need a bottle of water", "Men i don dey waka since i gat drink water now o",R.raw.waka));
        wordsSaid.add(new constructor("Pleasure Park is a nice hangout spot in Port Harcourt", "Pleasure Park na make sense place to chill for Port Harcourt o",R.raw.pleasurepark));
        wordsSaid.add(new constructor("Fred i saw richard at the bustop on my way back yesterday", "Fred i been see richard as i dey come back from work yesterday",R.raw.seerichard));
//        wordsSaid.add(new constructor("Never walk alone", "No dey waka solo",R.raw.fooddonset));

        CustomAdapter showsList = new CustomAdapter(getActivity(), wordsSaid,R.color.colourBlue);

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
