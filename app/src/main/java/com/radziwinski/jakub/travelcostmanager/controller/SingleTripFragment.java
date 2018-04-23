package com.radziwinski.jakub.travelcostmanager.controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.radziwinski.jakub.travelcostmanager.R;
import com.radziwinski.jakub.travelcostmanager.model.Trip;

public class SingleTripFragment extends Fragment {
    private Trip mTrip;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTrip = new Trip();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
