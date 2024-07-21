package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BossTest {

  @Test
  public void testSummonMonster() {
    Boss boss = new Boss();
    assertEquals("フェニックス", boss.summonMonster(0));
    assertEquals("ユニコーン", boss.summonMonster(1));
    assertEquals("バハムート", boss.summonMonster(2));
    assertEquals("リヴァイアサン", boss.summonMonster(3));
    assertEquals("神", boss.summonMonster(4));
    assertEquals("不明なボス", boss.summonMonster(-1));
    assertEquals("不明なボス", boss.summonMonster(5));
  }

  @Test
  public void testToString() {
    Boss boss = new Boss();
    String bossName = boss.summonMonster(0);
    int rare = boss.rare;
    boss.name = bossName;
    String expected = bossName + " (特別): レア度[" + rare + "]";
    assertEquals(expected, boss.toString());
  }
}
