package com.example.brom.listviewjsonapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle info = getIntent().getExtras();
        String name = info.getString("INFO_NAME");
        String loc = info.getString("INFO_LOC");
        int height = info.getInt("INFO_HEIGHT");

        TextView nameText = (TextView)findViewById(R.id.textView);
        TextView locText = (TextView)findViewById(R.id.textView2);
        TextView heightText = (TextView)findViewById(R.id.textView3);

        nameText.setText("Name: " + name);
        locText.setText("Location: " + loc);
        heightText.setText("Height: " + height);
    }

}
