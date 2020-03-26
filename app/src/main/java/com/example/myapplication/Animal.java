package com.example.myapplication;

import android.util.Log;

public abstract class Animal {

    int numberOfLegs;
    boolean isAlive;

    public void breathe() {

        Log.i("braethe()", "I can breathe!");
    }

    abstract public void draw();


}
