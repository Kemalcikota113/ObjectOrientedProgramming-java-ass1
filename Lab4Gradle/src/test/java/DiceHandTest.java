import classes.Dice;
import classes.DiceHand;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DiceHandTest {
    @Test
    void roll(){
        DiceHand a = new DiceHand(1);
        DiceHand b = new DiceHand(1);
        assertEquals(a.toString(), b.toString());
        a.roll(1);
        assertNotEquals(a.toString(), b.toString());

    }
    @Test
    void rollalldice(){
        DiceHand a = new DiceHand(5);
        DiceHand b = new DiceHand(5);
        assertEquals(a.toString(), b.toString());
        a.rollAllDice();
        assertNotEquals(a.toString(), b.toString());
    }
}