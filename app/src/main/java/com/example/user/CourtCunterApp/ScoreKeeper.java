package com.example.user.CourtCunterApp;

import java.io.Serializable;

/**
 * Created by user on 27-02-2018.
 */

public class ScoreKeeper implements Serializable {
    /*
     *Global variable for keeping recode of score and wicket.
     */
    private int score = 0; //for storing current score
    private int wicket = 0; //for storing current wickets
    private int over = 0; //for storing over details
    private int ball = 0; //for storing ball no. of the over
    private float runRate = 0; //for storing current run rate
    private boolean isFreeHit = false; //for verify if the current ball is free hit or not
    //private boolean isFirstInning = true; //for verify which team is playing
    private final int MAX_WICKET = 10;
    private final int MAX_OVER = 20;
    private final int MAX_BALL = 6;

    public void setIsFreeHit(boolean isFreeHit) {
        this.isFreeHit = isFreeHit;
    }

    public boolean getIsFreeHit() {
        return isFreeHit;
    }

    public void isFreeHit() {
        if (isFreeHit)
            isFreeHit = false;
    }

    public float getRunRate() {
        if (over == 0 && ball == 0) {
            runRate = 0;
        } else {
            runRate = (float) score / (over + (float) ball / 6);
        }
        return runRate;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getOver() {
        return over;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public int getBall() {
        return ball;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public int getWicket() {
        return wicket;
    }

    public void updateRun(int run) {
        score += run;
    }

    public void updateWicket() {
        if (!isFreeHit) {
            wicket++;
        }
    }

    public void updateOver() {
        ball++;
        if (ball == MAX_BALL) {
            over++;
            ball = 0;
        }
    }

    public boolean isInningOver() {
        if (over == MAX_OVER || wicket == MAX_WICKET) {
            return true;
        }
        return false;
    }

    /*
    * This message invoked when user click reset button
    * This method reset the score data
    */
    public void resetScore() {
        score = 0;
        wicket = 0;
        over = 0;
        ball = 0;
        isFreeHit = false;
    }

}
