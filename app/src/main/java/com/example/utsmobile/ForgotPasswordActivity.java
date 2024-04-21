package com.example.utsmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    private EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        /* Inisialisasi elemen UI */
        editTextEmail = findViewById(R.id.editTextEmail);
        Button loginButton = findViewById(R.id.loginButton);

        // Memberikan aksi klik pada tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ForgotPasswordActivity.this, ResetPassword.class);
                startActivity(intent);


            }
        });
    }
}
