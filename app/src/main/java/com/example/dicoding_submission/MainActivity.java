package com.example.dicoding_submission;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

        RecyclerView recyclerKota;
        ArrayList<Kota> arraylistdata = new ArrayList<>();
        String HeaderTitle = "Dicoding Untuk Indonesia";
        CardViewKotaAdapter cardViewHeroAdapter;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_layout);
            setActionBarTitle(HeaderTitle);

//            Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
//            setSupportActionBar(toolbar);
//
//            getSupportActionBar().setTitle(HeaderTitle);
//            toolbar.setSubtitle("https://badoystudio.com");
//            toolbar.setLogo(R.drawable.ic_location_city_black_24dp);ic_location_city_black_24dp

            recyclerKota = findViewById(R.id.rv_kota);
            recyclerKota.setHasFixedSize(true);
            arraylistdata.addAll(KotaData.getListData());
            showRecyclerCardView();


//            CardViewKotaAdapter cardViewHeroAdapter


    }


        private void showRecyclerCardView(){
            recyclerKota.setLayoutManager(new LinearLayoutManager(this));
            cardViewHeroAdapter = new CardViewKotaAdapter(arraylistdata);
            recyclerKota.setAdapter(cardViewHeroAdapter);

        }


        private void setActionBarTitle(String title) {
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle(title);
            }
        }

//        private void showSelectedHero(Kota kota) {
//            Toast.makeText(this, "Kamu memilih " + kota.getName(), Toast.LENGTH_SHORT).show();
//        }


    }