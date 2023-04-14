package com.example.selfcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ListenMusics extends AppCompatActivity {

    WebView listenMusics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_musics);

        listenMusics = findViewById(R.id.listen_music_web);

        listenMusics.loadUrl("https://wynk.in/music");
    }
}