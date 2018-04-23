package com.radziwinski.jakub.travelcostmanager.controller;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.radziwinski.jakub.travelcostmanager.R;
import com.radziwinski.jakub.travelcostmanager.model.Trip;

public class MyItemDecoration extends RecyclerView.ItemDecoration {


    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        int offset = 80;

        if (parent.getChildAdapterPosition(view) == 0) {
            return;
        }

        long position = parent.getChildAdapterPosition(view);
        if((position%2)!=0) {
            outRect.set(offset, 0, 0, 0);
        }

    }

}
