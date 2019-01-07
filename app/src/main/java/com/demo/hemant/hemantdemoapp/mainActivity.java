    package com.demo.hemant.hemantdemoapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

    public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnMap(View view){
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/"));
        map.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        startActivity(map);
    }
}
