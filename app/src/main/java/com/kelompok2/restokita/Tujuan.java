package com.kelompok2.restokita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tujuan extends AppCompatActivity {
    EditText nama, alamat, nohp;
    Button konfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuan);

        nama = findViewById(R.id.nama);
        alamat = findViewById(R.id.alamat);
        nohp = findViewById(R.id.nohp);
        konfirm = findViewById(R.id.konfirm);

        konfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                konfirmasi();
            }
        });
    }

    private void konfirmasi() {
        String asal = getIntent().getStringExtra("pageasal");
        Integer asalid = Integer.parseInt(asal);
        String vnama = nama.getText().toString();
        String valamat = alamat.getText().toString();
        String vnohp = nohp.getText().toString();
        if (asalid == 1) {
            String pesan1 = getIntent().getStringExtra("pesennasgor");
            String pesan2 = getIntent().getStringExtra("pesennaspad");
            String pesan3 = getIntent().getStringExtra("pesenaymbkr");
            String pesan4 = getIntent().getStringExtra("pesenaympyt");
            String pesan5 = getIntent().getStringExtra("pesensop");
            String before = "1";
            Intent i = new Intent(this, MainActivity.class);
            i.putExtra("nama", vnama);
            i.putExtra("alamat", valamat);
            i.putExtra("nohp", vnohp);
            i.putExtra("pesennasgor", pesan1);
            i.putExtra("pesennaspad", pesan2);
            i.putExtra("pesenaymbkr", pesan3);
            i.putExtra("pesenaympyt", pesan4);
            i.putExtra("pesensop", pesan5);
            i.putExtra("pageasal", before);
            startActivity(i);
        } else if (asalid == 2) {
            String pesan1 = getIntent().getStringExtra("pesenesteh");
            String pesan2 = getIntent().getStringExtra("pesenorange");
            String pesan3 = getIntent().getStringExtra("pesenavocado");
            String pesan4 = getIntent().getStringExtra("pesencoklat");
            String pesan5 = getIntent().getStringExtra("pesencaplate");
            Intent i = new Intent(this,MainActivity.class);
            String beforetab = "2";
            i.putExtra("nama", vnama);
            i.putExtra("alamat", valamat);
            i.putExtra("nohp", vnohp);
            i.putExtra("pageasal",beforetab);
            i.putExtra("pesenesteh",pesan1);
            i.putExtra("pesenorange",pesan2);
            i.putExtra("pesenavocado",pesan3);
            i.putExtra("pesencoklat",pesan4);
            i.putExtra("pesencaplate",pesan5);
            startActivity(i);
        }
        else if (asalid == 12) {
            String pesan1 = getIntent().getStringExtra("pesennasgor");
            String pesan2 = getIntent().getStringExtra("pesennaspad");
            String pesan3 = getIntent().getStringExtra("pesenaymbkr");
            String pesan4 = getIntent().getStringExtra("pesenaympyt");
            String pesan5 = getIntent().getStringExtra("pesensop");
            String esteh = getIntent().getStringExtra("pesenesteh");
            String orange = getIntent().getStringExtra("pesenorange");
            String avocado = getIntent().getStringExtra("pesenavocado");
            String coklat = getIntent().getStringExtra("pesencoklat");
            String caplate = getIntent().getStringExtra("pesencaplate");
            Intent i = new Intent(this,MainActivity.class);
            String beforetab = "12";
            i.putExtra("pageasal",beforetab);
            i.putExtra("nama", vnama);
            i.putExtra("alamat", valamat);
            i.putExtra("nohp", vnohp);
            i.putExtra("pesennasgor",pesan1);
            i.putExtra("pesennaspad",pesan2);
            i.putExtra("pesenaymbkr",pesan3);
            i.putExtra("pesenaympyt",pesan4);
            i.putExtra("pesensop",pesan5);
            i.putExtra("pesenesteh",esteh);
            i.putExtra("pesenorange",orange);
            i.putExtra("pesenavocado",avocado);
            i.putExtra("pesencoklat",coklat);
            i.putExtra("pesencaplate",caplate);
            startActivity(i);
        }
    }
}