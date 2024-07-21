package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class SeMonsterGameTest {

    @Test
    public void testAddPlayer() {
        SeMonsterGame game = new SeMonsterGame();
        game.addPlayer("TestPlayer", 100);
        assertTrue(game.players.containsKey("TestPlayer"));
        assertEquals(100, game.players.get("TestPlayer").hp);
    }

    @Test
    public void testDraw() {
        SeMonsterGame game = new SeMonsterGame();
        game.addPlayer("TestPlayer", 100);
        int initialDeckSize = game.players.get("TestPlayer").getMonsterDeck().size();
        game.draw("TestPlayer");
        int newDeckSize = game.players.get("TestPlayer").getMonsterDeck().size();
        assertEquals(initialDeckSize, newDeckSize); // Deck size should remain 8
    }
}
