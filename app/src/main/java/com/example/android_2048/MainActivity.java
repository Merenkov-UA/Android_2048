package com.example.android_2048;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent newGameField = new Intent(this, newGameField.class);
        final Intent easy = new Intent(this, easy.class);
        final Intent hard = new Intent(this, hard.class);

        Button standart = findViewById(R.id.standartGame);
        standart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(newGameField);
            }
        });

         Button easyField = findViewById(R.id.easyGame);
        easyField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(easy);
            }
        });

        Button hardField = findViewById(R.id.hardGame);
        hardField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(hard);
            }
        });
    }
}
