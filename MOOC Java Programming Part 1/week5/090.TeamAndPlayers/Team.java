
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Team {

    private String teamName;
    private int maxTeamSize;
    private ArrayList<Player> playerList = new ArrayList<Player>();

    public Team(String teamName) {
        this.teamName = teamName;
        this.maxTeamSize = 16;
    }

    public String getName() {
        return teamName;
    }

    public void setMaxSize(int maxSize) {
        maxTeamSize = maxSize;
    }

    public int size() {
        return playerList.size();
    }

    public void addPlayer(Player newPlayers) {
         if (size() >= this.maxTeamSize) {
            return;
        }
 
        this.playerList.add(newPlayers);
    }

    public void printPlayers() {
        System.out.println(teamName);
        for (Player each : playerList) {
            System.out.println("Player: " + each);
        }
    }

    public int goals() {
        int goals = 0;
        for (Player each : playerList) {
            goals += each.goals();
        }
        return goals;
    }

}
