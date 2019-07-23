package com.example.mov_cup_america_2020_1061808480;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class sreen extends AppCompatActivity {
    ImageView imgSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sreen);

        imgSplash = findViewById(R.id.Imagensren);

        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(sreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        thread.start();
    }
}
