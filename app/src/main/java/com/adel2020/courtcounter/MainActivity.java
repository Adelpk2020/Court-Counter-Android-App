package com.adel2020.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
int score;
int scoreb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DisplayForTeamA(int score){
        TextView tv =(TextView)findViewById(R.id.scoreteamA);
        tv.setText(String.valueOf(score));
    }
    public void addThreeTeamA(View view){
        score=score+3;
        DisplayForTeamA(score);
    }
    public void addTowTeamA(View view){
        score=score+2;
        DisplayForTeamA(score);
    }
    public void addoneTeamA(View view){
        score=score+1;
        DisplayForTeamA(score);
    }
    public void DisplayForTeamB(int scoreb){
        TextView tv1 =(TextView)findViewById(R.id.scoreteamB);
        tv1.setText(String.valueOf(scoreb));
    }
    public void addThreeTeamB(View view){
        scoreb=scoreb+3;
        DisplayForTeamB(scoreb);
    }
    public void addTowTeamB(View view){
        scoreb=scoreb+2;
        DisplayForTeamB(scoreb);
    }
    public void addoneTeamB(View view){
        scoreb=scoreb+1;
        DisplayForTeamB(scoreb);
    }
    public void resetscore(View view){
        score=0;
        scoreb=0;
        DisplayForTeamB(scoreb);
        DisplayForTeamA(score);
    }
}
