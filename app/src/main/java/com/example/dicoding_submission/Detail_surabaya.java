package com.example.dicoding_submission;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Detail_surabaya extends AppCompatActivity {

    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout_surabaya);
        back = (Button)findViewById(R.id.kembali);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtomain = new Intent(Detail_surabaya.this,MainActivity.class);
                startActivity(backtomain);
            }
        });
    }
}