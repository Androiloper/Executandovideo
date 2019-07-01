package com.example.executandovideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        //executar o video
        videoView.setMediaController( new MediaController(this));
        videoView.setVideoPath("android.resource://" +getPackageName()+"/"+ R.raw.video);
        videoView.start();

        //esconder actionBar
        getSupportActionBar().hide();

        //esconder a barra de estatus e barra de navegação
        View decorView = getWindow().getDecorView();
        int uiopcoes = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;


        decorView.setSystemUiVisibility( uiopcoes );
    }


}
