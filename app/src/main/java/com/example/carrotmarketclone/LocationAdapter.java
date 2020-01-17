package com.example.carrotmarketclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    private ArrayList<LocationData> locationList;
    private Context context;

    public LocationAdapter(ArrayList<LocationData> locationList, Context context) {
        this.locationList = locationList;
        this.context = context;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_location, parent, false);
        LocationViewHolder holder = new LocationViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {

        holder.locationView.setText(locationList.get(position).getLocationData());

    }

    @Override
    public int getItemCount() {
        return (locationList != null ? locationList.size() : 0);
    }

    public class LocationViewHolder extends RecyclerView.ViewHolder {

        TextView locationView;

        public LocationViewHolder(@NonNull View itemView) {
            super(itemView);
            this.locationView = itemView.findViewById(R.id.locationView);
        }
    }
}
