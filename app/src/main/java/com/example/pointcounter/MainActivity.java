
 package com.example.pointcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementByThreeA(view);
            }
        });


        Button b2=(Button) findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementByTwoA(view);
            }
        });


        Button b3=(Button) findViewById(R.id.button3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementByOneA(view);
            }
        });


        Button b21=(Button) findViewById(R.id.buttonB3);

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementByThreeB(view);
            }
        });



        Button b22=(Button) findViewById(R.id.buttonB2);

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementByTwoB(view);
            }
        });


        Button b23=(Button) findViewById(R.id.buttonB1);

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementByOneB(view);
            }
        });


        Button rstButton=(Button) findViewById(R.id.button4);

        rstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset(view);
            }
        });


    }

        private int teamA=0;
        private int teamB=0;
        //    this method will be called when +3 point button tapped
        public void incrementByThreeA(View view)
        {
            teamA=teamA+3;
            displayForTeamA(teamA);
            displayForTeamB(teamB);
        }
        //   this will called for +2 points
        public void incrementByTwoA(View view)
        {
            teamA=teamA+2;
            displayForTeamA(teamA);
            displayForTeamB(teamB);
        }
        //    this method will be called when free throw will be called
        public void incrementByOneA(View view)
        {
            teamA=teamA+1;
            displayForTeamA(teamA);
            displayForTeamB(teamB);
        }


        //reset button
    private void reset(View view) {
            if(teamA>teamB)
            {
                Toast.makeText(this, "Winner : Team A ", Toast.LENGTH_SHORT).show();
            }
            if(teamB>teamA)
            {
                Toast.makeText(this, "Winner : Team B ", Toast.LENGTH_SHORT).show();
            }
            if(teamA==teamB)
            {
                Toast.makeText(this, "Tie", Toast.LENGTH_SHORT).show();
            }
            teamA = 0;
            teamB = 0;
            displayForTeamA(teamA);
            displayForTeamB(teamB);
        }


    public void incrementByThreeB(View view)
    {
        teamB=teamB+3;
        displayForTeamA(teamA);
        displayForTeamB(teamB);
    }
    //   this will called for +2 points
    public void incrementByTwoB(View view)
    {
        teamB=teamB+2;
        displayForTeamA(teamA);
        displayForTeamB(teamB);
    }
    //    this method will be called when free throw will be called
    public void incrementByOneB(View view)
    {
        teamB=teamB+1;
        displayForTeamA(teamA);
        displayForTeamB(teamB);
    }
        public void displayForTeamA(int score) {
            TextView scoreViewA = (TextView) findViewById(R.id.TeamAScore_text_view);
            scoreViewA.setText(String.valueOf(score));
        }
        public void displayForTeamB(int score) {
            TextView scoreViewB = (TextView) findViewById(R.id.TeamBScore_text_view);
            scoreViewB.setText(String.valueOf(score));
        }








    }
