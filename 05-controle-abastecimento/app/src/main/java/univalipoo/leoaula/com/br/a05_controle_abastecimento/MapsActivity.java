package univalipoo.leoaula.com.br.a05_controle_abastecimento;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ArrayList<Abastecimento> listaCoordenadas;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.mMap = googleMap;

        this.listaCoordenadas = AbastecimentoDao.getList(this.getApplicationContext());

        for (int i = 0; i < listaCoordenadas.size(); i++) {
            if (listaCoordenadas.get(i).getLatitude() != 90) {
                this.mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(listaCoordenadas.get(i).getLatitude(), listaCoordenadas.get(i).getLongitude()))
                        .title(listaCoordenadas.get(i).getNomePosto())
                        .snippet(listaCoordenadas.get(i).getData()));

                this.mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(listaCoordenadas.get(i).getLatitude(), listaCoordenadas.get(i).getLongitude()), 15f));
            }
        }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            return;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);

        mapFragment.getMapAsync(MapsActivity.this);
    }
}