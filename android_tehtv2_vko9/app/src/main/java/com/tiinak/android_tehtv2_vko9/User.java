package com.tiinak.android_tehtv2_vko9;

import android.widget.EditText;

import java.io.Serializable;

public class User implements Serializable {

    protected String firstName;
    protected String lastName;
    protected String email;
    protected String degreeProgram;

    protected int image;


    public User(String firstName, String lastName, String email, String degreeProgram) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        if(degreeProgram == "Tuotantotalous"){
            image = R.drawable.picture4;
        }
        else if(degreeProgram == "laskennallinen tekniikka"){
            image = R.drawable.picture1;
        }
        else if(degreeProgram == "Tietotekniikka"){
            image = R.drawable.picture3;
        }
        else if(degreeProgram == "Sähkötekniikka"){
            image = R.drawable.picture2;
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
