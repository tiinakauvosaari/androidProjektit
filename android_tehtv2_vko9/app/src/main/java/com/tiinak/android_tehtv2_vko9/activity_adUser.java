package com.tiinak.android_tehtv2_vko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class activity_adUser extends AppCompatActivity {

    protected EditText firstName;
    protected  EditText lastName;
    protected  EditText email;

    protected RadioGroup rg;
    protected RadioGroup rgPicture;
    protected  String suuntaus;

    protected String firstname;
    protected String lastname;
    protected String eemail;

    protected int picture;

    protected CheckBox ctohtori, cmaisteri, ckandi, cuimari;

    protected String tutkinnot = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_user);

        firstName = findViewById(R.id.adUserName);
        lastName = findViewById(R.id.adUserLastname);
        email = findViewById(R.id.adUserEmail);
        rg = findViewById(R.id.radioGroup);
        rgPicture = findViewById(R.id.radioGroupPicture);
        ctohtori= findViewById(R.id.cboxTohtori);
        cmaisteri= findViewById(R.id.cboxMaisteri);
        ckandi= findViewById(R.id.cboxKandi);
        cuimari= findViewById(R.id.cboxUimari);
    }

    public void addUser(View view) {

        firstname = "" + firstName.getText().toString();
        lastname = "" + lastName.getText().toString();
        eemail = "" + email.getText().toString();

        switch (rg.getCheckedRadioButtonId()) {
            case R.id.rb_laskennallinenTekniikka:
                suuntaus = "laskennallinen tekniikka";
                break;
            case R.id.rb_tietotekniikka:
                suuntaus = "Tietotekniikka";
                break;
            case R.id.rb_sahkotekniikkaa:
                suuntaus = "Sähkötekniikka";
                break;
            case R.id.rb_tuotantotalous:
                suuntaus = "Tuotantotalous";
                break;
        }

        switch (rgPicture.getCheckedRadioButtonId()) {
            case R.id.rbP1:
                picture = 1;
                break;
            case R.id.rbP2:
                picture = 2;
                break;
        }

        if (ctohtori.isChecked()) {
            tutkinnot = tutkinnot + " -Tekniikan tohtorin tutkinto";
            tutkinnot = tutkinnot + "\n";
        }
        if (cmaisteri.isChecked()) {
            tutkinnot = tutkinnot + " -Diplomi-insinöörin tutkinto";
            tutkinnot = tutkinnot + "\n";
        }
        if (ckandi.isChecked()) {
            tutkinnot = tutkinnot + " -Kandidaatin tutkinto";
            tutkinnot = tutkinnot + "\n";
        }
        if (cuimari.isChecked()) {
            tutkinnot = tutkinnot + " -Uimamaisteri";
            tutkinnot = tutkinnot + "\n";
        }

        UserStorage.getInstance().addUser(new UserListAdapter.User(firstname, lastname, eemail, suuntaus, picture, tutkinnot));
        firstName.getText().clear();
        lastName.getText().clear();
        email.getText().clear();
        rgPicture.clearCheck();
        rg.clearCheck();
        tutkinnot = "";
        cuimari.setChecked(false);
        ctohtori.setChecked(false);
        cmaisteri.setChecked(false);
        ckandi.setChecked(false);

        UserStorage.getInstance().saveUsers(this);
    }

    public void switchToMain (View view) {

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}