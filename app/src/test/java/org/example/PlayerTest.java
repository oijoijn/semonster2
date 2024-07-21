package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;



public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player("TestPlayer");
        assertEquals("TestPlayer", player.name);
        assertEquals(8, player.getMonsterDeck().size());
    }

    @Test
    public void testToString() {
        Player player = new Player("TestPlayer");
        String playerString = player.toString();
        assertTrue(playerString.contains("Player: TestPlayer"));
        assertTrue(playerString.contains("Deck:"));
    }

    @Test
    public void testAddMonster() {
        Player player = new Player("TestPlayer");
        Monster extraMonster = new Monster();
        player.addMonster(extraMonster);
        assertEquals(8, player.getMonsterDeck().size()); // Deck size should remain 8
    }
}
