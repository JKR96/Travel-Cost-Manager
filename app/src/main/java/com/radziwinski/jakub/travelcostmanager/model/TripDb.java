package com.radziwinski.jakub.travelcostmanager.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TripDb {
    private static TripDb sTripDb;
    private List<Trip> mTrips;
    private static final int SIZE = 16;

    public static TripDb get(Context context) {
        if (sTripDb==null) {
            sTripDb = new TripDb(context);
        }
        return sTripDb;
    }

    private TripDb(Context context) {
        mTrips = new ArrayList<>();
        for (int i=0; i<SIZE; i++) {
            Trip Trip = new Trip();
            //ustaw je
            mTrips.add(Trip);
        }
    }

    public List getTrips() {
        return mTrips;
    }

    public Trip getTrip(UUID id) {
        for (Trip Trip : mTrips) {
            if (Trip.getId().equals(id)) {
                return Trip;
            }
        }
        return null;
    }

}
