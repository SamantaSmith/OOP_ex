package com.example.myapplication;

import android.util.Log;

public abstract  class Cat extends Animal {

    public int age;
    public String name;
    static int numberOfLegs = 4;

    String helloText;
    CatMood catMood;

    class CatMood{

        int lvlOfMood;

        CatMood() {

            if (Cat.this.age < 2) {lvlOfMood = 100;}
            else if (Cat.this.age >=2 && Cat.this.age <=7) {lvlOfMood = 50;}
            else if (Cat.this.age >7) {lvlOfMood = 20;}
        }
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;

        catMood = new CatMood();

        switch(catMood.lvlOfMood) {

            case 100: helloText = "My name is " + name + " Ama happy camt";
            break;
            case 50: helloText = "My name is " + name + " Ama not so happy camt";
                break;
            case 20: helloText = "My name is " + name + "A ma grumpy camt";
                break;
        }
    }

    public Cat() {

        this.name = "John";
        this.age = -1;
        Log.i("talk()", "Suka che bez parametrov");
    }



    public void talk() {

        Log.i("talk()", helloText);
    }

    public static String love() {return "I like playing, jumping, eating";  }

    public void catchMouse(int mouseWeight) {

        class Mouse{
            String color;
            int weight;

            public Mouse(String color, int weight) {

                this.color = color;
                this.weight = weight;
            }

            String mouseVoice() {return "AAAAAAAA";}
        }

        Mouse mouse = new Mouse("White", mouseWeight);

        if (mouse.weight<1) {Log.i("catsay", "eat");} else {Log.i("catsay", "afraid");}
    }



}
