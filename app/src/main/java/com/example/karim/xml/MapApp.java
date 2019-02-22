package com.example.karim.xml;

import android.content.Intent;
import android.graphics.Camera;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapApp extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_app);

        SupportMapFragment supportMapFragment = (SupportMapFragment)getSupportFragmentManager()
                .findFragmentById(R.id.map);
        supportMapFragment.getMapAsync( this);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapApp.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;

        LatLng magazine = new LatLng(55.777902, 38.449754);
        LatLng shop = new LatLng(55.773432, 38.447218);
        LatLng shop1 = new LatLng(55.780875, 38.433743);
        LatLng shop2 = new LatLng(55.780249, 38.440922);
        LatLng shop3 = new LatLng(55.777903, 38.449709);
        LatLng shop4 = new LatLng(55.796802, 38.444916);
        LatLng shop5 = new LatLng(55.790540, 38.437294);
        LatLng shop6 = new LatLng(55.790919, 38.443043);
        LatLng shop7 = new LatLng(55.790047, 38.449380);
        LatLng shop8 = new LatLng(55.767277, 38.418076);
        LatLng shop9 = new LatLng(55.765980, 38.426423);
        LatLng shop10 = new LatLng(55.771247, 38.430974);
        LatLng shop11 = new LatLng(55.771247, 38.430974);
        LatLng shop12 = new LatLng(55.770193, 38.438684);
        LatLng shop13 = new LatLng(55.764197, 38.444639);
        LatLng shop14 = new LatLng(55.766034, 38.447721);
        map.addMarker(new MarkerOptions().position(magazine).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(magazine));
        map.addMarker(new MarkerOptions().position(shop).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop));
        map.addMarker(new MarkerOptions().position(shop1).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop1));
        map.addMarker(new MarkerOptions().position(shop2).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop2));
        map.addMarker(new MarkerOptions().position(shop3).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop3));
        map.addMarker(new MarkerOptions().position(shop4).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop4));
        map.addMarker(new MarkerOptions().position(shop5).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop5));
        map.addMarker(new MarkerOptions().position(shop6).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop6));
        map.addMarker(new MarkerOptions().position(shop7).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop7));
        map.addMarker(new MarkerOptions().position(shop8).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop8));
        map.addMarker(new MarkerOptions().position(shop9).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop9));
        map.addMarker(new MarkerOptions().position(shop10).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop10));
        map.addMarker(new MarkerOptions().position(shop11).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop11));
        map.addMarker(new MarkerOptions().position(shop12).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop12));
        map.addMarker(new MarkerOptions().position(shop13).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop13));
        map.addMarker(new MarkerOptions().position(shop14).title("Пятерочка"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop14));



    }
}
