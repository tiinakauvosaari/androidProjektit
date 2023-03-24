package com.tiinak.android_tehtv2_vko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class activity_adUser extends AppCompatActivity {

    protected EditText firstName;
    protected  EditText lastName;
    protected  EditText email;

    protected RadioGroup rg;
    protected  String suuntaus;

    protected String firstname;
    protected String lastname;
    protected String eemail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_user);

        firstName = findViewById(R.id.adUserName);
        lastName = findViewById(R.id.adUserLastname);
        email = findViewById(R.id.adUserEmail);
        rg = findViewById(R.id.radioGroup);
    }

    public void addUser(View view){

        firstname = "" + firstName.getText().toString();
        lastname = "" + lastName.getText().toString();
        eemail = "" + email.getText().toString();

        switch(rg.getCheckedRadioButtonId()){
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
        UserStorage.getInstance().addUser(new User(firstname, lastname, eemail, suuntaus));
        firstName.getText().clear();
        lastName.getText().clear();
        email.getText().clear();
        rg.clearCheck();

    }

    public void switchToMain (View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}