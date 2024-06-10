package com.kelompok2.restokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Minuman extends AppCompatActivity {
    TextView sumnasgor,sumorange,sumavocado,sumcoklat,sumcaplate;
    Button cekot, keminuman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtx30series);

        sumnasgor = findViewById(R.id.bnyknasi);
        sumorange = findViewById(R.id.bnyk_org);
        sumavocado = findViewById(R.id.bnyk_avcd);
        sumcoklat = findViewById(R.id.bnyk_cklt);
        sumcaplate = findViewById(R.id.bnyk_cpcn);
        cekot = findViewById(R.id.cekot);
        keminuman = findViewById(R.id.keminuman);

        keminuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makanan();
            }
        });
        cekot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekoutdrink();
            }
        });
    }
    public void makanan(){
        String esteh = sumnasgor.getText().toString();
        String orange = sumorange.getText().toString();
        String avocado = sumavocado.getText().toString();
        String coklat = sumcoklat.getText().toString();
        String caplate = sumcaplate.getText().toString();
        String before = "2";
        Intent i = new Intent(this,Makanan.class);
        i.putExtra("pageasal",before);
        i.putExtra("pesenesteh",esteh);
        i.putExtra("pesenorange",orange);
        i.putExtra("pesenavocado",avocado);
        i.putExtra("pesencoklat",coklat);
        i.putExtra("pesencaplate",caplate);
        startActivity(i);
    }
    public void cekoutdrink(){
        String before = getIntent().getStringExtra("pageasal");
        Integer beforeid = Integer.parseInt(before);

        String esteh = sumnasgor.getText().toString();
        String orange = sumorange.getText().toString();
        String avocado = sumavocado.getText().toString();
        String coklat = sumcoklat.getText().toString();
        String caplate = sumcaplate.getText().toString();
        if (beforeid == 1){
            String pesan1 = getIntent().getStringExtra("pesennasgor");
            String pesan2 = getIntent().getStringExtra("pesennaspad");
            String pesan3 = getIntent().getStringExtra("pesenaymbkr");
            String pesan4 = getIntent().getStringExtra("pesenaympyt");
            String pesan5 = getIntent().getStringExtra("pesensop");
            Intent i = new Intent(this,Tujuan.class);
            String beforetab = "12";
            i.putExtra("pageasal",beforetab);
            i.putExtra("pesenesteh",esteh);
            i.putExtra("pesenorange",orange);
            i.putExtra("pesenavocado",avocado);
            i.putExtra("pesencoklat",coklat);
            i.putExtra("pesencaplate",caplate);
            i.putExtra("pesennasgor",pesan1);
            i.putExtra("pesennaspad",pesan2);
            i.putExtra("pesenaymbkr",pesan3);
            i.putExtra("pesenaympyt",pesan4);
            i.putExtra("pesensop",pesan5);
            startActivity(i);
        }else if (beforeid == 2){
            Intent i = new Intent(this,Tujuan.class);
            String beforetab = "2";
            i.putExtra("pageasal",beforetab);
            i.putExtra("pesenesteh",esteh);
            i.putExtra("pesenorange",orange);
            i.putExtra("pesenavocado",avocado);
            i.putExtra("pesencoklat",coklat);
            i.putExtra("pesencaplate",caplate);
            startActivity(i);
        }

    }

    public void tambahesteh(View view) {
        String porsi;
        porsi = sumnasgor.getText().toString();
        Integer jumlah = Integer.parseInt(porsi)+1;
        porsi = jumlah.toString();
        sumnasgor.setText(porsi);
    }

    public void kurangesteh(View view) {
        String porsi;
        porsi = sumnasgor.getText().toString();
        Integer cekjumlah = Integer.parseInt(porsi);
        if (cekjumlah <= 0){
            Toast.makeText(getApplicationContext(),"Maaf pesanan tidak bisa kurang dari 0",Toast.LENGTH_LONG).show();
        }else{
            Integer jumlah = Integer.parseInt(porsi)-1;
            porsi = jumlah.toString();
            sumnasgor.setText(porsi);
        }

    }

    public void tambahorange(View view) {
        String porsi;
        porsi = sumorange.getText().toString();
        Integer jumlah = Integer.parseInt(porsi)+1;
        porsi = jumlah.toString();
        sumorange.setText(porsi);
    }

    public void kurangorange(View view) {
        String porsi;
        porsi = sumorange.getText().toString();
        Integer cekjumlah = Integer.parseInt(porsi);
        if (cekjumlah <= 0){
            Toast.makeText(getApplicationContext(),"Maaf pesanan tidak bisa kurang dari 0",Toast.LENGTH_LONG).show();
        }else{
            Integer jumlah = Integer.parseInt(porsi)-1;
            porsi = jumlah.toString();
            sumorange.setText(porsi);
        }
    }

    public void tambahavocado(View view) {
        String porsi;
        porsi = sumavocado.getText().toString();
        Integer jumlah = Integer.parseInt(porsi)+1;
        porsi = jumlah.toString();
        sumavocado.setText(porsi);
    }

    public void kurangavocado(View view) {
        String porsi;
        porsi = sumavocado.getText().toString();
        Integer cekjumlah = Integer.parseInt(porsi);
        if (cekjumlah <= 0){
            Toast.makeText(getApplicationContext(),"Maaf pesanan tidak bisa kurang dari 0",Toast.LENGTH_LONG).show();
        }else{
            Integer jumlah = Integer.parseInt(porsi)-1;
            porsi = jumlah.toString();
            sumavocado.setText(porsi);
        }
    }

    public void tambahcoklat(View view) {
        String porsi;
        porsi = sumcoklat.getText().toString();
        Integer jumlah = Integer.parseInt(porsi)+1;
        porsi = jumlah.toString();
        sumcoklat.setText(porsi);
    }

    public void kurangcoklat(View view) {
        String porsi;
        porsi = sumcoklat.getText().toString();
        Integer cekjumlah = Integer.parseInt(porsi);
        if (cekjumlah <= 0){
            Toast.makeText(getApplicationContext(),"Maaf pesanan tidak bisa kurang dari 0",Toast.LENGTH_LONG).show();
        }else{
            Integer jumlah = Integer.parseInt(porsi)-1;
            porsi = jumlah.toString();
            sumcoklat.setText(porsi);
        }
    }

    public void tambahcaplate(View view) {
        String porsi;
        porsi = sumcaplate.getText().toString();
        Integer jumlah = Integer.parseInt(porsi)+1;
        porsi = jumlah.toString();
        sumcaplate.setText(porsi);
    }

    public void kurangcaplate(View view) {
        String porsi;
        porsi = sumcaplate.getText().toString();
        Integer cekjumlah = Integer.parseInt(porsi);
        if (cekjumlah <= 0){
            Toast.makeText(getApplicationContext(),"Maaf pesanan tidak bisa kurang dari 0",Toast.LENGTH_LONG).show();
        }else{
            Integer jumlah = Integer.parseInt(porsi)-1;
            porsi = jumlah.toString();
            sumcaplate.setText(porsi);
        }
    }
}