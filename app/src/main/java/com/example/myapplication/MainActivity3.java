package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity3 extends AppCompatActivity {
    BottomNavigationView navbottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //navbottom.findViewById(R.id.bottom_navigation_view);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        //navbottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
          //  @Override
            //public boolean onNavigationItemSelected(@NonNull MenuItem item) {
              //  Toast.makeText(MainActivity3.this, item.getTitle()+" clicado.", Toast.LENGTH_SHORT).show();
                //return false;
            //}
        //});
    }
}