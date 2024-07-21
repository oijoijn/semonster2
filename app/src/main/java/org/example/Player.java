import java.util.ArrayList;
import java.util.List;

// モンスタークラスの定義（仮のものとして例を示します）
class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// プレイヤークラスの定義
public class Player {
    private String name;
    private List<Monster> monsterDeck;

    public Player(String name, List<Monster> monsterDeck) {
        this.name = name;
        this.monsterDeck = monsterDeck;
    }

    public String getName() {
        return name;
    }

    public List<Monster> getMonsterDeck() {
        return monsterDeck;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("'s Deck: ");
        for (Monster monster : monsterDeck) {
            sb.append(monster.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}


