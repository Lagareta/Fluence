package com.example.fluencetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuExercice1 extends AppCompatActivity {
    private Button jouer, retour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercice1);
        jouer = (Button) findViewById(R.id.jouer);
        jouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExercice1();
            }
        });
        retour = (Button) findViewById(R.id.retour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtoActivityExercice();
            }
        });
    }

    public void openExercice1(){
        Intent intent = new Intent(this, Exercice1.class);
        startActivity(intent);
    }

    public void backtoActivityExercice(){
        Intent intent = new Intent(this, ActivityExercices.class);
        startActivity(intent);
    }
}