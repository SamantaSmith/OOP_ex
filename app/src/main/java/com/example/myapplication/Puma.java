package com.example.myapplication;

import android.util.Log;

public class Puma extends Cat {

    private String pumaHelloText;

    public Puma() {

        this.age = 3;
        this.name = "Puma";
        this.pumaHelloText = "I'm a cool cat";
    }

    public void talk() {
        Log.i("talk", createPumaTalkText());
    }

    private String createPumaTalkText() {
        return (pumaHelloText + " at age " + age + " named " + name);
    }

    @Override
    public void draw() {

        Log.i("draw()", "Draw Puma");
    }
}
