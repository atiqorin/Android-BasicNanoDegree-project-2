package com.android.atiqorin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score_A =0, score_B =0;
    TextView teamATV;
    TextView teamBTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void change(View v){
        teamATV =(TextView)findViewById(R.id.score_team_a);
        teamBTV = (TextView)findViewById(R.id.score_team_b);
        switch (v.getTag().toString()){


            case "A_add3":
                score_A = score_A +3;
                teamATV.setText(""+ score_A);
                break;
            case "B_add3":
                score_B = score_B +3;
                teamBTV.setText(""+ score_B);
                break;
            case "A_add2":
                score_A = score_A +2;
                teamATV.setText(""+ score_A);
                break;
            case "B_add2":
                score_B = score_B +2;
                teamBTV.setText(""+ score_B);
                break;
            case "A_add1":
                score_A++;
                teamATV.setText(""+ score_A);
                break;
            case "B_add1":
                score_B++;
                teamBTV.setText(""+ score_B);
                break;
            case "reset":
                score_A = 0;
                score_B = 0;
                teamATV.setText(""+ score_A);
                teamBTV.setText(""+ score_B);
        }
    }

}
