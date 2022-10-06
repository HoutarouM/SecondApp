package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

//    element powinien miec width i heigth
//    wrap content wezmij tyle mijsca ile potrzebujesz

//    wszystkie texsty powinne byc ekstraktowane do strings xml

//    layout dotyczy contenera w ktorym mam
//    grawity zawartosci

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}