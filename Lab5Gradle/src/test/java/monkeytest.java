import static org.junit.jupiter.api.Assertions.*;

import classes.computer;
import classes.monkey;
import org.junit.jupiter.api.Test;

public class monkeytest {
    @Test
    void rollalldice(){
        monkey a = new monkey();
        monkey b = new monkey();

        a.rollAllDice();

        assertFalse(a.toString().equals(b.toString()));
    }
    @Test
    void monkeyplay(){
        monkey a = new monkey();
        monkey b = new monkey();
        assertEquals(a.toString(), b.toString());
        a.monkeyPlay();
        assertEquals(a.toString(), b.toString());
    }
    @Test
    void result(){
        monkey a = new monkey();
        assertEquals("", a.result());
    }
}

