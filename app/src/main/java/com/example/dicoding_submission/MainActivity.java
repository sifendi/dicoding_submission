package com.example.dicoding_submission;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{

        RecyclerView recyclerKota;
        ArrayList<Kota> arraylistdata = new ArrayList<>();
        String HeaderTitle = "Dicoding Untuk Indonesia";
        CardViewKotaAdapter cardViewHeroAdapter;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_layout);
//            setActionBarTitle(HeaderTitle);

            // Find the toolbar view inside the activity layout
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);


            recyclerKota = findViewById(R.id.rv_kota);
            recyclerKota.setHasFixedSize(true);
            arraylistdata.addAll(KotaData.getListData());
            showRecyclerCardView();
    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.listmenu, menu);
            return true;
        }


        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            setMode(item.getItemId());
            return super.onOptionsItemSelected(item);
        }

        public void setMode(int selectedMode) {
            switch (selectedMode) {
                case R.id.myprofile:
                    bukaabout();
                    break;
            }
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

        public void bukaabout(){
            Intent halamanfendi = new Intent(MainActivity.this,About.class);
            startActivity(halamanfendi);
        }



    }