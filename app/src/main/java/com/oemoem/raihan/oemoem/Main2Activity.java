package com.oemoem.raihan.oemoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.oemoem.raihan.oemoem.R.id.team_b_name;

public class Main2Activity extends AppCompatActivity {

    private TextView nameA, nameB;
    private TextView scoreA, scoreB;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intent = getIntent();

        nameA = (TextView) findViewById(R.id.team_a_name);
        nameB = (TextView) findViewById(R.id.team_b_name);

        scoreA = (TextView) findViewById(R.id.team_a_score);
        scoreB = (TextView) findViewById(R.id.team_b_score);

        nameA.setText(intent.getStringExtra("Team A"));
        nameB.setText(intent.getStringExtra("Team B"));
    }

    public void addPoint(View v) {
        switch (v.getId()) {
            case R.id.team_a_add_3:
                addPoint(false, 3);
                break;
            case R.id.team_a_add_2:
                addPoint(false, 2);
                break;
            case R.id.team_a_add_1:
                addPoint(false, 1);
                break;
            case R.id.team_b_add_3:
                addPoint(true, 3);
                break;
            case R.id.team_b_add_2:
                addPoint(true, 2);
                break;
            case R.id.team_b_add_1:
                addPoint(true, 1);
                break;
            default:
                break;
        }
    }

    private void addPoint(boolean team, int score) {
        if (!team)
            scoreA.setText(String.valueOf(Integer.valueOf(scoreA.getText().toString()) + score));
        else scoreB.setText(String.valueOf(Integer.valueOf(scoreB.getText().toString()) + score));
    }
}
