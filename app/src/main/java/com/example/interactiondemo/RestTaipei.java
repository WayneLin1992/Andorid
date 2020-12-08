package com.example.interactiondemo;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RestTaipei extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_taipei);
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
        LatLng sydney = new LatLng(25.04376592681877, 121.53251432752204);//25.04376592681877, 121.53251432752204
        mMap.addMarker(new MarkerOptions().position(sydney).title("御膳品水煎包"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        LatLng sydney1 = new LatLng(25.04372794794735, 121.53129045450744);//25.04372794794735, 121.53129045450744
        mMap.addMarker(new MarkerOptions().position(sydney1).title("垃圾(喇舌)麵"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney1));
        LatLng sydney2 = new LatLng(25.043801168884134, 121.53177703916406);//25.043801168884134, 121.53177703916406
        mMap.addMarker(new MarkerOptions().position(sydney2).title("阿姐的店碳烤三明治"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney2));
        LatLng sydney3 = new LatLng(25.043540287702744, 121.53174582937278);//25.043540287702744, 121.53174582937278
        mMap.addMarker(new MarkerOptions().position(sydney3).title("大福燒"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney3));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 16F));
    }
}