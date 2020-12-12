package com.example.interactiondemo;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Page2<lng> extends AppCompatActivity {
    public void  clickTaipeiRest(View view) {
        Intent intent = new Intent();
        intent.setClass(Page2.this, TaipeiRest.class);
        startActivity(intent);
    }
    public void  clickTaipeiDrink(View view) {
        Intent intent = new Intent();
        intent.setClass(Page2.this, TaipeiDrink.class);
        startActivity(intent);
    }
    public void  clickTaiwanRest(View view) {
        Intent intent = new Intent();
        intent.setClass(Page2.this, TaiwanRest.class);
        startActivity(intent);
    }
    public void  clickTaiwanDrink(View view) {
        Intent intent = new Intent();
        intent.setClass(Page2.this, TaiwanDrink.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}