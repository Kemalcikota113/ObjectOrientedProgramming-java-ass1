import classes.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    void roll (){
        Dice d = new Dice();
        d.roll();
        assertFalse(d.toString().equals("0"));
    }
    @Test
    void DiceGraphic(){
        Dice d = new Dice();
        assertTrue(d.printGraphic().equals(" "));
    }


}
