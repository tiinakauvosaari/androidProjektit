package com.tiinak.android_tehtv2_vko9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.userName.setText(users.get(position).getFirstName() + " " + users.get(position).getLastName());
        holder.email.setText(users.get(position).getEmail());
        holder.suuntaus.setText(users.get(position).getDegreeProgram());
        holder.image.setImageResource(users.get(position).getImage());
        holder.tutkinto1.setText(users.get(position).getTutkinto());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class User implements Serializable {

        protected String firstName;
        protected String lastName;
        protected String email;
        protected String degreeProgram;

        //protected String tutkinto1, tutkinto2, tutkinto3, tutkinto4;

        protected int pictureNumber;

        protected int image;

        protected String tutkinnot;

        public User(String firstName, String lastName, String email, String degreeProgram, int pictureNumber, String tutkinnot) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.degreeProgram = degreeProgram;
            this.pictureNumber = pictureNumber;
            this.tutkinnot = tutkinnot;

            if (pictureNumber == 1) {
                image = R.drawable.picture3;
            } else if (pictureNumber == 2) {
                image = R.drawable.picture4;
            }
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getDegreeProgram() {
            return degreeProgram;
        }

        public int getImage() {
            return image;
        }

        public String getTutkinto() {
             return tutkinnot;
        }
    }
}
