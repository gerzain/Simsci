package com.dev.simposio.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.dev.simposio.R;
import com.dev.simposio.ui.ActividadPrincipal;

public class Inicio extends AppCompatActivity {


    WebView webView;
    ImageView pantalla_principal;

    String frameVideo = "<html><body>Simci 2015<br><iframe width=\"420\" height=\"315\" src=\"https://www.youtube.com/embed/n3B807G51JA\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        webView = (WebView) findViewById(R.id.webView);
        pantalla_principal=(ImageView)findViewById(R.id.iv_siguiente) ;

        pantalla_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), ActividadPrincipal.class);
                startActivity(intent);
            }
        });
        webView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                return false;
            }
        });

        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);

        webView.loadData(frameVideo, "text/html", "utf-8");

    }
}
