package com.example.administrador.tarea2mapas;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String nombreMapa;
    private double latitud;
    private double longitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        Bundle extras =  getIntent().getExtras();
        nombreMapa  = extras.getString(getResources().getString(R.string.nombre_mapa));
        latitud     = extras.getDouble(getResources().getString(R.string.latitud));
        longitud    = extras.getDouble(getResources().getString(R.string.longitud));
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
        LatLng puntoMapa = new LatLng(latitud, longitud);
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);  // Tipo de mapa
        mMap.addMarker(new MarkerOptions().position(puntoMapa).title(nombreMapa));
        UiSettings uiSettings = mMap.getUiSettings();   // Crea los controles de usuario
        uiSettings.setZoomControlsEnabled(true);        // Habilita los controles de zoom para el usuario
        float valorZoom =16;                            // Zoom inicial
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(puntoMapa, valorZoom));
    }
}
