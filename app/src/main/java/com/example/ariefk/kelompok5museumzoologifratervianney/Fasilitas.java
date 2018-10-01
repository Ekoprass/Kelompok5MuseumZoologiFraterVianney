package com.example.ariefk.kelompok5museumzoologifratervianney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fasilitas extends AppCompatActivity {
    private Button myDeskripsi, myHome, myMap, myOpini, myGaleri, myFasilitas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //digunakan untuk membuat Actvity
        setContentView(R.layout.fasilitas_view); //Menyatakan bahwa activity dari Class ini adalah Activity_home.xml
        myHome = (Button) findViewById(R.id.ButtonHome);//menyatakan bahwa id button profil disimpan pada object
        myHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(n);
            }
        });
        myGaleri = (Button) findViewById(R.id.ButtonGaleri);//menyatakan bahwa id button profil disimpan pada object
        myGaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(getApplicationContext(),Galeri.class);
                startActivity(n);
            }
        });
        myFasilitas = (Button) findViewById(R.id.ButtonFasilitas);//menyatakan bahwa id button profil disimpan pada object
        myFasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(getApplicationContext(),Fasilitas.class);
                startActivity(n);
            }
        });

        myDeskripsi = (Button) findViewById(R.id.ButtonDetail);//menyatakan bahwa id button profil disimpan pada object
        myDeskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(getApplicationContext(),Detailwisata.class);
                startActivity(n);
            }
        });

        myOpini = (Button) findViewById(R.id.ButtonOpini);//menyatakan bahwa id button profil disimpan pada object
        myOpini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(getApplicationContext(),Opini.class);
                startActivity(n);
            }
        });
    }
}
