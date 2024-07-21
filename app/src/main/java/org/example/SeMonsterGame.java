package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SeMonsterGame {
    Map<String, Player> players;

    public SeMonsterGame() {
        players = new HashMap<>();
    }

    public void addPlayer(String playerName, int hp) {
        if (!players.containsKey(playerName)) {
            players.put(playerName, new Player(playerName, hp));
        }
    }

    public void draw(String playerName) {
        Player player = players.get(playerName);
        if (player != null) {
            player.addMonster(new Monster());
        }
    }

    public static void main(String[] args) {
        SeMonsterGame game = new SeMonsterGame();
        game.addPlayer("Player1", 100);
        game.addPlayer("Player2", 150);
        
        System.out.println(game.players.get("Player1"));
        System.out.println(game.players.get("Player2"));
        
        game.draw("Player1");
        System.out.println(game.players.get("Player1"));
    }
}
