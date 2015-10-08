package id.hariskucing.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView TVSCA;
    private TextView TVSCB;
    private Button btn3pointsa;
    private Button btn3pointsb;
    private Button btn2pointsa;
    private Button btn2pointsb;
    private Button btnfreethrowa;
    private Button btnfreethrowb;
    private Button btnreset;
    private int scoreteamA;
    private int scoreteamB;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        TVSCA = (TextView) findViewById(R.id.tv_score_A);
        TVSCB = (TextView) findViewById(R.id.tv_score_B);
        btn3pointsa = (Button) findViewById(R.id.btn_3points_a);
        btn2pointsa = (Button) findViewById(R.id.btn_2points_a);
        btnfreethrowa = (Button) findViewById(R.id.btn_freethrow_a);
        btn3pointsb = (Button) findViewById(R.id.btn_3points_b);
        btn2pointsb = (Button) findViewById(R.id.btn_2points_b);
        btnfreethrowb = (Button) findViewById(R.id.btn_freethrow_b);
        btnreset = (Button) findViewById(R.id.btn_reset);
        scoreteamA = scoreteamB = 0;

        btn3pointsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(3);
            }
        });
        btn2pointsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(2);
            }
        });
        btnfreethrowa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(1);
            }
        });
        btn3pointsb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamB(3);
            }
        });
        btn2pointsb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamB(2);
            }
        });
        btnfreethrowb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamB(1);
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreteamA = scoreteamB;
                TVSCA.setText(scoreteamA + "");
                TVSCB.setText(scoreteamB + "");

            }
        });
    }

        private void addPointToTeamA (int point) {
    scoreteamA += point;
    TVSCA.setText (scoreteamA);
    }

    private void addPointToTeamB (int point) {
        scoreteamB += point;
        TVSCA.setText (scoreteamB);
    }






    }



