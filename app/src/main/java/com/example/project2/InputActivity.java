package com.example.project2;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent(this, ResultActivity.class);
        BreakIterator etYear;

        BreakIterator etName = null;
        Intent name = i.putExtra("name", etName.getText().toString());


        boolean year = false;
        i.putExtra("year", year);
        startActivity(i);

    }
}