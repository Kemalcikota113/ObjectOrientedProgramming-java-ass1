import classes.DiceGame2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceGameTest2 {
    @Test
    void shuno(){
        DiceGame2 game = new DiceGame2();
        assertEquals("", game.shuno());
    }
}
