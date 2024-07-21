package org.example;

public class Boss extends Monster {
  @Override
  protected String summonMonster(int mnumber) {
    String[] boss = { "フェニックス", "ユニコーン", "バハムート", "リヴァイアサン", "神" };
    return (mnumber >= 0 && mnumber < boss.length) ? boss[mnumber] : "不明なボス";
  }

  @Override
  public String toString() {
    return this.name + " (特別): レア度[" + this.rare + "]";
  }

  public static void main(String[] args) {
    Boss boss = new Boss();
    System.out.println(boss);
  }
}
