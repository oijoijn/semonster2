package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player("TestPlayer", 100);
        assertEquals("TestPlayer", player.name);
        assertEquals(100, player.hp);
        assertEquals(8, player.getMonsterDeck().size());
    }

    @Test
    public void testToString() {
        Player player = new Player("TestPlayer", 100);
        String playerString = player.toString();
        assertTrue(playerString.contains("Player: TestPlayer"));
        assertTrue(playerString.contains("HP: 100"));
        assertTrue(playerString.contains("Deck:"));
    }

    @Test
    public void testAddMonster() {
        Player player = new Player("TestPlayer", 100);
        Monster extraMonster = new Monster();
        player.addMonster(extraMonster);
        assertEquals(8, player.getMonsterDeck().size()); // Deck size should remain 8
    }
}
