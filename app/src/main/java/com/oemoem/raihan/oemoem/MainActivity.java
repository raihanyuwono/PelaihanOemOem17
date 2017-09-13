package com.oemoem.raihan.oemoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView btnNext;
    private EditText teamA, teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA = (EditText) findViewById(R.id.in_team_a_name);
        teamB = (EditText) findViewById(R.id.in_team_b_name);

        btnNext = (TextView) findViewById(R.id.btn_next);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Team A", teamA.getText().toString());
                intent.putExtra("Team B", teamB.getText().toString());

                startActivity(intent);
            }
        });

    }
}
