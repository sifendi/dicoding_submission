package com.example.dicoding_submission;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Detail_Surabaya extends AppCompatActivity {

    Button backss;
    String Detailtitle ="Detail Page";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout_surabaya);
        setActionBarTitle(Detailtitle);


        backss = (Button)findViewById(R.id.kembali);
        backss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtomain = new Intent(Detail_Surabaya.this,MainActivity.class);
                startActivity(backtomain);
            }
        });
    }





    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}