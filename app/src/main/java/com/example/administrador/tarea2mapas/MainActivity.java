package com.example.administrador.tarea2mapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionbar); // Inicializa el actionbar
        setSupportActionBar(miActionBar);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.itMenuKiyu:
                Intent intent = new Intent(this, MapaActivity.class);
                intent.putExtra(getResources().getString(R.string.nombre_mapa), "Balneario Kiyú");
                intent.putExtra(getResources().getString(R.string.latitud), -34.700770);
                intent.putExtra(getResources().getString(R.string.longitud), -56.732759);
                startActivity(intent);
                break;
            case R.id.itMenuTeatro:
                Intent intent2 = new Intent(this, MapaActivity.class);
                intent2.putExtra(getResources().getString(R.string.nombre_mapa), "Teatro Bartolomé Macció");
                intent2.putExtra(getResources().getString(R.string.latitud), -34.338838);
                intent2.putExtra(getResources().getString(R.string.longitud), -56.713555);
                startActivity(intent2);
                break;
            case R.id.itMenuSierras:
                Intent intent3 = new Intent(this, MapaActivity.class);
                intent3.putExtra(getResources().getString(R.string.nombre_mapa), "Sierras de Mahoma");
                intent3.putExtra(getResources().getString(R.string.latitud), -34.065773);
                intent3.putExtra(getResources().getString(R.string.longitud), -56.892143);
                startActivity(intent3);
                break;
            case R.id.itMenuCufre:
                Intent intent4 = new Intent(this, MapaActivity.class);
                intent4.putExtra(getResources().getString(R.string.nombre_mapa), "Balneario Boca de Cufré");
                intent4.putExtra(getResources().getString(R.string.latitud), -34.446778);
                intent4.putExtra(getResources().getString(R.string.longitud), -57.150670);
                startActivity(intent4);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void irKiyu(View view){
        Intent intent = new Intent(this, MapaActivity.class);
        intent.putExtra(getResources().getString(R.string.nombre_mapa), "Balneario Kiyú");
        intent.putExtra(getResources().getString(R.string.latitud), -34.700770);
        intent.putExtra(getResources().getString(R.string.longitud), -56.732759);
        startActivity(intent);
    }

    public void irTeatro(View view){
        Intent intent = new Intent(this, MapaActivity.class);
        intent.putExtra(getResources().getString(R.string.nombre_mapa), "Teatro Bartolomé Macció");
        intent.putExtra(getResources().getString(R.string.latitud), -34.338838);
        intent.putExtra(getResources().getString(R.string.longitud), -56.713555);
        startActivity(intent);
    }

    public void irSerras(View view){
        Intent intent = new Intent(this, MapaActivity.class);
        intent.putExtra(getResources().getString(R.string.nombre_mapa), "Sierras de Mahoma");
        intent.putExtra(getResources().getString(R.string.latitud), -34.065773);
        intent.putExtra(getResources().getString(R.string.longitud), -56.892143);
        startActivity(intent);
    }

    public void irCufre(View view){
        Intent intent = new Intent(this, MapaActivity.class);
        intent.putExtra(getResources().getString(R.string.nombre_mapa), "Balneario Boca de Cufré");
        intent.putExtra(getResources().getString(R.string.latitud), -34.446778);
        intent.putExtra(getResources().getString(R.string.longitud), -57.150670);
        startActivity(intent);
    }
}
