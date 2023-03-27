package org.gpiste.rocketprogram;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RocketViewHolder extends RecyclerView.ViewHolder {
    ImageView rocketImage;
    TextView rocketName, rocketMass, rocketHeight, rocketEngines;

    public RocketViewHolder(@NonNull View itemView) {
        super(itemView);
        rocketImage = itemView.findViewById(R.id.ivRocketImage);
        rocketName = itemView.findViewById(R.id.txtRocketName);
        rocketMass = itemView.findViewById(R.id.txtRocketMass);
        rocketHeight = itemView.findViewById(R.id.txtRocketHeight);
        rocketEngines = itemView.findViewById(R.id.txtRocketEngines);


    }
}
