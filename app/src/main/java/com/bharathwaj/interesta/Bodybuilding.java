package com.bharathwaj.interesta;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import java.util.Objects;

public class Bodybuilding extends AppCompatActivity {
    WebView web;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bodybuilding );
        web = (WebView) findViewById( R.id.Webview1 );
        progressBar = (ProgressBar) findViewById( R.id.progressbar1 );
        web.setWebViewClient( new myWebClient());
        web.getSettings().setJavaScriptEnabled( true );
        Bundle bundle=getIntent().getExtras();
        String data1=bundle.get("data1").toString();
        if(Objects.equals( data1, "NEWS" )) {
            web.loadUrl( "https://www.flexonline.com/general-news" );
        }
        if(Objects.equals( data1, "EVENTS" )){
            web.loadUrl( "http://flixcasting.com/audition/mr-miss-india-2018-chennai-audition" );
        }
        if(Objects.equals( data1, "VIDEOS" )){
            web.loadUrl( "https://www.fitnessblender.com/videos/upper-body-workout-for-coordination-and-control-isolated-functional-strength-workout" );
        }
        if(Objects.equals( data1, "TUTORIALS" )){
            Intent intent = new Intent( Bodybuilding.this,Tutorial.class );
            startActivity( intent );
        }
    }

    public class myWebClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted( view, url, favicon );
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            progressBar.setVisibility( View.VISIBLE );
            view.loadUrl( url );
            return true;
        }
        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished( view, url );
            progressBar.setVisibility( View.GONE );
        }
    }
    // To handle "Back" key press event for WebView to go back to previous screen.
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && web.canGoBack()) {
            web.goBack();
            return true;
        }
        return super.onKeyDown( keyCode, event );
    }
}

