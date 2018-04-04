package soccerPack;

public class Goal {
    private String scoredTeamName;
    private String scoredPlayerName;
    private double time;

    public Goal(String scoredTeamName, String scoredPlayerName, double time) {
        this.scoredTeamName = scoredTeamName;
        this.scoredPlayerName = scoredPlayerName;
        this.time = time;
    }

    @Override
    public String toString() {
        return time+"\t "+scoredTeamName+"\t "+scoredPlayerName;
    }

    public String getScoredTeamName() {
        return scoredTeamName;
    }

    public void setScoredTeamName(String scoredTeamName) {
        this.scoredTeamName = scoredTeamName;
    }

    public String getScoredPlayerName() {
        return scoredPlayerName;
    }

    public void setScoredPlayerName(String scoredPlayerName) {
        this.scoredPlayerName = scoredPlayerName;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
