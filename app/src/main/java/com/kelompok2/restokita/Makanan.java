package com.kelompok2.restokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Makanan extends AppCompatActivity {
    TextView sumnasgor,sumnasipadang,sumayambakar,sumayampenyet,sumsop, harganasgor;
    Button cekot, pesenminum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtx40series);

        sumnasgor = findViewById(R.id.bnyknasi);
        sumnasipadang = findViewById(R.id.bnyknaspa);
        sumayambakar = findViewById(R.id.bnykaymbkr);
        sumayampenyet = findViewById(R.id.bnykaympyt);
        sumsop = findViewById(R.id.bnyksop);
        cekot = findViewById(R.id.cekot);
        pesenminum = findViewById(R.id.keminuman);
        harganasgor = findViewById(R.id.hnsgor);

        pesenminum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                minuman();
            }
        });
        cekot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekout();
            }
        });
    }
    public void minuman(){
        String nasgor = sumnasgor.getText().toString();
        String naspad = sumnasipadang.getText().toString();
        String aymbkr = sumayambakar.getText().toString();
        String aympyt = sumayampenyet.getText().toString();
        String sop = sumsop.getText().toString();
        String before = "1";
        Intent i = new Intent(this,Minuman.class);
        i.putExtra("pesennasgor",nasgor);
        i.putExtra("pesennaspad",naspad);
        i.putExtra("pesenaymbkr",aymbkr);
        i.putExtra("pesenaympyt",aympyt);
        i.putExtra("pesensop",sop);
        i.putExtra("pageasal",before);
        startActivity(i);
    }

    public void cekout(){
        String before = getIntent().getStringExtra("pageasal");
        Integer beforeid = Integer.parseInt(before);

        String nasgor = sumnasgor.getText().toString();
        String naspad = sumnasipadang.getText().toString();
        String aymbkr = sumayambakar.getText().toString();
        String aympyt = sumayampenyet.getText().toString();
        String sop = sumsop.getText().toString();
        if (beforeid == 1){
            String beforetab = "1";
            Intent i = new Intent(this,Tujuan.class);
            i.putExtra("pesennasgor",nasgor);
            i.putExtra("pesennaspad",naspad);
            i.putExtra("pesenaymbkr",aymbkr);
            i.putExtra("pesenaympyt",aympyt);
            i.putExtra("pesensop",sop);
            i.putExtra("pageasal",beforetab);
            startActivity(i);
        }else if (beforeid == 2){
            String esteh = getIntent().getStringExtra("pesenesteh");
            String orange = getIntent().getStringExtra("pesenorange");
            String avocado = getIntent().getStringExtra("pesenavocado");
            String coklat = getIntent().getStringExtra("pesencoklat");
            String caplate = getIntent().getStringExtra("pesencaplate");
            Intent i = new Intent(this,Tujuan.class);
            String beforetab = "12";
            i.putExtra("pageasal",beforetab);
            i.putExtra("pesennasgor",nasgor);
            i.putExtra("pesennaspad",naspad);
            i.putExtra("pesenaymbkr",aymbkr);
            i.putExtra("pesenaympyt",aympyt);
            i.putExtra("pesensop",sop);
            i.putExtra("pesenesteh",esteh);
            i.putExtra("pesenorange",orange);
            i.putExtra("pesenavocado",avocado);
            i.putExtra("pesencoklat",coklat);
            i.putExtra("pesencaplate",caplate);
            startActivity(i);
        }

    }

    public void tambahnasgor(View view) {
        String porsi;
        porsi = sumnasgor.getText().toString();
        Integer jumlah = Integer.parseInt(porsi)+1;
        porsi = jumlah.toString();
        sumnasgor.setText(porsi);
    }

    public void kurangnasgor(View view) {
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

    public void tambahnaspad(View view) {
        String porsi;
        porsi = sumnasipadang.getText().toString();
        Integer jumlah = Integer.parseInt(porsi)+1;
        porsi = jumlah.toString();
        sumnasipadang.setText(porsi);
    }

    public void kurangnaspad(View view) {
        String porsi;
        porsi = sumnasipadang.getText().toString();
        Integer cekjumlah = Integer.parseInt(porsi);
        if (cekjumlah <= 0){
            Toast.makeText(getApplicationContext(),"Maaf pesanan tidak bisa kurang dari 0",Toast.LENGTH_LONG).show();
        }else{
            Integer jumlah = Integer.parseInt(porsi)-1;
            porsi = jumlah.toString();
            sumnasipadang.setText(porsi);
        }
    }

    public void tambahabakar(View view) {
        String porsi;
        porsi = sumayambakar.getText().toString();
        Integer jumlah = Integer.parseInt(porsi)+1;
        porsi = jumlah.toString();
        sumayambakar.setText(porsi);
    }

    public void kurangabakar(View view) {
        String porsi;
        porsi = sumayambakar.getText().toString();
        Integer cekjumlah = Integer.parseInt(porsi);
        if (cekjumlah <= 0){
            Toast.makeText(getApplicationContext(),"Maaf pesanan tidak bisa kurang dari 0",Toast.LENGTH_LONG).show();
        }else{
            Integer jumlah = Integer.parseInt(porsi)-1;
            porsi = jumlah.toString();
            sumayambakar.setText(porsi);
        }
    }

    public void tambahapenyet(View view) {
        String porsi;
        porsi = sumayampenyet.getText().toString();
        Integer jumlah = Integer.parseInt(porsi)+1;
        porsi = jumlah.toString();
        sumayampenyet.setText(porsi);
    }

    public void kurangapenyet(View view) {
        String porsi;
        porsi = sumayampenyet.getText().toString();
        Integer cekjumlah = Integer.parseInt(porsi);
        if (cekjumlah <= 0){
            Toast.makeText(getApplicationContext(),"Maaf pesanan tidak bisa kurang dari 0",Toast.LENGTH_LONG).show();
        }else{
            Integer jumlah = Integer.parseInt(porsi)-1;
            porsi = jumlah.toString();
            sumayampenyet.setText(porsi);
        }
    }

    public void tambahsop(View view) {
        String porsi;
        porsi = sumsop.getText().toString();
        Integer jumlah = Integer.parseInt(porsi)+1;
        porsi = jumlah.toString();
        sumsop.setText(porsi);
    }

    public void kurangsop(View view) {
        String porsi;
        porsi = sumsop.getText().toString();
        Integer cekjumlah = Integer.parseInt(porsi);
        if (cekjumlah <= 0){
            Toast.makeText(getApplicationContext(),"Maaf pesanan tidak bisa kurang dari 0",Toast.LENGTH_LONG).show();
        }else{
            Integer jumlah = Integer.parseInt(porsi)-1;
            porsi = jumlah.toString();
            sumsop.setText(porsi);
        }
    }
}