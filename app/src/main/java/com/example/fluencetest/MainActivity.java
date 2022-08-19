package com.example.fluencetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button jouer, bibliothèque;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jouer = (Button) findViewById(R.id.jouer);
        jouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityExercices();
            }
        });

        bibliothèque = (Button)findViewById(R.id.bureau_du_prof);
        bibliothèque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBibliotheque();
            }
        });
    }

    public void openActivityExercices(){
        Intent intent = new Intent(this,ActivityExercices.class);
        startActivity(intent);
    }

    public void openActivityBibliotheque(){
        Intent intent = new Intent(this,ActivityBibliotheque.class);
        startActivity(intent);
    }

}