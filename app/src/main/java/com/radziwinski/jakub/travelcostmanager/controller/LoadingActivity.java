package com.radziwinski.jakub.travelcostmanager.controller;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.radziwinski.jakub.travelcostmanager.R;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(LoadingActivity.this, TripListActivity.class);
        startActivity(intent);
        finish();

    }
}
