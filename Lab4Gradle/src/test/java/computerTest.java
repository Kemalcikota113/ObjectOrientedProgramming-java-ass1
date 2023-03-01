
import classes.computer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class computerTest {
    @Test
    void rollalldice() {
        computer a = new computer();
        computer b = new computer();

        a.rollAllDice();

        assertFalse(a.toString().equals(b.toString()));
    }

    @Test
    void computerplay() {
        computer a = new computer();
        computer b = new computer();
        assertEquals(a.toString(), b.toString());
        a.computerplay();
        a.rollAllDice();
        assertEquals(a.toString(), b.toString());
    }
    @Test
    void result(){
        computer a = new computer();
        assertEquals("", a.result());
    }
}
