package com.kelompok2.restokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView pesanan1,pesanan2,pesanan3,pesanan4,pesanan5,pesanan6,pesanan7,pesanan8,pesanan9,pesanan10,
            harga1, harga2,harga3,harga4,harga5,harga6,harga7,harga8,harga9,harga10,
            tipe,tipes, tothrg, ket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipe = findViewById(R.id.tipe);
        tipes = findViewById(R.id.tipes);
        tothrg = findViewById(R.id.hargatotal);
        pesanan1 = findViewById(R.id.pesanan1);
        pesanan2 = findViewById(R.id.pesanan2);
        pesanan3 = findViewById(R.id.pesanan3);
        pesanan4 = findViewById(R.id.pesanan4);
        pesanan5 = findViewById(R.id.pesanan5);
        pesanan6 = findViewById(R.id.pesanan6);
        pesanan7 = findViewById(R.id.pesanan7);
        pesanan8 = findViewById(R.id.pesanan8);
        pesanan9 = findViewById(R.id.pesanan9);
        pesanan10 = findViewById(R.id.pesanan10);
        harga1 = findViewById(R.id.harga1);
        harga2 = findViewById(R.id.harga2);
        harga3 = findViewById(R.id.harga3);
        harga4 = findViewById(R.id.harga4);
        harga5 = findViewById(R.id.harga5);
        harga6 = findViewById(R.id.harga6);
        harga7 = findViewById(R.id.harga7);
        harga8 = findViewById(R.id.harga8);
        harga9 = findViewById(R.id.harga9);
        harga10 = findViewById(R.id.harga10);
        ket = findViewById(R.id.ket);

        String nama = getIntent().getStringExtra("nama");
        String alamat = getIntent().getStringExtra("alamat");
        String nohp = getIntent().getStringExtra("nohp");
        String asal = getIntent().getStringExtra("pageasal");
        Integer asalid = Integer.parseInt(asal);
        Integer totalharga = 0;
        if (asalid == 1){
            tipe.setText("Makanan :");
            String pesan1 = getIntent().getStringExtra("pesennasgor");
            Integer cekpesan1 = Integer.parseInt(pesan1);
            String pesan2 = getIntent().getStringExtra("pesennaspad");
            Integer cekpesan2 = Integer.parseInt(pesan2);
            String pesan3 = getIntent().getStringExtra("pesenaymbkr");
            Integer cekpesan3 = Integer.parseInt(pesan3);
            String pesan4 = getIntent().getStringExtra("pesenaympyt");
            Integer cekpesan4 = Integer.parseInt(pesan4);
            String pesan5 = getIntent().getStringExtra("pesensop");
            Integer cekpesan5 = Integer.parseInt(pesan5);
            if (cekpesan1 > 0) {
                pesanan1.setText("Nasi Goreng x " + pesan1);
                Integer hargaNasgor = Integer.parseInt(pesan1) * 15000;
                harga1.setText(String.valueOf(hargaNasgor));
                if (cekpesan2 > 0){
                    pesanan2.setText("Nasi Padang x" + pesan2);
                    Integer harga = Integer.parseInt(pesan2) * 13000;
                    harga2.setText(String.valueOf(harga));
                    if (cekpesan3 > 0) {
                        pesanan3.setText("Ayam Bakar x" + pesan3);
                        harga = Integer.parseInt(pesan3) * 17000;
                        harga3.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan4.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga4.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan5.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga5.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan3.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga3.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }
                    }
                }else {
                    if (cekpesan3 > 0) {
                        pesanan2.setText("Ayam Bakar x" + pesan3);
                        Integer harga = Integer.parseInt(pesan3) * 17000;
                        harga2.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan3.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga3.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan2.setText("Ayam Penyet x" + pesan4);
                            Integer harga = Integer.parseInt(pesan4) * 18000;
                            harga2.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Sop x" + pesan5);
                                Integer harga = Integer.parseInt(pesan5) * 13000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }
                    }
                }
            }else {
                if (cekpesan2 > 0){
                    pesanan1.setText("Nasi Padang x" + pesan2);
                    Integer harga = Integer.parseInt(pesan2) * 13000;
                    harga1.setText(String.valueOf(harga));
                    if (cekpesan3 > 0) {
                        pesanan2.setText("Ayam Bakar x" + pesan3);
                        harga = Integer.parseInt(pesan3) * 17000;
                        harga2.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan3.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga3.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan2.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga2.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }
                    }
                }else {
                    if (cekpesan3 > 0) {
                        pesanan1.setText("Ayam Bakar x" + pesan3);
                        Integer harga = Integer.parseInt(pesan3) * 17000;
                        harga1.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan2.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga2.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan1.setText("Ayam Penyet x" + pesan4);
                            Integer harga = Integer.parseInt(pesan4) * 18000;
                            harga1.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan1.setText("Sop x" + pesan5);
                                Integer harga = Integer.parseInt(pesan5) * 13000;
                                harga1.setText(String.valueOf(harga));
                            }
                        }
                    }
                }
            }
        }
        else if (asalid == 2){
            tipe.setText("Minuman :");
            String pesan1 = getIntent().getStringExtra("pesenesteh");
            Integer cekpesan1 = Integer.parseInt(pesan1);
            String pesan2 = getIntent().getStringExtra("pesenorange");
            Integer cekpesan2 = Integer.parseInt(pesan2);
            String pesan3 = getIntent().getStringExtra("pesenavocado");
            Integer cekpesan3 = Integer.parseInt(pesan3);
            String pesan4 = getIntent().getStringExtra("pesencoklat");
            Integer cekpesan4 = Integer.parseInt(pesan4);
            String pesan5 = getIntent().getStringExtra("pesencaplate");
            Integer cekpesan5 = Integer.parseInt(pesan5);
            if (cekpesan1 > 0) {
                pesanan1.setText("Es Teh x" + pesan1);
                Integer hargaNasgor = Integer.parseInt(pesan1) * 3000;
                harga1.setText(String.valueOf(hargaNasgor));
                if (cekpesan2 > 0){
                    pesanan2.setText("Jus Orange x" + pesan2);
                    Integer harga = Integer.parseInt(pesan2) * 10000;
                    harga2.setText(String.valueOf(harga));
                    if (cekpesan3 > 0) {
                        pesanan3.setText("Jus Avocado x" + pesan3);
                        harga = Integer.parseInt(pesan3) * 12000;
                        harga3.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan4.setText("Chocolate x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 10000;
                            harga4.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan5.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga5.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan3.setText("Chocolate x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 10000;
                            harga3.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }
                    }
                }else {
                    if (cekpesan3 > 0) {
                        pesanan2.setText("Jus Avocado x" + pesan3);
                        Integer harga = Integer.parseInt(pesan3) * 12000;
                        harga2.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan3.setText("Chocolate x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 10000;
                            harga3.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan2.setText("Chocolate x" + pesan4);
                            Integer harga = Integer.parseInt(pesan4) * 10000;
                            harga2.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Capuchino Late x" + pesan5);
                                Integer harga = Integer.parseInt(pesan5) * 15000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }
                    }
                }
            }else {
                if (cekpesan2 > 0){
                    pesanan1.setText("Jus Orange x" + pesan2);
                    Integer harga = Integer.parseInt(pesan2) * 10000;
                    harga1.setText(String.valueOf(harga));
                    if (cekpesan3 > 0) {
                        pesanan2.setText("Jus Avocado x" + pesan3);
                        harga = Integer.parseInt(pesan3) * 12000;
                        harga2.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan3.setText("Chocolate x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 10000;
                            harga3.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan2.setText("Chocolate x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 10000;
                            harga2.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }
                    }
                }else {
                    if (cekpesan3 > 0) {
                        pesanan1.setText("Jus Avocado x" + pesan3);
                        Integer harga = Integer.parseInt(pesan3) * 12000;
                        harga1.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan2.setText("Chocolate x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 10000;
                            harga2.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan1.setText("Chocolate x" + pesan4);
                            Integer harga = Integer.parseInt(pesan4) * 10000;
                            harga1.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Capuchino Late x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 15000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan1.setText("Capuchino Late x" + pesan5);
                                Integer harga = Integer.parseInt(pesan5) * 15000;
                                harga1.setText(String.valueOf(harga));
                            }
                        }
                    }
                }
            }
        }
        else if (asalid == 12){
            tipe.setText("Makanan :");
            String pesan1 = getIntent().getStringExtra("pesennasgor");
            Integer cekpesan1 = Integer.parseInt(pesan1);
            String pesan2 = getIntent().getStringExtra("pesennaspad");
            Integer cekpesan2 = Integer.parseInt(pesan2);
            String pesan3 = getIntent().getStringExtra("pesenaymbkr");
            Integer cekpesan3 = Integer.parseInt(pesan3);
            String pesan4 = getIntent().getStringExtra("pesenaympyt");
            Integer cekpesan4 = Integer.parseInt(pesan4);
            String pesan5 = getIntent().getStringExtra("pesensop");
            Integer cekpesan5 = Integer.parseInt(pesan5);
            if (cekpesan1 > 0) {
                pesanan1.setText("Nasi Goreng x " + pesan1);
                Integer hargaNasgor = Integer.parseInt(pesan1) * 15000;
                harga1.setText(String.valueOf(hargaNasgor));
                if (cekpesan2 > 0){
                    pesanan2.setText("Nasi Padang x" + pesan2);
                    Integer harga = Integer.parseInt(pesan2) * 13000;
                    harga2.setText(String.valueOf(harga));
                    if (cekpesan3 > 0) {
                        pesanan3.setText("Ayam Bakar x" + pesan3);
                        harga = Integer.parseInt(pesan3) * 17000;
                        harga3.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan4.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga4.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan5.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga5.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan3.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga3.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }
                    }
                }else {
                    if (cekpesan3 > 0) {
                        pesanan2.setText("Ayam Bakar x" + pesan3);
                        Integer harga = Integer.parseInt(pesan3) * 17000;
                        harga2.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan3.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga3.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan2.setText("Ayam Penyet x" + pesan4);
                            Integer harga = Integer.parseInt(pesan4) * 18000;
                            harga2.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Sop x" + pesan5);
                                Integer harga = Integer.parseInt(pesan5) * 13000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }
                    }
                }
            }else {
                if (cekpesan2 > 0){
                    pesanan1.setText("Nasi Padang x" + pesan2);
                    Integer harga = Integer.parseInt(pesan2) * 13000;
                    harga1.setText(String.valueOf(harga));
                    if (cekpesan3 > 0) {
                        pesanan2.setText("Ayam Bakar x" + pesan3);
                        harga = Integer.parseInt(pesan3) * 17000;
                        harga2.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan3.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga3.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan4.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga4.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan2.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga2.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }
                    }
                }else {
                    if (cekpesan3 > 0) {
                        pesanan1.setText("Ayam Bakar x" + pesan3);
                        Integer harga = Integer.parseInt(pesan3) * 17000;
                        harga1.setText(String.valueOf(harga));
                        if (cekpesan4 > 0) {
                            pesanan2.setText("Ayam Penyet x" + pesan4);
                            harga = Integer.parseInt(pesan4) * 18000;
                            harga2.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan3.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga3.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan4 > 0) {
                            pesanan1.setText("Ayam Penyet x" + pesan4);
                            Integer harga = Integer.parseInt(pesan4) * 18000;
                            harga1.setText(String.valueOf(harga));
                            if (cekpesan5 > 0) {
                                pesanan2.setText("Sop x" + pesan5);
                                harga = Integer.parseInt(pesan5) * 13000;
                                harga2.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan5 > 0) {
                                pesanan1.setText("Sop x" + pesan5);
                                Integer harga = Integer.parseInt(pesan5) * 13000;
                                harga1.setText(String.valueOf(harga));
                            }
                        }
                    }
                }
            }
            tipes.setText("Minuman :");
            String pesan6 = getIntent().getStringExtra("pesenesteh");
            Integer cekpesan6 = Integer.parseInt(pesan6);
            String pesan7 = getIntent().getStringExtra("pesenorange");
            Integer cekpesan7 = Integer.parseInt(pesan7);
            String pesan8 = getIntent().getStringExtra("pesenavocado");
            Integer cekpesan8 = Integer.parseInt(pesan8);
            String pesan9 = getIntent().getStringExtra("pesencoklat");
            Integer cekpesan9 = Integer.parseInt(pesan9);
            String pesan10 = getIntent().getStringExtra("pesencaplate");
            Integer cekpesan10 = Integer.parseInt(pesan10);
            if (cekpesan6 > 0) {
                pesanan6.setText("Es Teh x" + pesan6);
                Integer hargaNasgor = Integer.parseInt(pesan6) * 3000;
                harga6.setText(String.valueOf(hargaNasgor));
                if (cekpesan7 > 0){
                    pesanan7.setText("Jus Orange x" + pesan7);
                    Integer harga = Integer.parseInt(pesan7) * 10000;
                    harga7.setText(String.valueOf(harga));
                    if (cekpesan8 > 0) {
                        pesanan8.setText("Jus Avocado x" + pesan8);
                        harga = Integer.parseInt(pesan8) * 12000;
                        harga8.setText(String.valueOf(harga));
                        if (cekpesan9 > 0) {
                            pesanan9.setText("Chocolate x" + pesan9);
                            harga = Integer.parseInt(pesan9) * 10000;
                            harga9.setText(String.valueOf(harga));
                            if (cekpesan10 > 0) {
                                pesanan10.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga10.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan10 > 0) {
                                pesanan9.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga9.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan9 > 0) {
                            pesanan8.setText("Chocolate x" + pesan9);
                            harga = Integer.parseInt(pesan9) * 10000;
                            harga8.setText(String.valueOf(harga));
                            if (cekpesan10 > 0) {
                                pesanan9.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga9.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan10 > 0) {
                                pesanan8.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga8.setText(String.valueOf(harga));
                            }
                        }
                    }
                }else {
                    if (cekpesan8 > 0) {
                        pesanan7.setText("Jus Avocado x" + pesan8);
                        Integer harga = Integer.parseInt(pesan8) * 12000;
                        harga7.setText(String.valueOf(harga));
                        if (cekpesan9 > 0) {
                            pesanan8.setText("Chocolate x" + pesan9);
                            harga = Integer.parseInt(pesan9) * 10000;
                            harga8.setText(String.valueOf(harga));
                            if (cekpesan10 > 0) {
                                pesanan9.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga9.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan10 > 0) {
                                pesanan8.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga8.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan9 > 0) {
                            pesanan7.setText("Chocolate x" + pesan9);
                            Integer harga = Integer.parseInt(pesan9) * 10000;
                            harga7.setText(String.valueOf(harga));
                            if (cekpesan10 > 0) {
                                pesanan8.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga8.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan10 > 0) {
                                pesanan7.setText("Capuchino Late x" + pesan10);
                                Integer harga = Integer.parseInt(pesan10) * 15000;
                                harga7.setText(String.valueOf(harga));
                            }
                        }
                    }
                }
            }else {
                if (cekpesan7 > 0){
                    pesanan6.setText("Jus Orange x" + pesan7);
                    Integer harga = Integer.parseInt(pesan7) * 10000;
                    harga6.setText(String.valueOf(harga));
                    if (cekpesan8 > 0) {
                        pesanan7.setText("Jus Avocado x" + pesan8);
                        harga = Integer.parseInt(pesan8) * 12000;
                        harga7.setText(String.valueOf(harga));
                        if (cekpesan9 > 0) {
                            pesanan8.setText("Chocolate x" + pesan9);
                            harga = Integer.parseInt(pesan9) * 10000;
                            harga8.setText(String.valueOf(harga));
                            if (cekpesan10 > 0) {
                                pesanan9.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga9.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan10 > 0) {
                                pesanan8.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga8.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan9 > 0) {
                            pesanan7.setText("Chocolate x" + pesan9);
                            harga = Integer.parseInt(pesan9) * 10000;
                            harga7.setText(String.valueOf(harga));
                            if (cekpesan10 > 0) {
                                pesanan8.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga8.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan10 > 0) {
                                pesanan7.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga7.setText(String.valueOf(harga));
                            }
                        }
                    }
                }else {
                    if (cekpesan8 > 0) {
                        pesanan6.setText("Jus Avocado x" + pesan8);
                        Integer harga = Integer.parseInt(pesan8) * 12000;
                        harga6.setText(String.valueOf(harga));
                        if (cekpesan9 > 0) {
                            pesanan7.setText("Chocolate x" + pesan9);
                            harga = Integer.parseInt(pesan9) * 10000;
                            harga7.setText(String.valueOf(harga));
                            if (cekpesan10 > 0) {
                                pesanan8.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga8.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan10 > 0) {
                                pesanan7.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga7.setText(String.valueOf(harga));
                            }
                        }
                    }else {
                        if (cekpesan9 > 0) {
                            pesanan6.setText("Chocolate x" + pesan9);
                            Integer harga = Integer.parseInt(pesan9) * 10000;
                            harga6.setText(String.valueOf(harga));
                            if (cekpesan10 > 0) {
                                pesanan7.setText("Capuchino Late x" + pesan10);
                                harga = Integer.parseInt(pesan10) * 15000;
                                harga7.setText(String.valueOf(harga));
                            }
                        }else {
                            if (cekpesan10 > 0) {
                                pesanan6.setText("Capuchino Late x" + pesan10);
                                Integer harga = Integer.parseInt(pesan10) * 15000;
                                harga6.setText(String.valueOf(harga));
                            }
                        }
                    }
                }
            }
        }

        String total1 = harga1.getText().toString();
        String total2 = harga2.getText().toString();
        String total3 = harga3.getText().toString();
        String total4 = harga4.getText().toString();
        String total5 = harga5.getText().toString();
        String total6 = harga6.getText().toString();
        String total7 = harga7.getText().toString();
        String total8 = harga8.getText().toString();
        String total9 = harga9.getText().toString();
        String total10 = harga10.getText().toString();
        Integer totalsemua = 0;
        if (!total1.isEmpty()){
            totalsemua += Integer.parseInt(total1);
        }
        if (!total2.isEmpty()){
            totalsemua += Integer.parseInt(total2);
        }
        if (!total3.isEmpty()){
            totalsemua += Integer.parseInt(total3);
        }
        if (!total4.isEmpty()){
            totalsemua += Integer.parseInt(total4);
        }
        if (!total5.isEmpty()){
            totalsemua += Integer.parseInt(total5);
        }
        if (!total6.isEmpty()){
            totalsemua += Integer.parseInt(total6);
        }
        if (!total7.isEmpty()){
            totalsemua += Integer.parseInt(total7);
        }
        if (!total8.isEmpty()){
            totalsemua += Integer.parseInt(total8);
        }
        if (!total9.isEmpty()){
            totalsemua += Integer.parseInt(total9);
        }
        if (!total10.isEmpty()){
            totalsemua += Integer.parseInt(total10);
        }

        tothrg.setText(String.valueOf(totalsemua));
        ket.setText("Pesanan akan dikirimkan ke "+alamat+" atas nama "+nama+" HP: "+nohp);
    }

    public void OnClick(View view) {
        Intent i = new Intent(this,Home.class);
        startActivity(i);
    }
}