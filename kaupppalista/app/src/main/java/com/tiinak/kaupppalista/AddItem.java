package com.tiinak.kaupppalista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddItem extends AppCompatActivity{

    protected EditText newitem;
    protected EditText newitemextra;

    protected String newitemString;
    protected String newitemextraString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aditem);

        newitem = findViewById(R.id.newitem);
        newitemextra = findViewById(R.id.newitemextra);
     }


   public void addItem(View view) {

       newitemString = newitem.getText().toString();
       newitemextraString = newitemextra.getText().toString();

       ItemStorage.getInstance().addItem(new ItemListAdapter.Item(newitemString, newitemextraString));

       Intent intent = new Intent(this,MainActivity.class);
       startActivity(intent);

    }

}
