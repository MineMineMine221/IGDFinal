package com.example.a62043258_login_1;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class videoView extends AppCompatActivity {

    private VideoView m_videoView;
    private MediaController m_mediaController;
    private Uri m_uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        m_videoView = (VideoView) findViewById(R.id.videoView1);
        String path = "android.resource://" + getPackageName() +"/"+R.raw.eftvdo;
        m_uri = Uri.parse(path);
        m_videoView.setVideoURI(m_uri);

        m_mediaController = new MediaController(this);
        m_videoView.setMediaController(m_mediaController);
        m_mediaController.setAnchorView(m_videoView);

        m_videoView.start();
    }
}