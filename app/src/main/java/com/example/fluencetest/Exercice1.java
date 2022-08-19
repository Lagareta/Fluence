package com.example.fluencetest;


import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercice1 extends AppCompatActivity {
    private TextView t3,t2,t1,m1,m2;
    private boolean issame;
    private String modifier_text;
    private int lv_mot = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice1);

        t1 = (TextView) findViewById(R.id.text1);           //compte à rebours à faire
        t1.setVisibility(View.INVISIBLE);
        t2 = (TextView) findViewById(R.id.text2);
        t2.setVisibility(View.INVISIBLE);
        t3 = (TextView) findViewById(R.id.text3);
        t3.setVisibility(View.VISIBLE);
        m1 = (TextView) findViewById(R.id.mot1);
        m2 = (TextView)findViewById(R.id.mot2);

        ArrayList<Mot> liste = new ArrayList<Mot>();
        int lv_mot = 2;
        liste = Mot.get_liste(lv_mot);
        int choix_mot = (int)(Math.random() * liste.size());
        Mot word = liste.get(choix_mot);
        m1.setText(word.word);
        String word2 = word.switch_letter(1);
        m2.setText(word2);
        issame = word.test(word2);


        Timer timer = new Timer();
        long delay = 3000;
        TimerTask ButtonSpawn = new TimerTask() {
            @Override
            public void run() {
                openValiderActivity();
            }
        };
        for (long i = 3000; i > 0; i=i-1000) {
            if (i == 3000) {
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.INVISIBLE);
            }
            if (i == 2000) {
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.INVISIBLE);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.print("Erreur");
            }
        }
        timer.schedule(ButtonSpawn, delay);



    }


    public void openValiderActivity(){
        Intent intent = new Intent(this, ValiderActivity.class);
        intent.putExtra("test",issame);
        startActivity(intent);
    }


}

