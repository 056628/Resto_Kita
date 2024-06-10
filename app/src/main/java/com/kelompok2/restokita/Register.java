package com.kelompok2.restokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    EditText inp_email, inp_nama, pass1, pass2, inp_phone;
    String email, nama, phone, password1, password2;
    Button btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        inp_email = findViewById(R.id.email_reg);
        inp_nama = findViewById(R.id.nama);
        pass1 = findViewById(R.id.pw);
        pass2 = findViewById(R.id.confirm);
        inp_phone = findViewById(R.id.phone);
        btnsignup = findViewById(R.id.register);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }

    private void register() {
        email = inp_email.getText().toString();
        nama = inp_nama.getText().toString();
        phone = inp_phone.getText().toString();
        password1 = pass1.getText().toString();
        password2 = pass2.getText().toString();

        // Implementasikan logika registrasi Anda di sini
        if (validateRegistration(email, nama, phone, password1, password2)) {
            Toast.makeText(Register.this, "Registrasi Sukses", Toast.LENGTH_LONG).show();
            startActivity(new Intent(Register.this, Login.class));
        } else {
            Toast.makeText(Register.this, "Registrasi Gagal", Toast.LENGTH_LONG).show();
        }
    }

    private boolean validateRegistration(String email, String nama, String phone, String password1, String password2) {
        // Tambahkan logika validasi registrasi di sini
        // Misalnya, verifikasi dengan server Anda atau periksa data hardcoded untuk keperluan testing
        return !email.isEmpty() && !nama.isEmpty() && !phone.isEmpty() && password1.equals(password2);
    }
}
