package com.example.malm2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btpindah1 = findViewById(R.id.button6);
        Button btpindah2 = findViewById(R.id.button7);
        Button btpindah3 = findViewById(R.id.button12);
        btpindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(pindah1);
            }
        });
        btpindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(pindah2);
            }
        });
        btpindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah3 = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(pindah3);
            }
        });

    }
}