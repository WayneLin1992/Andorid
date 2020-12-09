package com.example.interactiondemo;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DrinkTaiwan extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_taiwan);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(25.014354711542456, 121.53336282204208);//25.014354711542456, 121.53336282204208
        mMap.addMarker(new MarkerOptions().position(sydney).title("50嵐 公館店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        LatLng sydney1 = new LatLng(25.014856213013868, 121.53319526622103);//25.014856213013868, 121.53319526622103
        mMap.addMarker(new MarkerOptions().position(sydney1).title("COMEBUY 公館店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney1));
        LatLng sydney2 = new LatLng(25.01346117094188, 121.5347400969072);//25.01346117094188, 121.5347400969072
        mMap.addMarker(new MarkerOptions().position(sydney2).title("可不可熟成紅茶 公館店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney2));
        LatLng sydney3 = new LatLng(25.013068659024277, 121.53584207535899);//25.013068659024277, 121.53584207535899
        mMap.addMarker(new MarkerOptions().position(sydney3).title("迷客夏 公館店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney3));
        LatLng sydney4 = new LatLng(25.012936892663664, 121.53596899829418);//25.012936892663664, 121.53596899829418
        mMap.addMarker(new MarkerOptions().position(sydney4).title("春芳號 公館店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney4));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 16F));

    }
}