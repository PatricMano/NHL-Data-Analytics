public class PlayerRecord {
    private String name;
    private String position;
    private String teamName;
    private int gamesPlayed;
    private int goalsScored;
    private int assists;
    private int penaltyMinutes;
    private int shotsOnGoal;
    private int gameWinningGoals;

    //Constructor
    public PlayerRecord (String name, String position, String teamName, int gamesPlayed, int goalsScored, int assists, int penaltyMinutes, int shotsOnGoal, int gameWinningGoals){
        this.name = name;
        this.position = position;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.penaltyMinutes = penaltyMinutes;
        this.shotsOnGoal = shotsOnGoal;
        this.gameWinningGoals = gameWinningGoals;
    }

    //All the getters
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public int getPenaltyMinutes() {
        return penaltyMinutes;
    }

    public int getShotsOnGoal() {
        return shotsOnGoal;
    }

    public int getGameWinningGoals() {
        return gameWinningGoals;
    }

}
