package com.example.learn;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class video
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView=(VideoView) findViewById(R.id.videoView1);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        String path="android.resource://"+ getPackageName() +"/"+R.raw.;
        Toast.makeText(this,path,Toast.LENGTH_LONG).show();
        Log.d("videopath",path);
        Uri uri= Uri.parse(path);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}
}
