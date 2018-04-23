package com.radziwinski.jakub.travelcostmanager.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.radziwinski.jakub.travelcostmanager.R;
import com.radziwinski.jakub.travelcostmanager.model.Trip;

public class TripListActivity extends AppCompatActivity implements TripListFragment.OnListFragmentInteractionListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //button adding new trip
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //add trip button
                Snackbar.make(view, "Trip add", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                //adding new trip


            }
        });

        //create fragment with list of trips
        if(savedInstanceState == null) {
            TripListFragment fragment = new TripListFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.trip_list_fragment_container, fragment);
            //transaction.addToBackStack(null);
            transaction.commit();
        }


    }

    @Override
    public void onListFragmentInteraction(Trip item) {
        Intent intent = new Intent(this, SingleTripActivity.class);
        startActivity(intent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


}
