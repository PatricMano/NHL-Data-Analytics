import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class NHLListDemo {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        NHLStats stats = new NHLStats();
        System.out.print("Enter the filename to read from: ");
        String filename = in.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        //goes through every line on the text file and assigns each word using StringTokenizer
        while(inputFile.hasNextLine()) {
            String input = inputFile.nextLine();
            StringTokenizer token = new StringTokenizer(input, "\t");
            String name = token.nextToken();
            String position = token.nextToken();
            String teamName = token.nextToken();
            int gamesPlayed = Integer.parseInt(token.nextToken());
            int goalsScored = Integer.parseInt(token.nextToken());
            int assists = Integer.parseInt(token.nextToken());
            int penaltyMinutes = Integer.parseInt(token.nextToken());
            int shotsOnGoal = Integer.parseInt(token.nextToken());
            int gameWinningGoals = Integer.parseInt(token.nextToken());

            //Puts all the data read in player
            PlayerRecord player = new PlayerRecord(name, position, teamName, gamesPlayed, goalsScored, assists, penaltyMinutes, shotsOnGoal, gameWinningGoals);
            //Adds all the data in player to stats
            stats.addPlayer(player);
        }

        //Prints all the data
        System.out.println("NHL Results Summary\n");

        System.out.println("Players with highest points and their teams:");
        stats.mostPoints();
        System.out.println("\n");

        System.out.println("Most aggressive players, their teams and their positions:");
        stats.mostAggressive();
        System.out.println("\n");

        System.out.println("Most valuable players and their teams:");
        stats.MVP();
        System.out.println("\n");

        System.out.println("Most promising players and their teams:");
        stats.mostPromising();
        System.out.println("\n");

        System.out.println("Teams that had the most number of penalty minutes:");
        stats.teamWithMostPenalties();
        System.out.println("\n");

        System.out.println("Teams that had the most number of game winning goals:");
        stats.teamWithMostGameWinningGoals();

    }
}
