package com.example.dicoding_submission;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Detail_Semarang extends AppCompatActivity {

    Button back;
    String Detailtitle ="Detail Page";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout_semarang);
        setActionBarTitle(Detailtitle);

        back = (Button)findViewById(R.id.kembali);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtomain = new Intent(Detail_Semarang.this,MainActivity.class);
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