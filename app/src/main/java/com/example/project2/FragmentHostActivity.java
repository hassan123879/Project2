package com.example.project2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.project2.R;
import com.example.project2.BlueFragment;
import com.example.project2.GreenFragment;
import com.example.project2.RedFragment;

public class FragmentHostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_fragment_host);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnRed = findViewById(R.id.btnRed);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnGreen = findViewById(R.id.btnGreen);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnBlue = findViewById(R.id.btnBlue);

        btnRed.setOnClickListener(v -> loadFragment(new RedFragment()));
        btnGreen.setOnClickListener(v -> loadFragment(new GreenFragment()));
        btnBlue.setOnClickListener(v -> loadFragment(new BlueFragment()));
    }

    private void loadFragment(Fragment f) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, f)
                .commit();
    }
}
