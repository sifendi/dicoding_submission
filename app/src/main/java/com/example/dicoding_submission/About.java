package com.example.dicoding_submission;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class About extends AppCompatActivity {
    Button homex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);


        homex = (Button)findViewById(R.id.buttonhome);
        homex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtomain = new Intent(About.this,MainActivity.class);
                startActivity(backtomain);
            }
        });
    }


}
