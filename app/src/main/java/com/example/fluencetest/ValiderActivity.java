package com.example.fluencetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class ValiderActivity extends AppCompatActivity {
    private Button oui, non, suite;
    private int n;
    private TextView rep_oui1, rep_non1, question;
    Intent rou = getIntent();
    boolean test = rou.hasExtra("test");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valider);
        question = (TextView) findViewById(R.id.textView4);
        question.setVisibility(View.VISIBLE);
        rep_oui1 = (TextView) findViewById(R.id.rep_oui);
        rep_oui1.setVisibility(View.INVISIBLE);
        oui = (Button) findViewById(R.id.oui);
        rep_non1 = (TextView) findViewById(R.id.rep_non);
        rep_non1.setVisibility(View.INVISIBLE);
        non = (Button) findViewById(R.id.non);
        suite = (Button) findViewById(R.id.suite);
        suite.setVisibility(View.INVISIBLE);
        suite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               backtoMenuExercice1();
            }
        });



        oui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (test){
                    rep_oui1.setVisibility(View.VISIBLE);
                    rep_non1.setVisibility(View.INVISIBLE);
                    question.setVisibility(View.INVISIBLE);
                    suite.setVisibility(View.VISIBLE);

                }
                else{
                    rep_non1.setVisibility(View.VISIBLE);
                    rep_oui1.setVisibility(View.INVISIBLE);
                    question.setVisibility(View.INVISIBLE);
                    suite.setVisibility(View.VISIBLE);

                }


            }
        });

        non.setOnClickListener(new View.OnClickListener() {         //si les mots sont égaux, faire...
            @Override
            public void onClick(View v) {
                if (!test) {
                    rep_non1.setVisibility(View.VISIBLE);
                    rep_oui1.setVisibility(View.INVISIBLE);
                    question.setVisibility(View.INVISIBLE);
                    suite.setVisibility(View.VISIBLE);

                }
                else{
                    rep_oui1.setVisibility(View.VISIBLE);
                    rep_non1.setVisibility(View.INVISIBLE);
                    question.setVisibility(View.INVISIBLE);
                    suite.setVisibility(View.VISIBLE);

                }


            }
        });

    }


    public void backtoMenuExercice1() {
        Intent intent = new Intent(this, MenuExercice1.class);
        startActivity(intent);
    }


}