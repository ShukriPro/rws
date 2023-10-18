package com.example.rws;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rws.DataModel.Location;

import java.util.List;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    private List<Location> locations;
    private Context context;

    public LocationAdapter(Context context, List<Location> locations) {
        this.context = context;
        this.locations = locations;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_location, parent, false);
        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        Location location = locations.get(position);

        // Assuming Location has a 'getCurrent()' method which returns an instance of 'Current' class.
        holder.tvTitle.setText(location.getName());
        holder.tvWeatherState.setText(location.getCountry()); // Using country name as a placeholder
        holder.tvTemperature.setText(String.format("%.1f°C", location.getTemperature_2m()));
        holder.tvHumidity.setText("Elevation: " + location.getElevation() + " m");
        holder.tvWindSpeed.setText("Wind Speed: " + location.getLatitude());

    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    static class LocationViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvDateCreated;
        TextView tvWeatherState;
        TextView tvTemperature;
        TextView tvHumidity;
        TextView tvWindSpeed;

        LocationViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.weatherResultCardTitle);
            tvDateCreated = itemView.findViewById(R.id.weatherResultCardDateCreated);
            tvWeatherState = itemView.findViewById(R.id.weatherResultCardWeatherState);
            tvTemperature = itemView.findViewById(R.id.weatherResultCardTheTempText);
            tvHumidity = itemView.findViewById(R.id.weatherResultCardHumidity);
            tvWindSpeed = itemView.findViewById(R.id.weatherResultCardWindSpeed);
        }
    }
}
