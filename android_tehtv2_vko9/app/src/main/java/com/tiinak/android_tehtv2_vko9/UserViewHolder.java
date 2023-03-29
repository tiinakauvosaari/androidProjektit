package com.tiinak.android_tehtv2_vko9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView userName, email, suuntaus, tutkinto1;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.userImage);
        userName = itemView.findViewById(R.id.nameView);
        email = itemView.findViewById(R.id.emailView);
        suuntaus = itemView.findViewById(R.id.suuntaView);
        tutkinto1 = itemView.findViewById(R.id.tutkinto1View);
    }
}
