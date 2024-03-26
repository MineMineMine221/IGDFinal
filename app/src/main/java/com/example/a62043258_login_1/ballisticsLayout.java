package com.example.a62043258_login_1;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ballisticsLayout extends AppCompatActivity {

    private WebView m_webviwe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ballistics_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        m_webviwe = (WebView) findViewById(R.id.web);
        WebSettings webSettings = m_webviwe.getSettings();
        webSettings.setJavaScriptEnabled(true);
        m_webviwe.setWebViewClient(new WebViewClient());
        m_webviwe.loadUrl("https://www.eft-ammo.com/");

    }
}