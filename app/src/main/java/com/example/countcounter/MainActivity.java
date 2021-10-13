 package com.example.countcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int SA = 0;
    int SB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(SA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addthreepoint(View v) {
        SA = SA + 3;
        displayForTeamA(SA);
    }

    public void addtwopoint(View v) {
        SA = SA + 2;
        displayForTeamA(SA);
    }

    public void addonepoint(View v) {
        SA = SA + 1;
        displayForTeamA(SA);
    }

    public void reset(View v) {
        SA = 0;
        displayForTeamA(SA);
    }

 //............................................................ ......................................................

    public void displayForTeamB(int number) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(number));
    }
    public void addthreepointB(View K) {
        SB= SB + 3 ;
        displayForTeamB(SB);

    }
    public void addtwopointB(View K) {
        SB= SB + 2 ;
        displayForTeamB(SB);
    }
    public void addonepointB(View K) {
        SB= SB + 1 ;
        displayForTeamB(SB);
    }
    public void resetB(View K){
        SB=0;
        displayForTeamB(SB);
    }
    public void resetAB(View K){
        SA=0;
        SB=0;
        displayForTeamA(SA);
        displayForTeamB(SB);
    }

}