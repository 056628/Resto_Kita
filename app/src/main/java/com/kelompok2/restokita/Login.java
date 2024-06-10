package com.kelompok2.restokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    TextView reg;
    EditText inputemail, inputpassword;
    String email, password;
    Button btnsign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        reg = findViewById(R.id.buatakun);
        inputemail = findViewById(R.id.email);
        inputpassword = findViewById(R.id.password_lgn);
        btnsign = findViewById(R.id.sign);

        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ceklogin();
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, Register.class));
            }
        });
    }

    private void ceklogin() {
        email = inputemail.getText().toString();
        password = inputpassword.getText().toString();

        // Implementasikan logika login Anda di sini
        if (validateCredentials(email, password)) {
            Toast.makeText(Login.this, "Login Sukses", Toast.LENGTH_LONG).show();
            startActivity(new Intent(Login.this, Home.class));
        } else {
            Toast.makeText(Login.this, "Login Gagal", Toast.LENGTH_LONG).show();
        }
    }

    private boolean validateCredentials(String email, String password) {
        // Tambahkan logika validasi kredensial di sini
        // Misalnya, verifikasi dengan server Anda atau periksa kredensial hardcoded untuk keperluan testing
        return "user@example.com".equals(email) && "password123".equals(password);
    }
}
