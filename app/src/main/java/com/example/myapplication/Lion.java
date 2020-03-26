package com.example.myapplication;

import android.util.Log;

public class Lion extends Cat {

    public Lion() {
        Log.i("constructor", "Constructor Lion? ");
    }

    public void talk(){
        Log.i("lion", love());
    }

    @Override
    public void draw() {

        Log.i("draw()", "Draw Lion");
    }
}
