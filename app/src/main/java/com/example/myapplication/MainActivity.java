package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(4, "Mira");
        myCat.talk();

        myCat.breathe();
        myCat.numberOfLegs = 6;
        Log.i("nOL", String.valueOf(myCat.numberOfLegs));

        Cat suka = new Cat(20, "Masha");
        suka.talk();

        Cat glasha = new Cat();
        glasha.age = 5;
        glasha.name = "asFck";
        glasha.talk();

        Puma puma = new Puma();
        puma.breathe();
        puma.talk();
        puma.isAlive = true;
        puma.name = "Leo";
        Log.i("puma", String.valueOf(puma.isAlive));

        Puma lodka = new Puma();
        lodka.talk();
    }
}
