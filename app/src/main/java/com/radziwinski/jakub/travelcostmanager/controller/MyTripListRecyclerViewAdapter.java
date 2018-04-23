package com.radziwinski.jakub.travelcostmanager.controller;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.radziwinski.jakub.travelcostmanager.R;
import com.radziwinski.jakub.travelcostmanager.controller.TripListFragment.OnListFragmentInteractionListener;
import com.radziwinski.jakub.travelcostmanager.model.Trip;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {dummy} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyTripListRecyclerViewAdapter extends RecyclerView.Adapter<MyTripListRecyclerViewAdapter.ViewHolder> {

    private final List<Trip> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyTripListRecyclerViewAdapter(List<Trip> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_single_trip_on_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mTripName.setText(mValues.get(position).getName());
        holder.mTripDate.setText(mValues.get(position).getStart().toString());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTripName;
        public final TextView mTripDate;
        public Trip mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTripName = view.findViewById(R.id.trip_name);
            mTripDate = view.findViewById(R.id.trip_date);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mTripName.getText() + "'";
        }
    }
}
