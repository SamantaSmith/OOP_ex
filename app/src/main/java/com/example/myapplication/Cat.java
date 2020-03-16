package com.example.myapplication;

import android.util.Log;

public class Cat extends Animal {

    public int age;
    public String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat() {}



    public void talk() {

        Log.i("talk()", "Meow, my name is " + name + " and i'm " + age + "y.o.");
    }


}
