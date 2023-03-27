package org.gpiste.rocketprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtRocketCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRocketCounter = findViewById(R.id.txtRocketCounter);

        Storage s = Storage.getInstance();

        s.addRocket(new Starship());
        s.addRocket(new Starship());
        s.addRocket(new Sls());
        s.addRocket(new Starship());

        txtRocketCounter.setText("Raketteja on: " + Rocket.rocketCounter);
    }

    public void switchToAddRocket(View view) {
        Intent intent = new Intent(this, AddRocketActivity.class);
        startActivity(intent);
    }

    public void switchToRocketList(View view) {
        Intent intent = new Intent(this, RocketListActivity.class);
        startActivity(intent);
    }

    public void updateRocketCounterNumber(View view) {
        txtRocketCounter.setText("Raketteja on: " + Rocket.rocketCounter);

    }

}