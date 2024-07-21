package org.example;

import java.util.Random;

public class Monster {
    String name;
    int rare; // 0:normal, 1:uncommon, 2:rare, 3:ultra rare, 4:legendary

    // デフォルトコンストラクタ
    Monster() {
        Random random = new Random();
        this.rare = random.nextInt(5);
        this.name = this.summonMonster(random.nextInt(5));
        this.evolve();
    }

    // 名前とレア度を指定するコンストラクタ
    Monster(String name, int rare) {
        this.name = name;
        this.rare = rare;
        this.evolve();
    }

    // モンスターの召喚処理
    String summonMonster(int mnumber) {
        String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
        if (mnumber >= 0 && mnumber < monsters.length) {
            return monsters[mnumber];
        } else {
            return "不明なモンスター";
        }
    }

    // 進化処理
    void evolve() {
        if (this.rare >= 3) {
            this.name += " (進化)";
        }
    }

    @Override
    public String toString() {
        return this.name + ":レア度[" + this.rare + "]";
    }

    // public static void main(String[] args) {
    //     // デフォルトコンストラクタのテスト
    //     Monster defaultMonster = new Monster();
    //     System.out.println(defaultMonster);

    //     // 名前とレア度を指定するコンストラクタのテスト
    //     Monster specificMonster = new Monster("ドラゴン", 4);
    //     System.out.println(specificMonster);
    // }
}
