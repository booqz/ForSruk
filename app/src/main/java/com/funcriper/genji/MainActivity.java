package com.funcriper.genji;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    Random random;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }



    public void OnClick(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mada);
        mediaPlayer.start();
    }



    public void Needheal(View view) {

        Random random = new Random();
        int musik []  = {0, 1};
        int pos = random.nextInt(musik.length);
        if (pos == 0) {
            MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.healing );
            mediaPlayer.start();

        } else {
            MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.require);
            mediaPlayer.start();
        }

    }

}