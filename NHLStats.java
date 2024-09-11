import java.util.*;

public class NHLStats {
    private final List <PlayerRecord> playerRecords;

    //Constructor
    public NHLStats() {
        playerRecords = new List<>();
    }

    //Method to find players with most points and their teams
    public void mostPoints() {
        int maxPoints = 0;
        PlayerRecord player = playerRecords.first();
        //goes through the data once for finding the value of most points
        while (player != null) {
            int points = player.getGoalsScored() + player.getAssists();
            if (maxPoints < points) {
                maxPoints = points;
            }
            player = playerRecords.next();
        }
        player = playerRecords.first();
        //goes through the data again and prints the name and team name of the player that has the most points
        while (player != null) {
            int points = player.getGoalsScored() + player.getAssists();
            if (points == maxPoints) {
                System.out.println(player.getName() + " " + player.getTeamName());
                }
            player = playerRecords.next();
        }
    }

    //Method to find the Most aggressive players, their team and positions
    public void mostAggressive() {
        int maxPenaltyMinutes = 0;
        PlayerRecord player = playerRecords.first();
        while(player != null) {
            int penaltyMinutes = player.getPenaltyMinutes();
            if(maxPenaltyMinutes < penaltyMinutes) {
                maxPenaltyMinutes = penaltyMinutes;
            }
            player = playerRecords.next();
        }
        player = playerRecords.first();
        while(player != null) {
            int penaltyMinutes = player.getPenaltyMinutes();
            if (maxPenaltyMinutes == penaltyMinutes) {
                System.out.println(player.getName() + " " + player.getTeamName() + " " + player.getPosition());
            }
            player = playerRecords.next();
        }
    }

    //Method to find the Most valuable players and their teams
    public void MVP() {
        int maxGoals = 0;
        PlayerRecord player = playerRecords.first();
        while(player != null) {
            int goals = player.getGameWinningGoals();
            if(maxGoals < goals) {
                maxGoals = goals;
            }
            player = playerRecords.next();
        }
        player = playerRecords.first();
        while(player != null) {
            int goals = player.getGameWinningGoals();
            if (maxGoals == goals) {
                System.out.println(player.getName() + " " + player.getTeamName());
            }
            player = playerRecords.next();
        }
    }

    //Method to find the most promising players and their teams
    public void mostPromising() {
        int maxShotsOnGoal = 0;
        PlayerRecord player = playerRecords.first();
        while(player != null) {
            int shotsOnGoal = player.getShotsOnGoal();
            if(maxShotsOnGoal < shotsOnGoal) {
                maxShotsOnGoal = shotsOnGoal;
            }
            player = playerRecords.next();
        }
        player = playerRecords.first();
        while(player != null) {
            int shotsOnGoal = player.getShotsOnGoal();
            if (maxShotsOnGoal == shotsOnGoal) {
                System.out.println(player.getName() + " " + player.getTeamName());
            }
            player = playerRecords.next();
        }
    }

    //Method to find the teams with the most penalty minutes
    public void teamWithMostPenalties() {
        Map<String, Integer> teams = new HashMap<>();
        int maxPenalty = 0;
        PlayerRecord player = playerRecords.first();
        while (player != null) {
            String teamName = player.getTeamName();
            int penaltyMinutes = player.getPenaltyMinutes();
            //getOrDefault referred from https://www.geeksforgeeks.org/hashmap-getordefaultkey-defaultvalue-method-in-java-with-examples/
            //puts the team name and gets the penalty minutes of it and adds the penalty minutes. If it doesn't exist it creates one with default value 0 and adds the penalty minutes
            teams.put(teamName, teams.getOrDefault(teamName, 0) + penaltyMinutes);
            if (maxPenalty < teams.get(teamName)) {
                maxPenalty = teams.get(teamName);
            }
            player = playerRecords.next();
        }
        //for loop referred from https://www.geeksforgeeks.org/how-to-iterate-hashmap-in-java/
        //for loop that goes through all the teams in the HashMap and prints the team name of the team that has the most penalty minutes
        for (Map.Entry<String, Integer> set : teams.entrySet()) {
            if(set.getValue() == maxPenalty) {
                System.out.println(set.getKey());
            }
        }
    }

    //Method to find the teams with most game winning goals
    public void teamWithMostGameWinningGoals() {
        Map<String, Integer> teams = new HashMap<>();
        int maxGoals = 0;
        PlayerRecord player = playerRecords.first();
        while (player != null) {
            String teamName = player.getTeamName();
            int goals = player.getGameWinningGoals();
            teams.put(teamName, teams.getOrDefault(teamName, 0) + goals);
            if (maxGoals < teams.get(teamName)) {
                maxGoals = teams.get(teamName);
            }
            player = playerRecords.next();
        }
        for (Map.Entry<String, Integer> set : teams.entrySet()) {
            if(set.getValue() == maxGoals) {
                System.out.println(set.getKey());
            }
        }
    }

    //adds PlayerRecord object to playerRecords list
    public void addPlayer(PlayerRecord playerRecord){
        playerRecords.add(playerRecord);
    }

}
