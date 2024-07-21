
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

// プレイヤークラスのテスト
public class PlayerTest {

    @Test
    public void testPlayerToString() {
        // モンスターのリストを作成
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Monster("Dragon"));
        monsters.add(new Monster("Goblin"));
        monsters.add(new Monster("Wizard"));
        monsters.add(new Monster("Elf"));
        monsters.add(new Monster("Orc"));
        monsters.add(new Monster("Knight"));
        monsters.add(new Monster("Troll"));
        monsters.add(new Monster("Fairy"));
        
        // プレイヤーを作成
        Player player = new Player("Alice", monsters);
        
        // 期待する文字列を定義
        String expected = "Alice's Deck: Dragon Goblin Wizard Elf Orc Knight Troll Fairy";
        
        // プレイヤーのtoString()メソッドをテスト
        assertEquals(expected, player.toString());
    }
}


