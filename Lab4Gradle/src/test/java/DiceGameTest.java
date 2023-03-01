import classes.DiceGame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DiceGameTest {
    @Test
    void shuno(){
        DiceGame game = new DiceGame();
        assertEquals("", game.shuno());
    }
}
