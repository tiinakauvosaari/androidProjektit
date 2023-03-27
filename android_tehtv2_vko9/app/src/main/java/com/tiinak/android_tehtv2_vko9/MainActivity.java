package com.tiinak.android_tehtv2_vko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    UserStorage storage = UserStorage.getInstance();
    UserListAdapter.User user = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToadUser (View view) {
        Intent intent = new Intent(this,activity_adUser.class);
        startActivity(intent);
    }

    public void switchToListUsers (View view) {
        Intent intent = new Intent(this,activity_listUsers.class);
        startActivity(intent);
    }

    }