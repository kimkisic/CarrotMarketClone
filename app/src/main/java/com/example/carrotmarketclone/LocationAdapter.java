package com.example.carrotmarketclone;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    private ArrayList<LocationData> locationList;
    private Context context;

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class LocationViewHolder extends RecyclerView.ViewHolder {

        TextView locationView;

        public LocationViewHolder(@NonNull View itemView) {
            super(itemView);
            this.locationView = itemView.findViewById(R.id.locationView);
        }
    }
}
