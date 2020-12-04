package com.example.interactiondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view){
        Log.i( "Info", "button press" );


    }
    public void  clickNextPage(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this , Page2.class);
        startActivity(intent);
    }
    public void login(View view){
        EditText Username = (EditText) findViewById(R.id.editTextUsername );
        Log.i(  "Info", "button pass");
        Log.i(  "Username",Username.getText().toString());
        Toast.makeText(this,   "hi " + Username.getText().toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}