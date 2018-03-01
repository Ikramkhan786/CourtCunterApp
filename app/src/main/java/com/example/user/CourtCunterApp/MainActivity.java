package com.example.user.CourtCunterApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import java.text.*;

public class MainActivity extends AppCompatActivity {
/*
* this enum refers which which team is playing or match has ended
 */
    public Inning getInning()
    {
        return inning;
    }
    enum Inning{
        TEAM_A,TEAM_B,MATCH_OVER
    }
    /*
    * Variables to keep score data of teams
     */
    ScoreKeeper teamA = new ScoreKeeper();
    ScoreKeeper teamB = new ScoreKeeper();

    /*
    * Inning sets for team A
     */
    Inning inning = Inning.TEAM_A;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSetInning(false);
    }

    /*
    * This function executes when Start Inning button pressed
    * This function call function mSetInning with true value
     */
    public void startInning(View view){
        mSetInning(true);
    }

    public void dotBall(View view){
        switch(getInning()){
            case TEAM_A:
                teamA.updateRun(0);
                teamA.updateOver();
                scoreSummaryA();
                overSummaryA();
                runRateSummaryA();
                teamA.isFreeHit();
                statsView("Dottt");
                break;
            case TEAM_B:
                teamB.updateRun(0);
                teamB.updateOver();
                scoreSummaryB();
                overSummaryB();
                runRateSummaryB();
                teamB.isFreeHit();
                statsView("Dottt");
                break;
            case MATCH_OVER:

        }
        isInningOver();
    }

    public void oneRun(View view){
        switch(getInning()){
            case TEAM_A:
                teamA.updateRun(1);
                teamA.updateOver();
                scoreSummaryA();
                overSummaryA();
                runRateSummaryA();
                teamA.isFreeHit();
                statsView("1 Runn..");
                break;
            case TEAM_B:
                teamB.updateRun(1);
                teamB.updateOver();
                scoreSummaryB();
                overSummaryB();
                runRateSummaryB();
                teamB.isFreeHit();
                statsView("1 Runn..");
                break;
            case MATCH_OVER:

        }
        isInningOver();
    }

    public void twoRun(View view){
        switch(getInning()){
            case TEAM_A:
                teamA.updateRun(2);
                teamA.updateOver();
                scoreSummaryA();
                overSummaryA();
                runRateSummaryA();
                teamA.isFreeHit();
                statsView(" 2 Runn..");
                break;
            case TEAM_B:
                teamB.updateRun(2);
                teamB.updateOver();
                scoreSummaryB();
                overSummaryB();
                runRateSummaryB();
                teamB.isFreeHit();
                statsView("2 Runn..");
                break;
            case MATCH_OVER:

        }
        isInningOver();
    }

    public void threeRun(View view){
        switch(getInning()){
            case TEAM_A:
                teamA.updateRun(3);
                teamA.updateOver();
                scoreSummaryA();
                overSummaryA();
                runRateSummaryA();
                teamA.isFreeHit();
                statsView("3 Runnn");
                break;
            case TEAM_B:
                teamB.updateRun(3);
                teamB.updateOver();
                scoreSummaryB();
                overSummaryB();
                runRateSummaryB();
                teamB.isFreeHit();
                statsView("3 Runnn");
                break;
            case MATCH_OVER:
        }
        isInningOver();
    }

    public void FourRun(View view){

        switch(getInning()){
            case TEAM_A:
                teamA.updateRun(4);
                teamA.updateOver();
                scoreSummaryA();
                overSummaryA();
                runRateSummaryA();
                teamA.isFreeHit();
                statsView("FOUR....");
                break;
            case TEAM_B:
                teamB.updateRun(4);
                teamB.updateOver();
                scoreSummaryB();
                overSummaryB();
                runRateSummaryB();
                teamB.isFreeHit();
                statsView("FOUR....");
                break;
            case MATCH_OVER:

        }
        isInningOver();
    }

    public void sixRun(View view){
        switch(getInning()){
            case TEAM_A:
                teamA.updateRun(6);
                teamA.updateOver();
                scoreSummaryA();
                overSummaryA();
                runRateSummaryA();
                teamA.isFreeHit();
                statsView("SIXxxxer");
                break;
            case TEAM_B:
                teamB.updateRun(6);
                teamB.updateOver();
                scoreSummaryB();
                overSummaryB();
                runRateSummaryB();
                teamB.isFreeHit();
                statsView("SIXxxxer");
                break;
            case MATCH_OVER:

        }
        isInningOver();
    }

    public void wicketDown(View view){

        switch(getInning()){
            case TEAM_A:
                teamA.updateWicket();
                teamA.updateOver();
                scoreSummaryA();
                overSummaryA();
                runRateSummaryA();
                if(teamA.getIsFreeHit())
                    statsView("");
                else
                    statsView("That's OUTttttt");
                teamA.isFreeHit();

                break;
            case TEAM_B:
                teamB.updateWicket();
                teamB.updateOver();
                scoreSummaryB();
                overSummaryB();
                runRateSummaryB();
                if(teamB.getIsFreeHit())
                    statsView("");
                else
                    statsView("That's OUTttttt");
                teamB.isFreeHit();
                break;
            case MATCH_OVER:
                break;

        }
        isInningOver();
    }

    public void wideBall(View view){
        switch(getInning()){
            case TEAM_A:
                teamA.updateRun(1);
                scoreSummaryA();
                runRateSummaryA();
                break;
            case TEAM_B:
                teamB.updateRun(1);
                scoreSummaryB();
                runRateSummaryB();
                break;
            case MATCH_OVER:
                break;

        }
        isInningOver();
    }

    public void noBall(View view){
        switch(getInning()){
            case TEAM_A:
                teamA.setIsFreeHit(true);
                teamA.updateRun(1);
                scoreSummaryA();
                runRateSummaryA();
                statsView("Free Hit");
                break;
            case TEAM_B:
                teamB.setIsFreeHit(true);
                teamB.updateRun(1);
                scoreSummaryB();
                runRateSummaryB();
                statsView("Free hit");
                break;
            case MATCH_OVER:
                break;
        }
        isInningOver();
    }

    public void scoreSummaryA(){
        TextView scoreAView = findViewById(R.id.team_a_score_view);
        scoreAView.setText("Score - " + teamA.getScore() + "//" + teamA.getWicket());
    }

    public void overSummaryA(){
        TextView overAView = findViewById(R.id.over_view);
        overAView.setText("Over - " + teamA.getOver() + "." + teamA.getBall());
    }

    public void runRateSummaryA(){
        TextView runRateView = findViewById(R.id.run_rate_view);
        DecimalFormat df = new DecimalFormat("####.##");
        runRateView.setText("Run rate - " + df.format(teamA.getRunRate()));
    }

   /* public void inningOverMsgA(){
        Toast.makeText(this, "Team A Inning has ended", Toast.LENGTH_SHORT).show();
    }*/

    public void scoreSummaryB(){
        TextView scoreAView = findViewById(R.id.team_b_score_view);
        scoreAView.setText("Score - " + teamB.getScore() + "/" + teamB.getWicket());
    }

    public void overSummaryB(){
        TextView overAView = findViewById(R.id.team_b_over_view);
        overAView.setText("Over - " + teamB.getOver() + "." + teamB.getBall());
    }

    public void runRateSummaryB(){
        TextView runRateView = findViewById(R.id.team_b_run_rate_view);
        DecimalFormat df = new DecimalFormat("####.##");
        runRateView.setText("Run rate - " + df.format(teamB.getRunRate()));
    }

    public void statsView(String msg){
        TextView statsTextView = findViewById(R.id.stats_view);
        statsTextView.setText(msg);
    }

    public void isInningOver(){
        if(inning == Inning.TEAM_A && teamA.isInningOver()){
            statsView(" team A's inning ended");
            inning = Inning.TEAM_B;
            mSetInning(false);
        }
        if(inning == Inning.TEAM_B){
            if(teamB.isInningOver()){
                statsView("Team A won");
                inning = Inning.MATCH_OVER;
                mSetInning(false);
            }
            if(teamA.getScore() < teamB.getScore()){
                statsView("Team B won");
                inning = Inning.MATCH_OVER;
                mSetInning(false);
            }
        }
    }

    public void resetScore(View view){
        teamA.resetScore();
        teamB.resetScore();
        scoreSummaryA();
        overSummaryA();
        runRateSummaryA();
        scoreSummaryB();
        overSummaryB();
        runRateSummaryB();
        statsView("");
        inning = Inning.TEAM_A;
        mSetInning(false);
    }

    public void mSetInning(boolean start){
		Button [] scoreButton = new Button[9];
        scoreButton[0] =  findViewById(R.id.dot_ball_button_id);
		scoreButton[1] =  findViewById(R.id.four_run_button_id);
		scoreButton[2] =  findViewById(R.id.no_ball_button_id);
		scoreButton[3] =  findViewById(R.id.one_run_button_id);
		scoreButton[4] =  findViewById(R.id.six_run_button_id);
		scoreButton[5] =  findViewById(R.id.three_run_button_id);
		scoreButton[6] =  findViewById(R.id.two_run_button_id);
		scoreButton[7] =  findViewById(R.id.wicket_button_id);
		scoreButton[8] =  findViewById(R.id.wide_button_id);

		Button startInningButton =  findViewById(R.id.start_inning_button_id);

		if(start){

			for(Button b : scoreButton){
               b.setEnabled(true);
			}

			startInningButton.setEnabled(false);
		}
		else{
			for(Button b : scoreButton){
				b.setEnabled(false);
			}

			startInningButton.setEnabled(true);
		}

    }

}
