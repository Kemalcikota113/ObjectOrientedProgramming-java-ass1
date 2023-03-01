package classes;

/**
 * This class will roll a dice. It works by simply defining a dice as beeing an object with 6 sides
 * and then giving a random number from 1-6.
 */
public class Dice implements DiceGraphic {
    int lastRoll = 0;

    int sides = 6;

    public Dice () {
        lastRoll = 0;
    }

    /**
     * This is the roll method and will simply pick a number from 1 to 6.
     * @return a random number 1-6.
     */
    public int roll () {
        lastRoll = (int) (Math.random() * sides + 1); 
        return lastRoll;        // Picking random from 1 to 6.
    }

    /**
     * @return a string representation of an int.
     */
    public String toString() {
        return Integer.toString(lastRoll);      // Converts from int to string
    }                                           // Necessery for correct compiling.

    @Override
    public String printGraphic(){
        return graphicDie[lastRoll];
    }
}
