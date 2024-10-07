package com.g2.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatisticProgress {
    private Integer PlayerID;

    @JsonProperty("statistic")
    private int StatisticID;

    private float Progress;

    public StatisticProgress(Integer playerID, int statistic, float progress) {
        PlayerID = playerID;
        StatisticID = statistic;
        Progress = progress;
    }

    public StatisticProgress() {

    }

    public Integer getPlayerID() {
        return PlayerID;
    }

    public void setPlayerID(Integer playerID) {
        PlayerID = playerID;
    }

    public int getStatisticID() {
        return StatisticID;
    }

    public void setStatisticID(int category) {
        StatisticID = category;
    }

    public float getProgress() {
        return Progress;
    }

    public void setProgress(float progress) {
        Progress = progress;
    }

    @Override
    public String toString() {
        return "StatisticProgress{" +
                "PlayerID=" + PlayerID +
                ", Statistic=" + StatisticID +
                ", Progress=" + Progress +
                '}';
    }
}
