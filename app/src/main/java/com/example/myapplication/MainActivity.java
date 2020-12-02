package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imgGoogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgGoogle=findViewById(R.id.imgGoogle);
        Glide.with(this).load("https://www.pinclipart.com/picdir/big/87-878560_drawing-tigers-vector-dibujos-de-tigres-blanco-y.png").into(imgGoogle);
        Button btnGo = (Button) findViewById(R.id.buttongo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

            }

        });




    }
}