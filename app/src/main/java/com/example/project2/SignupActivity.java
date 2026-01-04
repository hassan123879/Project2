package com.example.project2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(v -> {
            SharedPreferences sp = getSharedPreferences("USER", MODE_PRIVATE);
            sp.edit()
                    .putString("email", etEmail.getText().toString())
                    .putString("password", etPassword.getText().toString())
                    .apply();

            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
    }
}