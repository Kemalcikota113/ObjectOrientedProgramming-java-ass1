import classes.DicePlayer;
import static org.junit.jupiter.api.Assertions.*;

import classes.computer;
import org.junit.jupiter.api.Test;

public class DicePlayerTest {
    @Test
    void rollalldice(){
        DicePlayer a = new DicePlayer();
        DicePlayer b = new DicePlayer();

        a.rollAllDice();

        assertFalse(a.toString().equals(b.toString()));
    }
    @Test
    void sum(){
        DicePlayer a = new DicePlayer();
        a.rollAllDice();
        assertTrue(a.sum() >= 5);
    }
    @Test
    void dicePlay(){
        DicePlayer a = new DicePlayer();
        DicePlayer b = new DicePlayer();
        assertEquals(a.toString(), b.toString());
        a.rollAllDice();
        assertNotEquals(a.toString(), b.toString());
    }
    @Test
    void hold(){
        DicePlayer a = new DicePlayer();
        DicePlayer b = new DicePlayer();

        for (int i = 0; i < 5; i++) {
            a.hold(i);
        }
        a.rollAllDice();
        assertNotEquals(a, b);
    }
}
