package com.tiinak.android_tehtv2_vko9;

import android.widget.EditText;

import java.io.Serializable;

public class User implements Serializable {

    protected String firstName;
    protected String lastName;
    protected String email;
    protected String degreeProgram;

    protected int pictureNumber;

    protected int image;


    public User(String firstName, String lastName, String email, String degreeProgram, int pictureNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.pictureNumber = pictureNumber;

        if(pictureNumber == 1){
            image = R.drawable.picture4;
        }
        else if(pictureNumber == 2){
            image = R.drawable.picture3;
        }
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }

    public String getDegreeProgram(){
        return degreeProgram;
    }

    public int getImage() {
        return image;
    }
}
