package com.example.interactiondemo;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class COMEBUY extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_o_m_e_b_u_y);
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
        LatLng sydney1 = new LatLng(25.04386704953016, 121.53220445087891); //25.04386704953016, 121.53220445087891
        mMap.addMarker(new MarkerOptions().position(sydney1).title("COMEBUY八德店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney1));
        LatLng sydney = new LatLng(25.044426873762887, 121.53315869979498); //25.044426873762887, 121.53315869979498
        mMap.addMarker(new MarkerOptions().position(sydney).title("COMEBUY台科店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        LatLng sydney2 = new LatLng(25.044235576291722, 121.53287314570865); //25.044235576291722, 121.53287314570865
        mMap.addMarker(new MarkerOptions().position(sydney2).title("日出茶太 光華店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney2));
        LatLng sydney3 = new LatLng(25.04383275394126, 121.53225067104552); //25.04383275394126, 121.53225067104552
        mMap.addMarker(new MarkerOptions().position(sydney3).title("春芳號 忠孝新生店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney3));
        LatLng sydney4 = new LatLng(25.043768302242395, 121.53130806655568); //25.043768302242395, 121.53130806655568
        mMap.addMarker(new MarkerOptions().position(sydney4).title("茶湯會 光華店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney4));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 16F));
    }
}