package com.kelompok2.restokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Makanan(View view) {
        String before = "1";
        Intent i = new Intent(this, Makanan.class);
        i.putExtra("pageasal",before);
        startActivity(i);
    }

    public void minuman(View view) {
        String before = "2";
        Intent i = new Intent(this, Minuman.class);
        i.putExtra("pageasal",before);
        startActivity(i);
    }

    public void profiles(View view) {
        Intent i = new Intent(this, Profile.class);
        startActivity(i);
    }
}