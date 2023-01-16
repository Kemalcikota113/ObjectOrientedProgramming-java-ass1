package classes;

/**
 * This class allows for the user to change the value of an already randomized
 * value. The user can also pick Which one of the dice to cheat with.
 */
public class DiceGraphicCheating extends Dice {
    /**
     * Allows the user to cheat a dice by setting a new value to it.
     * @param value The value that is beeing set on the cheated dice
     * @return The newly set dice.
     */
    public Dice setRoll(int value) {
        Dice d = new Dice();
        d.lastRoll = value;
        return d;
    }
}
