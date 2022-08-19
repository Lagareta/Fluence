package com.example.fluencetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityExercices extends AppCompatActivity {
    private Button retour, exercice1, voir_resultats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercices);
        retour = (Button)findViewById(R.id.retour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtoMainActivity();
            }
        });

        exercice1 = (Button)findViewById(R.id.exercice1);
        exercice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExercice1();
            }
        });
        voir_resultats = (Button)findViewById(R.id.voir_resultats);
        voir_resultats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFinalActivity();
            }
        });
    }

    public void backtoMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void openExercice1(){
        Intent intent = new Intent(this, MenuExercice1.class);
        startActivity(intent);
    }

    public void openFinalActivity(){
        Intent intent = new Intent(this, FinalActivity.class);
        startActivity(intent);
    }

}