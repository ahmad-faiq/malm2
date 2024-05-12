package com.example.malm2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btpindah1 = findViewById(R.id.button4);
        Button btpindah2 = findViewById(R.id.button5);
        Button btpindah3 = findViewById(R.id.button11);
        btpindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(pindah1);
            }
        });
        btpindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(pindah2);
            }
        });

        btpindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah3 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(pindah3);
            }
        });
    }
}