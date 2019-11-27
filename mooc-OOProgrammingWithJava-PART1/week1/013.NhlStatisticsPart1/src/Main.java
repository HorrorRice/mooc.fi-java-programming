import java.util.Scanner;
import nhlstats.NHLStatistics;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

      
        System.out.println("Top 10 players based on goals: \n");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\n\nTop 25 players based on penalties amount: \n");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("\n\nStatistics of Sideny Crosby: \n");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("\n\nStatistics of Philadelphia Flyers: \n");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("\n\nStatistics of Anaheim Ducks: \n");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
            
            
    }
}
