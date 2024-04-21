package com.example.utsmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ResetPassword extends AppCompatActivity {

    private EditText editTextConfirmPassword, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        // Inisialisasi elemen UI
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        editTextPassword = findViewById(R.id.editTextPassword);
        Button loginButton = findViewById(R.id.loginButton);

        // Memberikan aksi klik pada tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan input username dan password dari pengguna
                String confirmpassword = editTextConfirmPassword.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Memeriksa apakah input tidak kosong
                if (!confirmpassword.isEmpty() && !password.isEmpty()) {
                    // Jika sesuai, arahkan ke halaman utama aplikasi
                    Intent intent = new Intent(ResetPassword.this, LoginActivity.class);
                    startActivity(intent);
                } else {
                    // Jika ada input yang kosong, tampilkan pesan kesalahan
                    Toast.makeText(ResetPassword.this, "Please enter New Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
