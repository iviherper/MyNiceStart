package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {
    BottomAppBar botonappbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        botonappbar = findViewById(R.id.bottom_app_bar);

        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Mostrando AlertDialog.", Toast.LENGTH_SHORT).show();
                ImageView image = new ImageView(MainActivity2.this);
                Picasso.get().load("https://pbs.twimg.com/profile_images/986618670666350592/CRxcpOzi_400x400.png").into(image);
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity2.this).
                                setMessage("Soy un AlertDialog de MyNiceStart").
                                setCancelable(true).
                                setPositiveButton("enviar", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                }).
                                setCancelable(true).
                                setPositiveButton("enviar", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                }).
                                setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                }).
                                setView(image);
                builder.create().show();
            }
        });
        botonappbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Menu Clicked.", Toast.LENGTH_SHORT).show();
            }
        });
        botonappbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity2.this, item.getTitle()+" Clicked", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}