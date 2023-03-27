package org.gpiste.rocketprogram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RocketListAdapter extends RecyclerView.Adapter<RocketViewHolder> {

    private Context context;
    private ArrayList<Rocket> rockets = new ArrayList<>();

    public RocketListAdapter(Context context, ArrayList<Rocket> rockets) {
        this.context = context;
        this.rockets = rockets;
    }

    @NonNull
    @Override
    public RocketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RocketViewHolder(LayoutInflater.from(context).inflate(R.layout.rocket_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RocketViewHolder holder, int position) {
        holder.rocketName.setText(rockets.get(position).getName() + " (" + rockets.get(position).getId() +")");
        holder.rocketMass.setText(String.valueOf(rockets.get(position).getMass()) + " kg");
        holder.rocketHeight.setText(String.valueOf(rockets.get(position).getHeight()) + " m");
        ArrayList<RocketEngine> re = rockets.get(position).getEngines();
        holder.rocketEngines.setText(String.valueOf(re.size()) + "kpl " + re.get(0).getName() + " (" + re.get(0).getPower() + "kN)");
        holder.rocketImage.setImageResource(rockets.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return rockets.size();
    }
}
