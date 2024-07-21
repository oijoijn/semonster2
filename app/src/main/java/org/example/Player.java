package org.example;

import java.util.ArrayList;

public class Player {
    String name;
    int hp;
    ArrayList<Monster> monsterDeck;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.monsterDeck = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        for (int i = 0; i < 8; i++) {
            this.monsterDeck.add(new Monster());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player: ").append(this.name)
          .append(" HP: ").append(this.hp)
          .append("\nDeck:\n");
        for (Monster monster : this.monsterDeck) {
            sb.append(monster).append("\n");
        }
        return sb.toString();
    }

    // For testing purposes
    public void addMonster(Monster monster) {
        if (this.monsterDeck.size() < 8) {
            this.monsterDeck.add(monster);
        }
    }

    public ArrayList<Monster> getMonsterDeck() {
        return this.monsterDeck;
    }

    public static void main(String[] args) {
        Player player = new Player("TestPlayer", 100);
        System.out.println(player);
    }
}


