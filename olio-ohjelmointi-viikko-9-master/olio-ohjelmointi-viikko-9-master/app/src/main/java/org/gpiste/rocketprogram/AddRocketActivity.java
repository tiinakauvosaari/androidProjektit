package org.gpiste.rocketprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AddRocketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_rocket);
    }

    public void addRocket(View view) {

        RadioGroup rgRocketType = findViewById(R.id.rgRocketType);

        switch (rgRocketType.getCheckedRadioButtonId()) {
            case R.id.rbStarship:
                Storage.getInstance().addRocket(new Starship());
                break;
            case R.id.rbSls:
                Storage.getInstance().addRocket(new Sls());
                break;
            case R.id.rbAriane6:
                Storage.getInstance().addRocket(new Starship());
                break;
        }

    }
}