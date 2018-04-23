package com.radziwinski.jakub.travelcostmanager.controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.radziwinski.jakub.travelcostmanager.R;

public abstract class SingleFragmentActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_trip);

        FragmentManager fm = getSupportFragmentManager();

    }
}
