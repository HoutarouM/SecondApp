package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    element powinien miec width i heigth
//    wrap content wezmij tyle mijsca ile potrzebujesz

//    wszystkie texsty powinne byc ekstraktowane do strings xml

//    layout dotyczy contenera w ktorym mam
//    grawity zawartosci

//    dp piksele niezalezne

//    nie stosowac onClick

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        przypisanie widoku do aktywnosci
        setContentView(R.layout.activity_main);
    }

    public void badAnswer(View view) {
        Toast.makeText(MainActivity.this, R.string.bad_answer, Toast.LENGTH_LONG).show();
    }

    public void goodAnswer(View view) {
        view.setVisibility(View.INVISIBLE);

        counter++;

        if (counter >= 5) {
            TextView header = findViewById(R.id.textHeader);

            header.setText(R.string.game_end);
        }
    }
}