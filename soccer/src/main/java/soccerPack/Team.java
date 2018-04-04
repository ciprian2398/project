package soccerPack;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> playerList;

    public Team(String name) {
        this.name = name;
        playerList = new ArrayList<Player>();
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void showPlayers(){
        System.out.println(this.name);
        for (Player player : playerList) {
            System.out.println("\t"+player.getName());
        }
    }
}
