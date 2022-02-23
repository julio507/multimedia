package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class View2Activity extends AppCompatActivity {

    private Button playButton = null;
    private Button stopButton = null;
    private Button closeButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        playButton = findViewById(R.id.button_play);
        stopButton = findViewById(R.id.button_stop);
        closeButton = findViewById(R.id.button_close3);

        final MediaPlayer mediaPlayer = MediaPlayer.create( getApplicationContext(), R.raw.ffvictory );

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (!mediaPlayer.isPlaying()) {
                        mediaPlayer.start();
                    }
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mediaPlayer.stop();
                    mediaPlayer.prepare();
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}