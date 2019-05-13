package com.example.flowz.introto9japidginlanguage;

public class constructor {

    String mEnglishText;
    String mPidginText;
    int mPidginAudio;

    public constructor(String englishText, String pidginText, int PidginAudio) {
        mEnglishText = englishText;
        mPidginText = pidginText;
        mPidginAudio = PidginAudio;
    }

    public String getmEnglishText() {
        return mEnglishText;
    }

    public String getmPidginText() {
        return mPidginText;
    }

    public int getmPidginAudio() {
        return mPidginAudio;
    }

}
