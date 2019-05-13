package com.example.flowz.introto9japidginlanguage;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter <constructor> {

    int mgetColour;


    public CustomAdapter(@NonNull Context context, ArrayList<constructor> wordsSaid, int ColourValue ) {
        super(context, 0, wordsSaid);
        mgetColour = ColourValue;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater flowzinflater = LayoutInflater.from(getContext());
        View flowzView = flowzinflater.inflate(R.layout.customdesign,parent, false);


        constructor writeThis = getItem(position);

        TextView englishText = (TextView)flowzView.findViewById(R.id.Englishtext);

        TextView pidginText = (TextView)flowzView.findViewById(R.id.Pidgintext);

        pidginText.setText(writeThis.getmPidginText());

        englishText.setText(writeThis.getmEnglishText());


        View choseLayoutForColour = flowzView.findViewById(R.id.NestedlinearLayout);
        int selectColour = ContextCompat.getColor(getContext(), mgetColour);
        choseLayoutForColour.setBackgroundColor(selectColour);

        return flowzView;

    }
}
