package com.example.android.courtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int nigeriaScore = 0;
    int argentinaScore = 0;
    int nigeriaYellow = 0;
    int nigeriaRed = 0;
    int argentinaRed = 0;
    int argentinaYellow = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nigeriaGoal(View v){

        nigeriaScore = nigeriaScore + 1;
        displayNigeriaScore(nigeriaScore);

    }

    public void nigeriaYellow(View v){
        nigeriaYellow = nigeriaYellow + 1;
        displayNigeriaYellow(nigeriaYellow);
    }

    public void nigeriaRed(View v){
        nigeriaRed = nigeriaRed + 1;
        displayNigeriaRed(nigeriaRed);
    }

    public void argentinaGoal(View v){
       argentinaScore = argentinaScore + 1;
        displayArgentinaScore(argentinaScore);
    }

    public void argentinaYellow(View v){
        argentinaYellow = argentinaYellow + 1;
        displayArgentinaYellow(argentinaYellow);
    }

    public void argentinaRedCard(View v){
        argentinaRed = argentinaRed + 1;
        displayArgentinaRed(argentinaRed);
    }


    public void displayArgentinaScore(int score){

        TextView scoreView = (TextView) findViewById(R.id.score_argentina);
        scoreView.setText(String.valueOf(score));

    }

    public void displayNigeriaScore(int score){
        TextView scoreView = (TextView) findViewById(R.id.score_nigeria);
        scoreView.setText(String.valueOf(score));
    }

    public void displayNigeriaRed(int card){
        TextView redCard = (TextView) findViewById(R.id.red_nigeria);
        redCard.setText(String.valueOf(card));
    }

    public void displayArgentinaRed(int card){
        TextView redCard = (TextView) findViewById(R.id.red_argentina);
        redCard.setText(String.valueOf(card));
    }

    public void displayNigeriaYellow(int card){
        TextView yellowCard = (TextView) findViewById(R.id.yellow_nigeria);
        yellowCard.setText(String.valueOf(card));
    }

    public void displayArgentinaYellow(int card){
        TextView yellowCard = (TextView) findViewById(R.id.yellow_argentina);
        yellowCard.setText(String.valueOf(card));
    }
}
