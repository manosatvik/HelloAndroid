package com.example.android.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clicked(View view){
        Intent i = new Intent("android.intent.action.VIEW", Uri.parse("https://in.udacity.com/"));
        startActivity(i);
    }
}
