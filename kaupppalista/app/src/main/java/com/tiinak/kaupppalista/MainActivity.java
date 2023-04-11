package com.tiinak.kaupppalista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ItemStorage storage = ItemStorage.getInstance();

    //ItemListAdapter.Item item = null;


    //protected Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storage = ItemStorage.getInstance();
        recyclerView = findViewById(R.id.rvView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemListAdapter(getApplicationContext(), storage.getItems()));
      }


    public void switchToadItem (View view) {
        Intent intent = new Intent(this,AddItem.class);
        startActivity(intent);
    }

}