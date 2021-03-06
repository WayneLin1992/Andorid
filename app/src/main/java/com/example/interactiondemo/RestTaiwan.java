package com.example.interactiondemo;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RestTaiwan extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_taiwan);
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
        LatLng sydney = new LatLng(25.013943324863092, 121.5349829950568);//25.013943324863092, 121.5349829950568
        mMap.addMarker(new MarkerOptions().position(sydney).title("水源市場"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        LatLng sydney1 = new LatLng(25.01320731326907, 121.53545765272828);//25.01320731326907, 121.53545765272828
        mMap.addMarker(new MarkerOptions().position(sydney1).title("山嵐拉麵 公館店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney1));
        LatLng sydney2 = new LatLng(25.014516748780014, 121.53461238156409);//25.014516748780014, 121.53461238156409
        mMap.addMarker(new MarkerOptions().position(sydney2).title("麥當勞 公館店"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney2));
        LatLng sydney3 = new LatLng(25.012734854486517, 121.5354430421749);//25.012734854486517, 121.5354430421749
        mMap.addMarker(new MarkerOptions().position(sydney3).title("墨洋拉麵"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney3));
        LatLng sydney4 = new LatLng(25.012863576399273, 121.53555542515176);//25.012863576399273, 121.53555542515176
        mMap.addMarker(new MarkerOptions().position(sydney4).title("阿里媽媽南洋料理"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney4));
        LatLng sydney5 = new LatLng(25.014428421126127, 121.53351331819182);//25.014428421126127, 121.53351331819182
        mMap.addMarker(new MarkerOptions().position(sydney5).title("鷹流東京豚骨拉麵"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney5));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 16F));
    }
}